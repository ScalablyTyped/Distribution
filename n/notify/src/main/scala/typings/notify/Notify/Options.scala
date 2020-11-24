package typings.notify.Notify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Show the arrow pointing at the element. Default is true.
    */
  var arrowShow: js.UndefOr[Boolean] = js.native
  
  /**
    * Arrow size in pixels. Default is 5.
    */
  var arrowSize: js.UndefOr[Double] = js.native
  
  /**
    * Whether to auto-hide the notification (after autoHideDelay milliseconds). Default is true.
    */
  var autoHide: js.UndefOr[Boolean] = js.native
  
  /**
    * If autoHide, hide after milliseconds. Default is 5000.
    */
  var autoHideDelay: js.UndefOr[Double] = js.native
  
  /**
    * Class of the notification (string or [string]). Default is 'error'.
    *
    * Notify looks through the classes defined in the given style and will apply the CSS
    * attributes of that style. Additionally, a CSS class of "notifyjs-<style name>-<class name>"
    * will be applied.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Whether to hide the notification on click. Default is true.
    */
  var clickToHide: js.UndefOr[Boolean] = js.native
  
  /**
    * Position of the notification when created relative to an element. Default is 'bottom left'.
    */
  var elementPosition: js.UndefOr[String] = js.native
  
  /**
    * Padding in px between element and notification. Deafult is 2.
    */
  var gap: js.UndefOr[Double] = js.native
  
  /**
    * Position of the notification when created globally. Default is 'top right'.
    */
  var globalPosition: js.UndefOr[String] = js.native
  
  /**
    * Animation when notification is hidden. Default is 'slideUp'.
    */
  var hideAnimation: js.UndefOr[String] = js.native
  
  /**
    * Duration for hide animation, in milliseconds. Default is 200.
    */
  var hideDuration: js.UndefOr[Double] = js.native
  
  /**
    * Animation when notification is shown. Default is 'slideDown'.
    */
  var showAnimation: js.UndefOr[String] = js.native
  
  /**
    * Duration show animation, in milliseconds. Default is 400.
    */
  var showDuration: js.UndefOr[Double] = js.native
  
  /**
    * Style of the notification. Default is 'bootstrap'.
    *
    * For more information on styles, refer to Notify.StyleDefinition.
    */
  var style: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setArrowShow(value: Boolean): Self = this.set("arrowShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowShow: Self = this.set("arrowShow", js.undefined)
    
    @scala.inline
    def setArrowSize(value: Double): Self = this.set("arrowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowSize: Self = this.set("arrowSize", js.undefined)
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    
    @scala.inline
    def setAutoHideDelay(value: Double): Self = this.set("autoHideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHideDelay: Self = this.set("autoHideDelay", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClickToHide(value: Boolean): Self = this.set("clickToHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickToHide: Self = this.set("clickToHide", js.undefined)
    
    @scala.inline
    def setElementPosition(value: String): Self = this.set("elementPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementPosition: Self = this.set("elementPosition", js.undefined)
    
    @scala.inline
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    
    @scala.inline
    def setGlobalPosition(value: String): Self = this.set("globalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalPosition: Self = this.set("globalPosition", js.undefined)
    
    @scala.inline
    def setHideAnimation(value: String): Self = this.set("hideAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideAnimation: Self = this.set("hideAnimation", js.undefined)
    
    @scala.inline
    def setHideDuration(value: Double): Self = this.set("hideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideDuration: Self = this.set("hideDuration", js.undefined)
    
    @scala.inline
    def setShowAnimation(value: String): Self = this.set("showAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAnimation: Self = this.set("showAnimation", js.undefined)
    
    @scala.inline
    def setShowDuration(value: Double): Self = this.set("showDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDuration: Self = this.set("showDuration", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
