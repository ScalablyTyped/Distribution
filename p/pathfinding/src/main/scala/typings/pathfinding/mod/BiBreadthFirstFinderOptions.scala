package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiBreadthFirstFinderOptions extends StObject {
  
  var diagonalMovement: js.UndefOr[DiagonalMovement] = js.undefined
}
object BiBreadthFirstFinderOptions {
  
  inline def apply(): BiBreadthFirstFinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiBreadthFirstFinderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BiBreadthFirstFinderOptions] (val x: Self) extends AnyVal {
    
    inline def setDiagonalMovement(value: DiagonalMovement): Self = StObject.set(x, "diagonalMovement", value.asInstanceOf[js.Any])
    
    inline def setDiagonalMovementUndefined: Self = StObject.set(x, "diagonalMovement", js.undefined)
  }
}
