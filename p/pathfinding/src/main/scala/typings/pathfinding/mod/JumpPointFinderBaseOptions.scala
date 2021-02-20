package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JumpPointFinderBaseOptions extends Heuristic {
  
  var trackJumpRecursion: js.UndefOr[Boolean] = js.native
}
object JumpPointFinderBaseOptions {
  
  @scala.inline
  def apply(): JumpPointFinderBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpPointFinderBaseOptions]
  }
  
  @scala.inline
  implicit class JumpPointFinderBaseOptionsMutableBuilder[Self <: JumpPointFinderBaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrackJumpRecursion(value: Boolean): Self = StObject.set(x, "trackJumpRecursion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackJumpRecursionUndefined: Self = StObject.set(x, "trackJumpRecursion", js.undefined)
  }
}
