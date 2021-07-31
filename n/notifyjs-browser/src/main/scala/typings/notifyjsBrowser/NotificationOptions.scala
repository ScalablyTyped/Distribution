package typings.notifyjsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationOptions extends StObject {
  
  // show the arrow pointing at the element
  var arrowShow: Boolean
  
  // arrow size in pixels
  var arrowSize: Double
  
  // whether to auto-hide the notification
  var autoHide: Boolean
  
  // if autoHide, hide after milliseconds
  var autoHideDelay: Double
  
  // default class (string or [string])
  var className: String
  
  // whether to hide the notification on click
  var clickToHide: Boolean
  
  // default positions
  var elementPosition: String
  
  // padding between element and notification
  var gap: Double
  
  var globalPosition: String
  
  // hide animation
  var hideAnimation: String
  
  // hide animation duration
  var hideDuration: Double
  
  // position defines the notification position though uses the defaults below
  var position: String
  
  // show animation
  var showAnimation: String
  
  // show animation duration
  var showDuration: Double
  
  // default style
  var style: String
}
object NotificationOptions {
  
  @scala.inline
  def apply(
    arrowShow: Boolean,
    arrowSize: Double,
    autoHide: Boolean,
    autoHideDelay: Double,
    className: String,
    clickToHide: Boolean,
    elementPosition: String,
    gap: Double,
    globalPosition: String,
    hideAnimation: String,
    hideDuration: Double,
    position: String,
    showAnimation: String,
    showDuration: Double,
    style: String
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal(arrowShow = arrowShow.asInstanceOf[js.Any], arrowSize = arrowSize.asInstanceOf[js.Any], autoHide = autoHide.asInstanceOf[js.Any], autoHideDelay = autoHideDelay.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], clickToHide = clickToHide.asInstanceOf[js.Any], elementPosition = elementPosition.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any], globalPosition = globalPosition.asInstanceOf[js.Any], hideAnimation = hideAnimation.asInstanceOf[js.Any], hideDuration = hideDuration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], showAnimation = showAnimation.asInstanceOf[js.Any], showDuration = showDuration.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
  
  @scala.inline
  implicit class NotificationOptionsMutableBuilder[Self <: NotificationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowShow(value: Boolean): Self = StObject.set(x, "arrowShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowSize(value: Double): Self = StObject.set(x, "arrowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideDelay(value: Double): Self = StObject.set(x, "autoHideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToHide(value: Boolean): Self = StObject.set(x, "clickToHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementPosition(value: String): Self = StObject.set(x, "elementPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalPosition(value: String): Self = StObject.set(x, "globalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideAnimation(value: String): Self = StObject.set(x, "hideAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDuration(value: Double): Self = StObject.set(x, "hideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAnimation(value: String): Self = StObject.set(x, "showAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDuration(value: Double): Self = StObject.set(x, "showDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
