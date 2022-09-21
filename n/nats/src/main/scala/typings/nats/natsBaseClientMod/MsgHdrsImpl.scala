package typings.nats.natsBaseClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "MsgHdrsImpl")
@js.native
open class MsgHdrsImpl ()
  extends typings.nats.internalModMod.MsgHdrsImpl
/* static members */
object MsgHdrsImpl {
  
  @JSImport("nats/lib/src/nats-base-client", "MsgHdrsImpl")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(a: js.typedarray.Uint8Array): typings.nats.headersMod.MsgHdrsImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(a.asInstanceOf[js.Any]).asInstanceOf[typings.nats.headersMod.MsgHdrsImpl]
  
  inline def validHeaderValue(k: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("validHeaderValue")(k.asInstanceOf[js.Any]).asInstanceOf[String]
}
