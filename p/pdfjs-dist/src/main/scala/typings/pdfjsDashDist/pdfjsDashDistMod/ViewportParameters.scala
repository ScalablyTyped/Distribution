package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportParameters extends js.Object {
   // (optional) The desired rotation, in degrees, of the viewport. If omitted it defaults to the page rotation.
  var dontFlip: js.UndefOr[Boolean] = js.undefined
   // The desired scale of the viewport.
  var rotation: js.UndefOr[Double] = js.undefined
  var scale: Double
}

object ViewportParameters {
  @scala.inline
  def apply(scale: Double, dontFlip: js.UndefOr[Boolean] = js.undefined, rotation: Int | Double = null): ViewportParameters = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (!js.isUndefined(dontFlip)) __obj.updateDynamic("dontFlip")(dontFlip.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportParameters]
  }
}

