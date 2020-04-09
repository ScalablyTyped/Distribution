package typings.plotlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Camera> */
trait PartialCameraCenter extends js.Object {
  var center: js.UndefOr[PartialPoint] = js.undefined
  var eye: js.UndefOr[PartialPoint] = js.undefined
  var up: js.UndefOr[PartialPoint] = js.undefined
}

object PartialCameraCenter {
  @scala.inline
  def apply(center: PartialPoint = null, eye: PartialPoint = null, up: PartialPoint = null): PartialCameraCenter = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (eye != null) __obj.updateDynamic("eye")(eye.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCameraCenter]
  }
}

