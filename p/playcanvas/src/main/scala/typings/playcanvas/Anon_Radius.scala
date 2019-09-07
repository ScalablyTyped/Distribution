package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Radius extends js.Object {
  var radius: js.UndefOr[Double] = js.undefined
  var segments: js.UndefOr[Double] = js.undefined
}

object Anon_Radius {
  @scala.inline
  def apply(radius: Int | Double = null, segments: Int | Double = null): Anon_Radius = {
    val __obj = js.Dynamic.literal()
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Radius]
  }
}

