package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcUtilsRTreeMod {
  import typings.plottable.buildSrcCoreInterfacesMod.Point

  type IDistanceFunction = js.Function2[/* bounds */ RTreeBounds, /* p */ Point, Double]
}
