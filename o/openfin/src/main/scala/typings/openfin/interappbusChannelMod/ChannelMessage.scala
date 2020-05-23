package typings.openfin.interappbusChannelMod

import typings.openfin.identityMod.Identity
import typings.openfin.shapesMod.ProviderIdentity
import typings.openfin.transportMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelMessage
  extends Message[js.Any] {
  var ackToSender: js.Any = js.native
  var connectAction: Boolean = js.native
  var providerIdentity: ProviderIdentity = js.native
  var senderIdentity: Identity = js.native
}

