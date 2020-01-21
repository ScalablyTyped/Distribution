package typings.pathfinding.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagonalMovement with Double] = js.native
  /* 1 */ @js.native
  object Always extends TopLevel[Always with Double]
  
  /* 3 */ @js.native
  object IfAtMostOneObstacle extends TopLevel[IfAtMostOneObstacle with Double]
  
  /* 2 */ @js.native
  object Never extends TopLevel[Never with Double]
  
  /* 4 */ @js.native
  object OnlyWhenNoObstacles extends TopLevel[OnlyWhenNoObstacles with Double]
  
}

