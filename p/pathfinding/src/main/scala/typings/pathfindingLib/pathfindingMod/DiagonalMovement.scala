package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiagonalMovement extends js.Object

@JSImport("pathfinding", "DiagonalMovement")
@js.native
object DiagonalMovement extends js.Object {
  @js.native
  sealed trait Always
    extends pathfindingLib.pathfindingMod.DiagonalMovement
  
  @js.native
  sealed trait IfAtMostOneObstacle
    extends pathfindingLib.pathfindingMod.DiagonalMovement
  
  @js.native
  sealed trait Never
    extends pathfindingLib.pathfindingMod.DiagonalMovement
  
  @js.native
  sealed trait OnlyWhenNoObstacles
    extends pathfindingLib.pathfindingMod.DiagonalMovement
  
  /* 1 */ val Always: Always with scala.Double = js.native
  /* 3 */ val IfAtMostOneObstacle: IfAtMostOneObstacle with scala.Double = js.native
  /* 2 */ val Never: Never with scala.Double = js.native
  /* 4 */ val OnlyWhenNoObstacles: OnlyWhenNoObstacles with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pathfindingLib.pathfindingMod.DiagonalMovement with scala.Double] = js.native
}

