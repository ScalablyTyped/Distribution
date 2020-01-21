package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object timelineTypesMod {
  type Instruction = scala.Double | java.lang.String | typings.popmotion.timelineTypesMod.AnimationDefinition | (js.Array[typings.popmotion.timelineTypesMod.AnimationDefinition | scala.Double])
  type TrackActions = org.scalablytyped.runtime.StringDictionary[typings.popmotion.actionMod.Action]
  type Tracks = org.scalablytyped.runtime.StringDictionary[js.Array[typings.popmotion.timelineTypesMod.AnimationDefinition]]
}
