package typings.naja.anon

import typings.naja.snippetHandlerMod.SnippetUpdateOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: String
  
  var fromCache: Boolean
  
  def operation(snippet: typings.std.Element, content: String): Unit
  @JSName("operation")
  var operation_Original: SnippetUpdateOperation
  
  var options: typings.naja.najaMod.Options
  
  var snippet: typings.std.Element
}
object Content {
  
  inline def apply(
    content: String,
    fromCache: Boolean,
    operation: (/* snippet */ typings.std.Element, /* content */ String) => Unit,
    options: typings.naja.najaMod.Options,
    snippet: typings.std.Element
  ): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], operation = js.Any.fromFunction2(operation), options = options.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: (/* snippet */ typings.std.Element, /* content */ String) => Unit): Self = StObject.set(x, "operation", js.Any.fromFunction2(value))
    
    inline def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSnippet(value: typings.std.Element): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
  }
}
