package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononPreloaderComponent extends StObject {
  
  def hide(): Unit = js.native
  
  def show(): Unit = js.native
}
object PhononPreloaderComponent {
  
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): PhononPreloaderComponent = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[PhononPreloaderComponent]
  }
  
  @scala.inline
  implicit class PhononPreloaderComponentMutableBuilder[Self <: PhononPreloaderComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
