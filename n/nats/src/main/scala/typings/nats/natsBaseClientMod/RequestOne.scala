package typings.nats.natsBaseClientMod

import typings.nats.typesMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "RequestOne")
@js.native
open class RequestOne protected ()
  extends typings.nats.internalModMod.RequestOne {
  def this(mux: typings.nats.muxsubscriptionMod.MuxSubscription, requestSubject: String) = this()
  def this(mux: typings.nats.muxsubscriptionMod.MuxSubscription, requestSubject: String, opts: RequestOptions) = this()
}
