package typings.nats.natsBaseClientMod

import typings.nats.typedsubMod.TypedSubscriptionOptions
import typings.nats.typesMod.NatsConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "TypedSubscription")
@js.native
open class TypedSubscription[T] protected ()
  extends typings.nats.internalModMod.TypedSubscription[T] {
  def this(nc: NatsConnection, subject: String, opts: TypedSubscriptionOptions[T]) = this()
}
