package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.PlotNumber> */
trait PartialPlotNumber extends js.Object {
  var font: js.UndefOr[PartialFont] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var valueformat: js.UndefOr[String] = js.undefined
}

object PartialPlotNumber {
  @scala.inline
  def apply(font: PartialFont = null, prefix: String = null, suffix: String = null, valueformat: String = null): PartialPlotNumber = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (valueformat != null) __obj.updateDynamic("valueformat")(valueformat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPlotNumber]
  }
}

