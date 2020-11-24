package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononPageEventObject extends js.Object {
  
  def addEvent(event: String, callback: js.Function1[/* parameter */ js.UndefOr[js.Any], Unit]): Unit = js.native
}
object PhononPageEventObject {
  
  @scala.inline
  def apply(addEvent: (String, js.Function1[/* parameter */ js.UndefOr[js.Any], Unit]) => Unit): PhononPageEventObject = {
    val __obj = js.Dynamic.literal(addEvent = js.Any.fromFunction2(addEvent))
    __obj.asInstanceOf[PhononPageEventObject]
  }
  
  @scala.inline
  implicit class PhononPageEventObjectOps[Self <: PhononPageEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddEvent(value: (String, js.Function1[/* parameter */ js.UndefOr[js.Any], Unit]) => Unit): Self = this.set("addEvent", js.Any.fromFunction2(value))
  }
}
