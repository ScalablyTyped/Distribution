package typings
package openlayersLib.openlayersMod.olxNs.animationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Animation options. Multiple animations can be run in series by passing
         * multiple options objects. To run multiple animations in parallel, call
         * the method multiple times. An optional callback can be provided as a
         * final argument. The callback will be called with a boolean indicating
         * whether the animation completed without being cancelled.
         */

trait AnimateOptions extends js.Object {
  var anchor: js.UndefOr[openlayersLib.openlayersMod.Coordinate] = js.undefined
  var center: js.UndefOr[openlayersLib.openlayersMod.Coordinate] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ scala.Double, scala.Double]] = js.undefined
  var resolution: js.UndefOr[scala.Double] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

