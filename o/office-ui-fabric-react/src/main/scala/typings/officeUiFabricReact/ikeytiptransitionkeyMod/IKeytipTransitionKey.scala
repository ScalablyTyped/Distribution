package typings.officeUiFabricReact.ikeytiptransitionkeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeytipTransitionKey extends js.Object {
  var key: String
  var modifierKeys: js.UndefOr[js.Array[KeytipTransitionModifier]] = js.undefined
}

object IKeytipTransitionKey {
  @scala.inline
  def apply(key: String, modifierKeys: js.Array[KeytipTransitionModifier] = null): IKeytipTransitionKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (modifierKeys != null) __obj.updateDynamic("modifierKeys")(modifierKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipTransitionKey]
  }
}

