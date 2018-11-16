package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcUtilsStackingUtilsMod {
  type GenericStackingResult[D] = plottableLib.buildSrcUtilsMod.Map[
    plottableLib.buildSrcCoreDatasetMod.Dataset, 
    plottableLib.buildSrcUtilsMod.Map[java.lang.String | scala.Double, GenericStackedDatum[D]]
  ]
  type IStackingOrder = java.lang.String
  type StackedDatum = GenericStackedDatum[java.lang.String]
  type StackingResult = GenericStackingResult[java.lang.String]
}
