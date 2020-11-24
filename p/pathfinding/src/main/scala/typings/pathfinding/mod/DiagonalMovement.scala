package typings.pathfinding.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagonalMovement extends js.Object
@JSImport("pathfinding", "DiagonalMovement")
@js.native
object DiagonalMovement extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagonalMovement with Double] = js.native
  
  @js.native
  sealed trait Always extends DiagonalMovement
  /* 1 */ @js.native
  object Always extends TopLevel[Always with Double]
  
  @js.native
  sealed trait IfAtMostOneObstacle extends DiagonalMovement
  /* 3 */ @js.native
  object IfAtMostOneObstacle extends TopLevel[IfAtMostOneObstacle with Double]
  
  @js.native
  sealed trait Never extends DiagonalMovement
  /* 2 */ @js.native
  object Never extends TopLevel[Never with Double]
  
  @js.native
  sealed trait OnlyWhenNoObstacles extends DiagonalMovement
  /* 4 */ @js.native
  object OnlyWhenNoObstacles extends TopLevel[OnlyWhenNoObstacles with Double]
}
