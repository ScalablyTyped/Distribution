package typings.plotlyJs

import typings.plotlyJs.mod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Frame> */
trait PartialFrame extends js.Object {
  var baseframe: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Array[Data]] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[PartialLayoutAngularaxis] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var traces: js.UndefOr[js.Array[Double]] = js.undefined
}

object PartialFrame {
  @scala.inline
  def apply(
    baseframe: String = null,
    data: js.Array[Data] = null,
    group: String = null,
    layout: PartialLayoutAngularaxis = null,
    name: String = null,
    traces: js.Array[Double] = null
  ): PartialFrame = {
    val __obj = js.Dynamic.literal()
    if (baseframe != null) __obj.updateDynamic("baseframe")(baseframe.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (traces != null) __obj.updateDynamic("traces")(traces.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFrame]
  }
}

