package typings
package morrisDotJsLib.morrisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDonutOptions extends IChartOptions {
  /** An array of strings containing HTML-style hex colors for each of the donut segments. */
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The data to plot. */
  var data: js.Array[IDonutData]
  /** A function that will translate a y-value into a label for the centre of the donut. */
  var formatter: js.UndefOr[js.Function2[/* y */ scala.Double, /* data */ IDonutData, java.lang.String]] = js.undefined
}

object IDonutOptions {
  @scala.inline
  def apply(
    data: js.Array[IDonutData],
    element: js.Any,
    colors: js.Array[java.lang.String] = null,
    formatter: js.Function2[/* y */ scala.Double, /* data */ IDonutData, java.lang.String] = null,
    resize: js.UndefOr[scala.Boolean] = js.undefined
  ): IDonutOptions = {
    val __obj = js.Dynamic.literal(data = data, element = element)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    __obj.asInstanceOf[IDonutOptions]
  }
}

