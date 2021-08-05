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
  
  extension [Self <: BiBreadthFirstFinderOptions](x: Self) {
    
    inline def setDiagonalMovement(value: DiagonalMovement): Self = StObject.set(x, "diagonalMovement", value.asInstanceOf[js.Any])
    
    inline def setDiagonalMovementUndefined: Self = StObject.set(x, "diagonalMovement", js.undefined)
  }
}
