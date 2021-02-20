package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JumpPointFinderOptions extends Heuristic {
  
  var diagonalMovement: js.UndefOr[DiagonalMovement] = js.native
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
