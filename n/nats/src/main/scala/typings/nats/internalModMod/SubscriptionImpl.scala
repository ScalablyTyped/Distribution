package typings.nats.internalModMod

import typings.nats.typesMod.SubscriptionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/internal_mod", "SubscriptionImpl")
@js.native
open class SubscriptionImpl protected ()
  extends typings.nats.subscriptionMod.SubscriptionImpl {
  def this(protocol: typings.nats.protocolMod.ProtocolHandler, subject: String) = this()
  def this(protocol: typings.nats.protocolMod.ProtocolHandler, subject: String, opts: SubscriptionOptions) = this()
}
