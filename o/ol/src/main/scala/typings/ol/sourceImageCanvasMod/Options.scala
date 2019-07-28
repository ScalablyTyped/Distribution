package typings.ol.sourceImageCanvasMod

import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceStateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var canvasFunction: js.UndefOr[FunctionType] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
  var state: js.UndefOr[State] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    canvasFunction: FunctionType = null,
    projection: ProjectionLike = null,
    ratio: Int | Double = null,
    resolutions: js.Array[Double] = null,
    state: State = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (canvasFunction != null) __obj.updateDynamic("canvasFunction")(canvasFunction)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Options]
  }
}

