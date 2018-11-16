package typings
package morrisDotJsLib.morrisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBarOptions extends IGridChartOptions {
  /** Array containing colors for the series bars. */
  var barColors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Provide a function on this option to generate custom hover legends. */
  var hoverCallback: js.UndefOr[
    js.Function4[
      /* index */ scala.Double, 
      /* options */ IBarOptions, 
      /* content */ java.lang.String, 
      /* row */ js.Any, 
      java.lang.String
    ]
  ] = js.undefined
  /** Set to true to draw bars stacked vertically. */
  var stacked: js.UndefOr[scala.Boolean] = js.undefined
}

