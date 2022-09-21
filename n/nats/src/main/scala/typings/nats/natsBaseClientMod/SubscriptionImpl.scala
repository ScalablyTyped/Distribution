package typings.nats.natsBaseClientMod

import typings.nats.typesMod.SubscriptionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "SubscriptionImpl")
@js.native
open class SubscriptionImpl protected ()
  extends typings.nats.internalModMod.SubscriptionImpl {
  def this(protocol: typings.nats.protocolMod.ProtocolHandler, subject: String) = this()
  def this(protocol: typings.nats.protocolMod.ProtocolHandler, subject: String, opts: SubscriptionOptions) = this()
}
