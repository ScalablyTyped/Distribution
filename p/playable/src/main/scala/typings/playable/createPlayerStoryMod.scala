package typings.playable

import typings.playable.anon.Player
import typings.playable.storiesTypesMod.StoryProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/stories/createPlayerStory", JSImport.Namespace)
@js.native
object createPlayerStoryMod extends js.Object {
  
  def createPlayerStory(storyId: String, playerProps: StoryProps): Player = js.native
}
