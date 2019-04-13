package typings
package atNivoHeatmapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoHeatmapMod {
  type HeatMapCanvasProps = HeatMapData with HeatMapCommonProps with stdLib.Partial[atNivoHeatmapLib.Anon_DatumEvent]
  type HeatMapCommonProps = atNivoCoreLib.atNivoCoreMod.ColorProps[HeatMapDatum] with stdLib.Partial[atNivoHeatmapLib.Anon_AxisBottom]
  type HeatMapDatum = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  type HeatMapDatumWithColor = HeatMapDatum with atNivoHeatmapLib.Anon_Color
  type HeatMapSvgProps = HeatMapData with HeatMapCommonProps with atNivoCoreLib.atNivoCoreMod.MotionProps with stdLib.Partial[atNivoHeatmapLib.Anon_Datum]
  type IndexByFunc = js.Function1[/* datum */ HeatMapDatum, java.lang.String | scala.Double]
  type ValueFormatter = js.Function1[/* value */ scala.Double, java.lang.String | scala.Double]
}
