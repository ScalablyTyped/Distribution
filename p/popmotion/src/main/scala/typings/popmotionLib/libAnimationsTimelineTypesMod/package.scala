package typings
package popmotionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAnimationsTimelineTypesMod {
  type Instruction = scala.Double | java.lang.String | AnimationDefinition | (js.Array[AnimationDefinition | scala.Double])
  type TrackActions = org.scalablytyped.runtime.StringDictionary[popmotionLib.libActionMod.Action]
  type Tracks = org.scalablytyped.runtime.StringDictionary[js.Array[AnimationDefinition]]
}
