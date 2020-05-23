package typings.openfin.channelChannelMod

import typings.openfin.anon.FnCall
import typings.openfin.identityMod.Identity
import typings.openfin.openfinBooleans.`true`
import typings.openfin.openfinStrings.`request-external-authorization`
import typings.openfin.shapesMod.ProviderIdentity
import typings.openfin.transportMod.AuthorizationPayload
import typings.openfin.transportMod.Message
import typings.openfin.transportMod.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/interappbus/channel/channel", "ProtectedItems")
@js.native
class ProtectedItems protected () extends js.Object {
  def this(providerIdentity: ProviderIdentity, send: FnCall) = this()
  var providerIdentity: ProviderIdentity = js.native
  @JSName("sendRaw")
  var sendRaw_Original: FnCall = js.native
  def send(to: Identity, action: String, payload: js.Any): js.Promise[Message[Unit]] = js.native
  def sendRaw(action: String, payload: js.Object, uncorrelated: Boolean): js.Promise[Message[Payload]] = js.native
  def sendRaw(action: `request-external-authorization`, payload: js.Object, uncorrelated: `true`): js.Promise[Message[AuthorizationPayload]] = js.native
}

