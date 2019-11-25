package typings.notifyjsDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
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
}

