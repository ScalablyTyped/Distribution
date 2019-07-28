package typings.plottable

import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcUtilsMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcUtilsStackingUtilsMod {
  type GenericStackingResult[D] = Map[Dataset, Map[String | Double, GenericStackedDatum[D]]]
  type IStackingOrder = String
  type StackedDatum = GenericStackedDatum[String]
  type StackingResult = GenericStackingResult[String]
}
