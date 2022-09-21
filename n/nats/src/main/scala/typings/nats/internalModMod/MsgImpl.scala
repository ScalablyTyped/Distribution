package typings.nats.internalModMod

import typings.nats.parserMod.MsgArg
import typings.nats.protocolMod.Publisher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/internal_mod", "MsgImpl")
@js.native
open class MsgImpl protected ()
  extends typings.nats.msgMod.MsgImpl {
  def this(msg: MsgArg, data: js.typedarray.Uint8Array, publisher: Publisher) = this()
}
