package typings.nats.natsBaseClientMod

import typings.nats.parserMod.MsgArg
import typings.nats.protocolMod.Publisher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "MsgImpl")
@js.native
open class MsgImpl protected ()
  extends typings.nats.internalModMod.MsgImpl {
  def this(msg: MsgArg, data: js.typedarray.Uint8Array, publisher: Publisher) = this()
}
