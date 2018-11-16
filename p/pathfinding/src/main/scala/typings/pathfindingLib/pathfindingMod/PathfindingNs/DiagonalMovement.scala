package typings
package pathfindingLib.pathfindingMod.PathfindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiagonalMovement extends js.Object

@JSImport("pathfinding/Pathfinding", "DiagonalMovement")
@js.native
object DiagonalMovement extends js.Object {
  @js.native
  sealed trait Always
    extends pathfindingLib.pathfindingMod.PathfindingNs.DiagonalMovement
  
  @js.native
  sealed trait IfAtMostOneObstacle
    extends pathfindingLib.pathfindingMod.PathfindingNs.DiagonalMovement
  
  @js.native
  sealed trait Never
    extends pathfindingLib.pathfindingMod.PathfindingNs.DiagonalMovement
  
  @js.native
  sealed trait OnlyWhenNoObstacle
    extends pathfindingLib.pathfindingMod.PathfindingNs.DiagonalMovement
  
}

