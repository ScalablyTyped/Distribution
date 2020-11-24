package typings.playable.anon

import typings.playable.playerFactoryMod.IPlayerInstance
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Player extends js.Object {
  
  var player: IPlayerInstance = js.native
  
  var storyContainer: HTMLDivElement = js.native
}
object Player {
  
  @scala.inline
  def apply(player: IPlayerInstance, storyContainer: HTMLDivElement): Player = {
    val __obj = js.Dynamic.literal(player = player.asInstanceOf[js.Any], storyContainer = storyContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
  
  @scala.inline
  implicit class PlayerOps[Self <: Player] (val x: Self) extends AnyVal {
    
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
    def setPlayer(value: IPlayerInstance): Self = this.set("player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryContainer(value: HTMLDivElement): Self = this.set("storyContainer", value.asInstanceOf[js.Any])
  }
}
