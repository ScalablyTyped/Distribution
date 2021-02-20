package typings.nodeRedEditorClient.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchRadialMenu extends StObject {
  
  def active(): Boolean = js.native
  
  def show(obj: HTMLElement, pos: js.Array[Double], options: js.Object): Unit = js.native
}
object TouchRadialMenu {
  
  @scala.inline
  def apply(active: () => Boolean, show: (HTMLElement, js.Array[Double], js.Object) => Unit): TouchRadialMenu = {
    val __obj = js.Dynamic.literal(active = js.Any.fromFunction0(active), show = js.Any.fromFunction3(show))
    __obj.asInstanceOf[TouchRadialMenu]
  }
  
  @scala.inline
  implicit class TouchRadialMenuMutableBuilder[Self <: TouchRadialMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: () => Boolean): Self = StObject.set(x, "active", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: (HTMLElement, js.Array[Double], js.Object) => Unit): Self = StObject.set(x, "show", js.Any.fromFunction3(value))
  }
}
