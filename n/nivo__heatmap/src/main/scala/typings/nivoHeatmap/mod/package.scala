package typings.nivoHeatmap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HeatMapDatum = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  type IndexByFunc = js.Function1[/* datum */ typings.nivoHeatmap.mod.HeatMapDatum, java.lang.String | scala.Double]
  type ValueFormatter = js.Function1[/* value */ scala.Double, java.lang.String | scala.Double]
}
