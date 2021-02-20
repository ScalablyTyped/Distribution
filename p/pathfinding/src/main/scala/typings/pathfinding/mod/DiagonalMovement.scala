package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagonalMovement extends StObject
@JSImport("pathfinding", "DiagonalMovement")
@js.native
object DiagonalMovement extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagonalMovement with Double] = js.native
  
  @js.native
  sealed trait Always extends DiagonalMovement
  /* 1 */ val Always: typings.pathfinding.mod.DiagonalMovement.Always with Double = js.native
  
  @js.native
  sealed trait IfAtMostOneObstacle extends DiagonalMovement
  /* 3 */ val IfAtMostOneObstacle: typings.pathfinding.mod.DiagonalMovement.IfAtMostOneObstacle with Double = js.native
  
  @js.native
  sealed trait Never extends DiagonalMovement
  /* 2 */ val Never: typings.pathfinding.mod.DiagonalMovement.Never with Double = js.native
  
  @js.native
  sealed trait OnlyWhenNoObstacles extends DiagonalMovement
  /* 4 */ val OnlyWhenNoObstacles: typings.pathfinding.mod.DiagonalMovement.OnlyWhenNoObstacles with Double = js.native
}
