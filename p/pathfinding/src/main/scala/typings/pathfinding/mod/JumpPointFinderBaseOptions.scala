package typings.pathfinding.mod

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
  implicit class JumpPointFinderBaseOptionsOps[Self <: JumpPointFinderBaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTrackJumpRecursion(value: Boolean): Self = this.set("trackJumpRecursion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackJumpRecursion: Self = this.set("trackJumpRecursion", js.undefined)
  }
}
