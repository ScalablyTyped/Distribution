package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JumpPointFinderOptions
  extends StObject
     with Heuristic {
  
  var diagonalMovement: js.UndefOr[DiagonalMovement] = js.undefined
}
object JumpPointFinderOptions {
  
  @scala.inline
  def apply(): JumpPointFinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpPointFinderOptions]
  }
  
  @scala.inline
  implicit class JumpPointFinderOptionsMutableBuilder[Self <: JumpPointFinderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagonalMovement(value: DiagonalMovement): Self = StObject.set(x, "diagonalMovement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagonalMovementUndefined: Self = StObject.set(x, "diagonalMovement", js.undefined)
  }
}
