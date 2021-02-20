package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononNotifComponent extends StObject {
  
  def hide(): PhononNotifComponent = js.native
  
  def setColor(color: PhononColor): PhononNotifComponent = js.native
  
  def show(): PhononNotifComponent = js.native
}
object PhononNotifComponent {
  
  @scala.inline
  def apply(
    hide: () => PhononNotifComponent,
    setColor: PhononColor => PhononNotifComponent,
    show: () => PhononNotifComponent
  ): PhononNotifComponent = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), setColor = js.Any.fromFunction1(setColor), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[PhononNotifComponent]
  }
  
  @scala.inline
  implicit class PhononNotifComponentMutableBuilder[Self <: PhononNotifComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => PhononNotifComponent): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetColor(value: PhononColor => PhononNotifComponent): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => PhononNotifComponent): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
