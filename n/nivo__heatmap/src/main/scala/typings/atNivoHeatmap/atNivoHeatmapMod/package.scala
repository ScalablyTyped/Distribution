package typings.atNivoHeatmap

import org.scalablytyped.runtime.StringDictionary
import typings.atNivoCore.atNivoCoreMod.ColorProps
import typings.atNivoCore.atNivoCoreMod.MotionProps
import typings.atNivoHeatmap.Anon_AxisBottom
import typings.atNivoHeatmap.Anon_Color
import typings.atNivoHeatmap.Anon_Datum
import typings.atNivoHeatmap.Anon_DatumEvent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoHeatmapMod {
  type HeatMapCanvasProps = HeatMapData with HeatMapCommonProps with Partial[Anon_DatumEvent]
  type HeatMapCommonProps = ColorProps[HeatMapDatum] with Partial[Anon_AxisBottom]
  type HeatMapDatum = StringDictionary[String | Double]
  type HeatMapDatumWithColor = HeatMapDatum with Anon_Color
  type HeatMapSvgProps = HeatMapData with HeatMapCommonProps with MotionProps with Partial[Anon_Datum]
  type IndexByFunc = js.Function1[/* datum */ HeatMapDatum, String | Double]
  type ValueFormatter = js.Function1[/* value */ Double, String | Double]
}
