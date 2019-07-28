package typings.plottable

import typings.plottable.buildSrcCoreInterfacesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcUtilsRTreeMod {
  type IDistanceFunction = js.Function2[/* bounds */ RTreeBounds, /* p */ Point, Double]
}
