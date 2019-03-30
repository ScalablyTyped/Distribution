package typings
package atNivoScatterplotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoScatterplotMod {
  type ScatterPlotMouseHandler = js.Function2[
    /* data */ ScatterPlotDatum, 
    /* event */ reactLib.reactMod.ReactNs.MouseEvent[js.Any, reactLib.NativeMouseEvent], 
    scala.Unit
  ]
  type ScatterPlotSizeGetter = js.Function1[/* data */ ScatterPlotDatum, scala.Double]
  type TooltipFormatter = js.Function1[/* value */ atNivoScatterplotLib.Anon_X, java.lang.String]
}
