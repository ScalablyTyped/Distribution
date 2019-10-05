package typings.popmotion

import org.scalablytyped.runtime.StringDictionary
import typings.popmotion.libActionMod.Action
import typings.popmotion.libCompositorsCompositeMod.ActionMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/compositors/composite", JSImport.Namespace)
@js.native
object libCompositorsCompositeMod extends js.Object {
  def default(actions: ActionMap): Action = js.native
  type ActionMap = StringDictionary[Action]
}

