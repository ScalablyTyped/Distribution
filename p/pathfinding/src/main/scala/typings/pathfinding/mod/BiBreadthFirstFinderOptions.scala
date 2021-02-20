package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BiBreadthFirstFinderOptions extends StObject {
  
  var diagonalMovement: js.UndefOr[DiagonalMovement] = js.native
}
object BiBreadthFirstFinderOptions {
  
  @scala.inline
  def apply(): BiBreadthFirstFinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiBreadthFirstFinderOptions]
  }
  
  @scala.inline
  implicit class BiBreadthFirstFinderOptionsMutableBuilder[Self <: BiBreadthFirstFinderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagonalMovement(value: DiagonalMovement): Self = StObject.set(x, "diagonalMovement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagonalMovementUndefined: Self = StObject.set(x, "diagonalMovement", js.undefined)
  }
}
