package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldOptions extends js.Object {
  var broadphase: js.UndefOr[Broadphase] = js.undefined
  var gravity: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var islandSplit: js.UndefOr[scala.Boolean] = js.undefined
  var solver: js.UndefOr[Solver] = js.undefined
}

