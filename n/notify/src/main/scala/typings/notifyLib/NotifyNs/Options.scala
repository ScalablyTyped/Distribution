package typings
package notifyLib.NotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Show the arrow pointing at the element. Default is true.
    */
  var arrowShow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Arrow size in pixels. Default is 5.
    */
  var arrowSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to auto-hide the notification (after autoHideDelay milliseconds). Default is true.
    */
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If autoHide, hide after milliseconds. Default is 5000.
    */
  var autoHideDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Class of the notification (string or [string]). Default is 'error'.
    *
    * Notify looks through the classes defined in the given style and will apply the CSS
    * attributes of that style. Additionally, a CSS class of "notifyjs-<style name>-<class name>"
    * will be applied.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to hide the notification on click. Default is true.
    */
  var clickToHide: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Position of the notification when created relative to an element. Default is 'bottom left'.
    */
  var elementPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Padding in px between element and notification. Deafult is 2.
    */
  var gap: js.UndefOr[scala.Double] = js.undefined
  /**
    * Position of the notification when created globally. Default is 'top right'.
    */
  var globalPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Animation when notification is hidden. Default is 'slideUp'.
    */
  var hideAnimation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Duration for hide animation, in milliseconds. Default is 200.
    */
  var hideDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Animation when notification is shown. Default is 'slideDown'.
    */
  var showAnimation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Duration show animation, in milliseconds. Default is 400.
    */
  var showDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Style of the notification. Default is 'bootstrap'.
    *
    * For more information on styles, refer to Notify.StyleDefinition.
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
}

