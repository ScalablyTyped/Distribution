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
  
  @scala.inline
  def apply(): IDAStarFinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDAStarFinderOptions]
  }
  
  @scala.inline
  implicit class IDAStarFinderOptionsMutableBuilder[Self <: IDAStarFinderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
    
    @scala.inline
    def setTrackRecursion(value: Boolean): Self = StObject.set(x, "trackRecursion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackRecursionUndefined: Self = StObject.set(x, "trackRecursion", js.undefined)
  }
}
