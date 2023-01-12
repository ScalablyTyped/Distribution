package typings.naja.anon

import typings.naja.distCoreSnippetHandlerMod.SnippetUpdateOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'replace' | 'prepend' | 'append', naja.naja/dist/core/SnippetHandler.SnippetUpdateOperation> */
trait Recordreplaceprependappen extends StObject {
  
  def append(snippet: typings.std.Element, content: String): Unit
  @JSName("append")
  var append_Original: SnippetUpdateOperation
  
  def prepend(snippet: typings.std.Element, content: String): Unit
  @JSName("prepend")
  var prepend_Original: SnippetUpdateOperation
  
  def replace(snippet: typings.std.Element, content: String): Unit
  @JSName("replace")
  var replace_Original: SnippetUpdateOperation
}
object Recordreplaceprependappen {
  
  inline def apply(
    append: (/* snippet */ typings.std.Element, /* content */ String) => Unit,
    prepend: (/* snippet */ typings.std.Element, /* content */ String) => Unit,
    replace: (/* snippet */ typings.std.Element, /* content */ String) => Unit
  ): Recordreplaceprependappen = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), prepend = js.Any.fromFunction2(prepend), replace = js.Any.fromFunction2(replace))
    __obj.asInstanceOf[Recordreplaceprependappen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Recordreplaceprependappen] (val x: Self) extends AnyVal {
    
    inline def setAppend(value: (/* snippet */ typings.std.Element, /* content */ String) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
    
    inline def setPrepend(value: (/* snippet */ typings.std.Element, /* content */ String) => Unit): Self = StObject.set(x, "prepend", js.Any.fromFunction2(value))
    
    inline def setReplace(value: (/* snippet */ typings.std.Element, /* content */ String) => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
  }
}
