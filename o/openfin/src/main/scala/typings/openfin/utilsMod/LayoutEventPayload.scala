package typings.openfin.utilsMod

import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutEventPayload extends js.Object {
  var identity: Identity
  var reason: js.UndefOr[String] = js.undefined
  var success: Boolean
}

object LayoutEventPayload {
  @scala.inline
  def apply(identity: Identity, success: Boolean, reason: String = null): LayoutEventPayload = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutEventPayload]
  }
}

