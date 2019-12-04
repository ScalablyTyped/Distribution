package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCompositorsMultiMod {
  import typings.popmotion.libActionMod.Action
  import typings.popmotion.libActionTypesMod.ColdSubscription

  type ActionStarter[I] = js.Function2[/* action */ Action, /* key */ I, ColdSubscription]
}
