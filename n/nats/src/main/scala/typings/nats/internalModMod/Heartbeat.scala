package typings.nats.internalModMod

import typings.nats.heartbeatsMod.PH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/internal_mod", "Heartbeat")
@js.native
open class Heartbeat protected ()
  extends typings.nats.heartbeatsMod.Heartbeat {
  def this(ph: PH, interval: Double, maxOut: Double) = this()
}
