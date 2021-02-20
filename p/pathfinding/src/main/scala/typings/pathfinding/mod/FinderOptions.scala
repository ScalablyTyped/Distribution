package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinderOptions extends Heuristic {
  
  var diagonalMovement: js.UndefOr[DiagonalMovement] = js.native
  
  var weight: js.UndefOr[Double] = js.native
}
object FinderOptions {
  
  @scala.inline
  def apply(): FinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinderOptions]
  }
  
  @scala.inline
  implicit class FinderOptionsMutableBuilder[Self <: FinderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagonalMovement(value: DiagonalMovement): Self = StObject.set(x, "diagonalMovement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagonalMovementUndefined: Self = StObject.set(x, "diagonalMovement", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
