package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDAStarFinderOptions
  extends StObject
     with FinderOptions {
  
  var timeLimit: js.UndefOr[Double] = js.undefined
  
  var trackRecursion: js.UndefOr[Boolean] = js.undefined
}
object IDAStarFinderOptions {
  
  inline def apply(): IDAStarFinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDAStarFinderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDAStarFinderOptions] (val x: Self) extends AnyVal {
    
    inline def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
    
    inline def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
    
    inline def setTrackRecursion(value: Boolean): Self = StObject.set(x, "trackRecursion", value.asInstanceOf[js.Any])
    
    inline def setTrackRecursionUndefined: Self = StObject.set(x, "trackRecursion", js.undefined)
  }
}
