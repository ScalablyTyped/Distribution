package typings.notify.Notify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Show the arrow pointing at the element. Default is true.
    */
  var arrowShow: js.UndefOr[Boolean] = js.undefined
  /**
    * Arrow size in pixels. Default is 5.
    */
  var arrowSize: js.UndefOr[Double] = js.undefined
  /**
    * Whether to auto-hide the notification (after autoHideDelay milliseconds). Default is true.
    */
  var autoHide: js.UndefOr[Boolean] = js.undefined
  /**
    * If autoHide, hide after milliseconds. Default is 5000.
    */
  var autoHideDelay: js.UndefOr[Double] = js.undefined
  /**
    * Class of the notification (string or [string]). Default is 'error'.
    *
    * Notify looks through the classes defined in the given style and will apply the CSS
    * attributes of that style. Additionally, a CSS class of "notifyjs-<style name>-<class name>"
    * will be applied.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Whether to hide the notification on click. Default is true.
    */
  var clickToHide: js.UndefOr[Boolean] = js.undefined
  /**
    * Position of the notification when created relative to an element. Default is 'bottom left'.
    */
  var elementPosition: js.UndefOr[String] = js.undefined
  /**
    * Padding in px between element and notification. Deafult is 2.
    */
  var gap: js.UndefOr[Double] = js.undefined
  /**
    * Position of the notification when created globally. Default is 'top right'.
    */
  var globalPosition: js.UndefOr[String] = js.undefined
  /**
    * Animation when notification is hidden. Default is 'slideUp'.
    */
  var hideAnimation: js.UndefOr[String] = js.undefined
  /**
    * Duration for hide animation, in milliseconds. Default is 200.
    */
  var hideDuration: js.UndefOr[Double] = js.undefined
  /**
    * Animation when notification is shown. Default is 'slideDown'.
    */
  var showAnimation: js.UndefOr[String] = js.undefined
  /**
    * Duration show animation, in milliseconds. Default is 400.
    */
  var showDuration: js.UndefOr[Double] = js.undefined
  /**
    * Style of the notification. Default is 'bootstrap'.
    *
    * For more information on styles, refer to Notify.StyleDefinition.
    */
  var style: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arrowShow: js.UndefOr[Boolean] = js.undefined,
    arrowSize: js.UndefOr[Double] = js.undefined,
    autoHide: js.UndefOr[Boolean] = js.undefined,
    autoHideDelay: js.UndefOr[Double] = js.undefined,
    className: String = null,
    clickToHide: js.UndefOr[Boolean] = js.undefined,
    elementPosition: String = null,
    gap: js.UndefOr[Double] = js.undefined,
    globalPosition: String = null,
    hideAnimation: String = null,
    hideDuration: js.UndefOr[Double] = js.undefined,
    showAnimation: String = null,
    showDuration: js.UndefOr[Double] = js.undefined,
    style: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowShow)) __obj.updateDynamic("arrowShow")(arrowShow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowSize)) __obj.updateDynamic("arrowSize")(arrowSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHideDelay)) __obj.updateDynamic("autoHideDelay")(autoHideDelay.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToHide)) __obj.updateDynamic("clickToHide")(clickToHide.get.asInstanceOf[js.Any])
    if (elementPosition != null) __obj.updateDynamic("elementPosition")(elementPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(gap)) __obj.updateDynamic("gap")(gap.get.asInstanceOf[js.Any])
    if (globalPosition != null) __obj.updateDynamic("globalPosition")(globalPosition.asInstanceOf[js.Any])
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(hideAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDuration)) __obj.updateDynamic("hideDuration")(hideDuration.get.asInstanceOf[js.Any])
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(showAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(showDuration)) __obj.updateDynamic("showDuration")(showDuration.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

