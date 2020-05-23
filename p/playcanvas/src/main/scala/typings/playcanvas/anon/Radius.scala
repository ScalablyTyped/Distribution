package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Radius extends js.Object {
  var radius: js.UndefOr[Double] = js.undefined
  var segments: js.UndefOr[Double] = js.undefined
}

object Radius {
  @scala.inline
  def apply(radius: js.UndefOr[Double] = js.undefined, segments: js.UndefOr[Double] = js.undefined): Radius = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(segments)) __obj.updateDynamic("segments")(segments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
}

