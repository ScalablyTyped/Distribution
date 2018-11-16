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

