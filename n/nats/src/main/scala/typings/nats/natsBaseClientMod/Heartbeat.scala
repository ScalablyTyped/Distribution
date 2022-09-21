package typings.nats.natsBaseClientMod

import typings.nats.heartbeatsMod.PH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "Heartbeat")
@js.native
open class Heartbeat protected ()
  extends typings.nats.internalModMod.Heartbeat {
  def this(ph: PH, interval: Double, maxOut: Double) = this()
}
