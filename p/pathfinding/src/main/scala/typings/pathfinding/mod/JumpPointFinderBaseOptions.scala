package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JumpPointFinderBaseOptions
  extends StObject
     with Heuristic {
  
  var trackJumpRecursion: js.UndefOr[Boolean] = js.undefined
}
object JumpPointFinderBaseOptions {
  
  inline def apply(): JumpPointFinderBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpPointFinderBaseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JumpPointFinderBaseOptions] (val x: Self) extends AnyVal {
    
    inline def setTrackJumpRecursion(value: Boolean): Self = StObject.set(x, "trackJumpRecursion", value.asInstanceOf[js.Any])
    
    inline def setTrackJumpRecursionUndefined: Self = StObject.set(x, "trackJumpRecursion", js.undefined)
  }
}
