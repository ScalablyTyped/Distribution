package typings.openfin.anon

import typings.openfin.openfinBooleans.`true`
import typings.openfin.openfinStrings.`request-external-authorization`
import typings.openfin.transportMod.AuthorizationPayload
import typings.openfin.transportMod.Message
import typings.openfin.transportMod.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(action: String, payload: js.Object, uncorrelated: Boolean): js.Promise[Message[Payload]] = js.native
  def apply(action: `request-external-authorization`, payload: js.Object, uncorrelated: `true`): js.Promise[Message[AuthorizationPayload]] = js.native
}

