package typings.popmotion

import org.scalablytyped.runtime.StringDictionary
import typings.popmotion.libActionMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAnimationsTimelineTypesMod {
  type Instruction = Double | String | AnimationDefinition | (js.Array[AnimationDefinition | Double])
  type TrackActions = StringDictionary[Action]
  type Tracks = StringDictionary[js.Array[AnimationDefinition]]
}
