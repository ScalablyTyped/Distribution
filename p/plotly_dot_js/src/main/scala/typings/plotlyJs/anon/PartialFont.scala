package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Font> */
trait PartialFont extends js.Object {
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var family: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object PartialFont {
  @scala.inline
  def apply(
    color: typings.plotlyJs.mod.Color = null,
    family: String = null,
    size: js.UndefOr[Double] = js.undefined
  ): PartialFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFont]
  }
}

