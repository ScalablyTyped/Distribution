package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var lastPointOfContour: js.UndefOr[scala.Boolean] = js.undefined
}

object Point {
  @scala.inline
  def apply(lastPointOfContour: js.UndefOr[scala.Boolean] = js.undefined): Point = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lastPointOfContour)) __obj.updateDynamic("lastPointOfContour")(lastPointOfContour)
    __obj.asInstanceOf[Point]
  }
}

