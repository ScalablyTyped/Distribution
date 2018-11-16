package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathfinding", "Util")
@js.native
object UtilNs extends js.Object {
  def compressPath(path: js.Array[js.Array[scala.Double]]): js.Array[js.Array[scala.Double]] = js.native
  def expandPath(path: js.Array[js.Array[scala.Double]]): js.Array[js.Array[scala.Double]] = js.native
  def smoothenPath(grid: pathfindingLib.pathfindingMod.PathfindingNs.Grid, path: js.Array[js.Array[scala.Double]]): js.Array[js.Array[scala.Double]] = js.native
}

