package typings.naja.anon

import typings.naja.distCoreSnippetHandlerMod.SnippetUpdateOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeOperation extends StObject {
  
  def changeOperation(value: SnippetUpdateOperation): Unit
  
  var content: String
  
  var fromCache: Boolean
  
  def operation(snippet: typings.std.Element, content: String): Unit
  @JSName("operation")
  var operation_Original: SnippetUpdateOperation
  
  var options: typings.naja.distNajaMod.Options
  
  var snippet: typings.std.Element
}
object ChangeOperation {
  
  inline def apply(
    changeOperation: SnippetUpdateOperation => Unit,
    content: String,
    fromCache: Boolean,
    operation: (/* snippet */ typings.std.Element, /* content */ String) => Unit,
    options: typings.naja.distNajaMod.Options,
    snippet: typings.std.Element
  ): ChangeOperation = {
    val __obj = js.Dynamic.literal(changeOperation = js.Any.fromFunction1(changeOperation), content = content.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], operation = js.Any.fromFunction2(operation), options = options.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeOperation]
  }
  
  extension [Self <: ChangeOperation](x: Self) {
    
    inline def setChangeOperation(value: SnippetUpdateOperation => Unit): Self = StObject.set(x, "changeOperation", js.Any.fromFunction1(value))
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: (/* snippet */ typings.std.Element, /* content */ String) => Unit): Self = StObject.set(x, "operation", js.Any.fromFunction2(value))
    
    inline def setOptions(value: typings.naja.distNajaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSnippet(value: typings.std.Element): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
  }
}
