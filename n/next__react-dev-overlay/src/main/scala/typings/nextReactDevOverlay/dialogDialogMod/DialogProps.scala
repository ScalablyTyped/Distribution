package typings.nextReactDevOverlay.dialogDialogMod

import typings.nextReactDevOverlay.nextReactDevOverlayStrings.error
import typings.nextReactDevOverlay.nextReactDevOverlayStrings.warning
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogProps extends js.Object {
  
  var `aria-describedby`: String = js.native
  
  var `aria-labelledby`: String = js.native
  
  var onClose: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, Unit]] = js.native
  
  var `type`: error | warning = js.native
}
object DialogProps {
  
  @scala.inline
  def apply(`aria-describedby`: String, `aria-labelledby`: String, `type`: error | warning): DialogProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
  
  @scala.inline
  implicit class DialogPropsOps[Self <: DialogProps] (val x: Self) extends AnyVal {
    
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
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: error | warning): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClose(value: /* e */ MouseEvent | TouchEvent => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
  }
}
