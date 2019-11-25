package typings.morrisDotJs.morris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDonutOptions extends IChartOptions {
  /** An array of strings containing HTML-style hex colors for each of the donut segments. */
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  /** The data to plot. */
  var data: js.Array[IDonutData]
  /** A function that will translate a y-value into a label for the centre of the donut. */
  var formatter: js.UndefOr[js.Function2[/* y */ Double, /* data */ IDonutData, String]] = js.undefined
}

object IDonutOptions {
  @scala.inline
  def apply(
    data: js.Array[IDonutData],
    element: js.Any,
    colors: js.Array[String] = null,
    formatter: (/* y */ Double, /* data */ IDonutData) => String = null,
    resize: js.UndefOr[Boolean] = js.undefined
  ): IDonutOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction2(formatter))
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDonutOptions]
  }
}

