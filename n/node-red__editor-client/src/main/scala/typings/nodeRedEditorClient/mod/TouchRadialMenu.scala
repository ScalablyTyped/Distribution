package typings.nodeRedEditorClient.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchRadialMenu extends StObject {
  
  def active(): Boolean
  
  def show(obj: HTMLElement, pos: js.Array[Double], options: js.Object): Unit
}
object TouchRadialMenu {
  
  inline def apply(active: () => Boolean, show: (HTMLElement, js.Array[Double], js.Object) => Unit): TouchRadialMenu = {
    val __obj = js.Dynamic.literal(active = js.Any.fromFunction0(active), show = js.Any.fromFunction3(show))
    __obj.asInstanceOf[TouchRadialMenu]
  }
  
  extension [Self <: TouchRadialMenu](x: Self) {
    
    inline def setActive(value: () => Boolean): Self = StObject.set(x, "active", js.Any.fromFunction0(value))
    
    inline def setShow(value: (HTMLElement, js.Array[Double], js.Object) => Unit): Self = StObject.set(x, "show", js.Any.fromFunction3(value))
  }
}
