package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.HoverLabel> */
trait PartialHoverLabelAlign extends js.Object {
  var align: js.UndefOr[left | right | auto] = js.undefined
  var bgcolor: js.UndefOr[String] = js.undefined
  var bordercolor: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[Partial[typings.plotlyJs.mod.Font]] = js.undefined
  var namelength: js.UndefOr[Double] = js.undefined
}

object PartialHoverLabelAlign {
  @scala.inline
  def apply(
    align: left | right | auto = null,
    bgcolor: String = null,
    bordercolor: String = null,
    font: Partial[typings.plotlyJs.mod.Font] = null,
    namelength: js.UndefOr[Double] = js.undefined
  ): PartialHoverLabelAlign = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(namelength)) __obj.updateDynamic("namelength")(namelength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialHoverLabelAlign]
  }
}

