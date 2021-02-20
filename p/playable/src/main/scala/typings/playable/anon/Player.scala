package typings.playable.anon

import typings.playable.playerFactoryMod.IPlayerInstance
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Player extends StObject {
  
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
  implicit class PlayerMutableBuilder[Self <: Player] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayer(value: IPlayerInstance): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryContainer(value: HTMLDivElement): Self = StObject.set(x, "storyContainer", value.asInstanceOf[js.Any])
  }
}
