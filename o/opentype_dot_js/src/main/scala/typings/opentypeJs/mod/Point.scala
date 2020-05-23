package typings.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var lastPointOfContour: js.UndefOr[Boolean] = js.undefined
}

object Point {
  @scala.inline
  def apply(lastPointOfContour: js.UndefOr[Boolean] = js.undefined): Point = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lastPointOfContour)) __obj.updateDynamic("lastPointOfContour")(lastPointOfContour.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

