package typings.pathfinding.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiagonalMovement extends js.Object

@JSImport("pathfinding", "DiagonalMovement")
@js.native
object DiagonalMovement extends js.Object {
  @js.native
  sealed trait Always extends DiagonalMovement
  
  @js.native
  sealed trait IfAtMostOneObstacle extends DiagonalMovement
  
  @js.native
  sealed trait Never extends DiagonalMovement
  
  @js.native
  sealed trait OnlyWhenNoObstacles extends DiagonalMovement
  
  /* 1 */ val Always: typings.pathfinding.pathfindingMod.DiagonalMovement.Always with Double = js.native
  /* 3 */ val IfAtMostOneObstacle: typings.pathfinding.pathfindingMod.DiagonalMovement.IfAtMostOneObstacle with Double = js.native
  /* 2 */ val Never: typings.pathfinding.pathfindingMod.DiagonalMovement.Never with Double = js.native
  /* 4 */ val OnlyWhenNoObstacles: typings.pathfinding.pathfindingMod.DiagonalMovement.OnlyWhenNoObstacles with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagonalMovement with Double] = js.native
}

