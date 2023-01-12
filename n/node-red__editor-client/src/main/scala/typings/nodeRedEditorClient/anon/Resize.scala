package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.vertical
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resize extends StObject {
  
  var container: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  
  var dir: js.UndefOr[vertical] = js.undefined
  
  var id: String
  
  var resize: js.UndefOr[js.Function2[/* size1 */ Double, /* size2 */ Double, Unit]] = js.undefined
}
object Resize {
  
  inline def apply(id: String): Resize = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resize] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: JQuery[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDir(value: vertical): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResize(value: (/* size1 */ Double, /* size2 */ Double) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}
