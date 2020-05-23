package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object multiMod {
  type ActionStarter[I] = js.Function2[
    /* action */ typings.popmotion.actionMod.Action[typings.popmotion.actionTypesMod.ColdSubscription], 
    /* key */ I, 
    typings.popmotion.actionTypesMod.ColdSubscription
  ]
}
