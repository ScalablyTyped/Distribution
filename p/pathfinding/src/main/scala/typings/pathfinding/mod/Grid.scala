package typings.pathfinding.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.pathfinding.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grid
  extends StObject
     with Instantiable1[/* matrix */ js.Array[js.Array[Double]], Grid]
     with Instantiable2[/* width */ Double, /* height */ Double, Grid] {
  
  def getNeighbors(node: Node, diagonalMovement: DiagonalMovement): js.Array[Node] = js.native
  
  def getNodeAt(x: Double, y: Double): Node = js.native
  
  var height: Double = js.native
  
  def isInside(x: Double, y: Double): Boolean = js.native
  
  def isWalkableAt(x: Double, y: Double): Boolean = js.native
  
  def setWalkableAt(x: Double, y: Double, walkable: Boolean): Unit = js.native
  
  var width: Double = js.native
}
object Grid {
  
  @scala.inline
  def apply: Grid = ^.asInstanceOf[js.Dynamic].selectDynamic("Grid").asInstanceOf[Grid]
}
