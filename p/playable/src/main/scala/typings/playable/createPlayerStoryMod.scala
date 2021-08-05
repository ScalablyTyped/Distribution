package typings.playable

import typings.playable.anon.Player
import typings.playable.storiesTypesMod.StoryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createPlayerStoryMod {
  
  @JSImport("playable/dist/src/stories/createPlayerStory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPlayerStory(storyId: String, playerProps: StoryProps): Player = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlayerStory")(storyId.asInstanceOf[js.Any], playerProps.asInstanceOf[js.Any])).asInstanceOf[Player]
}
