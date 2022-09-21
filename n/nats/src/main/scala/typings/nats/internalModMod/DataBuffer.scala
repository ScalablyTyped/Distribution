package typings.nats.internalModMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/internal_mod", "DataBuffer")
@js.native
open class DataBuffer ()
  extends typings.nats.databufferMod.DataBuffer
/* static members */
object DataBuffer {
  
  @JSImport("nats/lib/nats-base-client/internal_mod", "DataBuffer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat(bufs: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(bufs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromAscii(m: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAscii")(m.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toAscii(a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAscii")(a.asInstanceOf[js.Any]).asInstanceOf[String]
}
