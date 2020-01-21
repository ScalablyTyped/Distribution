package typings.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathfinding", "Util")
@js.native
object Util extends js.Object {
  def compressPath(path: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = js.native
  def expandPath(path: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = js.native
  def smoothenPath(grid: Grid, path: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = js.native
}

