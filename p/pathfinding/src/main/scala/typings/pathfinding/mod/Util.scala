package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  @JSImport("pathfinding", "Util.compressPath")
  @js.native
  def compressPath(path: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = js.native
  
  @JSImport("pathfinding", "Util.expandPath")
  @js.native
  def expandPath(path: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = js.native
  
  @JSImport("pathfinding", "Util.smoothenPath")
  @js.native
  def smoothenPath(grid: typings.pathfinding.mod.Grid, path: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = js.native
}
