package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcUtilsRTreeMod {
  type IDistanceFunction = js.Function2[
    /* bounds */ RTreeBounds, 
    /* p */ plottableLib.buildSrcCoreInterfacesMod.Point, 
    scala.Double
  ]
}
