package typings.atNivoHeatmap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoHeatmapMod {
  import org.scalablytyped.runtime.StringDictionary

  type HeatMapDatum = StringDictionary[String | Double]
  type IndexByFunc = js.Function1[/* datum */ HeatMapDatum, String | Double]
  type ValueFormatter = js.Function1[/* value */ Double, String | Double]
}
