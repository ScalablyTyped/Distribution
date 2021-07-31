package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  @JSImport("pathfinding", "Util")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compressPath(path: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compressPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
  
  @scala.inline
  def expandPath(path: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
  
  @scala.inline
  def smoothenPath(grid: Grid, path: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("smoothenPath")(grid.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
}
