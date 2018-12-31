package typings
package nprogressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NProgressConfigureOptions extends js.Object {
  /**
    * The CSS easing animation to use. Default is 'linear'.
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The minimum progress percentage. Default is 0.08.
    */
  var minimum: js.UndefOr[scala.Double] = js.undefined
  /**
    * CSS selector to change the parent DOM element of the progress. Default is body.
    */
  var parent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to show the spinner. Defaults to true. Default is true.
    */
  var showSpinner: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The animation speed in milliseconds. Default is 200.
    */
  var speed: js.UndefOr[scala.Double] = js.undefined
  /**
    * The HTML markup inserted for the progress indicator. To keep the progress bar working, keep an element with role='bar' in there.
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to enable trickling the progress. Default is true.
    */
  var trickle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * How often to trickle, in milliseconds. Default is 800.
    */
  var trickleSpeed: js.UndefOr[scala.Double] = js.undefined
}

