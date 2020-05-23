package typings.popmotion

import org.scalablytyped.runtime.StringDictionary
import typings.popmotion.actionMod.Action
import typings.popmotion.actionTypesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/compositors/composite", JSImport.Namespace)
@js.native
object compositeMod extends js.Object {
  def default(actions: ActionMap): Action[ColdSubscription] = js.native
  type ActionMap = StringDictionary[Action[ColdSubscription]]
}

