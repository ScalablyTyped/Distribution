package typings.plotlyJs

import typings.plotlyJs.mod.Point
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Camera> */
trait PartialCameraCenter extends js.Object {
  var center: js.UndefOr[Partial[Point]] = js.undefined
  var eye: js.UndefOr[Partial[Point]] = js.undefined
  var up: js.UndefOr[Partial[Point]] = js.undefined
}

object PartialCameraCenter {
  @scala.inline
  def apply(center: Partial[Point] = null, eye: Partial[Point] = null, up: Partial[Point] = null): PartialCameraCenter = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (eye != null) __obj.updateDynamic("eye")(eye.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCameraCenter]
  }
}

