package typings.nats.internalModMod

import typings.nats.benchMod.BenchOpts
import typings.nats.typesMod.NatsConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/internal_mod", "Bench")
@js.native
open class Bench protected ()
  extends typings.nats.benchMod.Bench {
  def this(nc: NatsConnection) = this()
  def this(nc: NatsConnection, opts: BenchOpts) = this()
}
