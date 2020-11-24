package typings.ngtoaster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToasterConfig extends js.Object {
  
  /**
    * Options include:
    * '', 'trustedHtml', 'template', 'templateWithData'
    */
  var `body-output-type`: js.UndefOr[String] = js.native
  
  var `body-template`: js.UndefOr[String] = js.native
  
  var `close-button`: js.UndefOr[Boolean] = js.native
  
  var `close-html`: js.UndefOr[String] = js.native
  
  var `icon-class`: js.UndefOr[String] = js.native
  
  var `icon-classes`: js.UndefOr[IIconClasses] = js.native
  
  /**
    * limits max number of toasts
    */
  var limit: js.UndefOr[Double] = js.native
  
  var `message-class`: js.UndefOr[String] = js.native
  
  /**
    * stop timeout on mouseover and restart timer on mouseout
    */
  var `mouseover-timer-stop`: js.UndefOr[Boolean] = js.native
  
  var `newest-on-top`: js.UndefOr[Boolean] = js.native
  
  /**
    * Options include:
    * 'toast-top-full-width', 'toast-bottom-full-width', 'toast-center',
    * 'toast-top-left', 'toast-top-center', 'toast-top-rigt',
    * 'toast-bottom-left', 'toast-bottom-center', 'toast-bottom-rigt',
    */
  var `position-class`: js.UndefOr[String] = js.native
  
  var `prevent-duplicates`: js.UndefOr[Boolean] = js.native
  
  var `tap-to-dismiss`: js.UndefOr[Boolean] = js.native
  
  var `time-out`: js.UndefOr[Double] = js.native
  
  var `title-class`: js.UndefOr[String] = js.native
}
object IToasterConfig {
  
  @scala.inline
  def apply(): IToasterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToasterConfig]
  }
  
  @scala.inline
  implicit class IToasterConfigOps[Self <: IToasterConfig] (val x: Self) extends AnyVal {
    
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
    def `setBody-output-type`(value: String): Self = this.set("body-output-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBody-output-type`: Self = this.set("body-output-type", js.undefined)
    
    @scala.inline
    def `setBody-template`(value: String): Self = this.set("body-template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBody-template`: Self = this.set("body-template", js.undefined)
    
    @scala.inline
    def `setClose-button`(value: Boolean): Self = this.set("close-button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteClose-button`: Self = this.set("close-button", js.undefined)
    
    @scala.inline
    def `setClose-html`(value: String): Self = this.set("close-html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteClose-html`: Self = this.set("close-html", js.undefined)
    
    @scala.inline
    def `setIcon-class`(value: String): Self = this.set("icon-class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-class`: Self = this.set("icon-class", js.undefined)
    
    @scala.inline
    def `setIcon-classes`(value: IIconClasses): Self = this.set("icon-classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-classes`: Self = this.set("icon-classes", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def `setMessage-class`(value: String): Self = this.set("message-class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMessage-class`: Self = this.set("message-class", js.undefined)
    
    @scala.inline
    def `setMouseover-timer-stop`(value: Boolean): Self = this.set("mouseover-timer-stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMouseover-timer-stop`: Self = this.set("mouseover-timer-stop", js.undefined)
    
    @scala.inline
    def `setNewest-on-top`(value: Boolean): Self = this.set("newest-on-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteNewest-on-top`: Self = this.set("newest-on-top", js.undefined)
    
    @scala.inline
    def `setPosition-class`(value: String): Self = this.set("position-class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePosition-class`: Self = this.set("position-class", js.undefined)
    
    @scala.inline
    def `setPrevent-duplicates`(value: Boolean): Self = this.set("prevent-duplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePrevent-duplicates`: Self = this.set("prevent-duplicates", js.undefined)
    
    @scala.inline
    def `setTap-to-dismiss`(value: Boolean): Self = this.set("tap-to-dismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTap-to-dismiss`: Self = this.set("tap-to-dismiss", js.undefined)
    
    @scala.inline
    def `setTime-out`(value: Double): Self = this.set("time-out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTime-out`: Self = this.set("time-out", js.undefined)
    
    @scala.inline
    def `setTitle-class`(value: String): Self = this.set("title-class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTitle-class`: Self = this.set("title-class", js.undefined)
  }
}
