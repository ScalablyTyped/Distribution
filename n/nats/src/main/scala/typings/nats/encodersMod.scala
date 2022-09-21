package typings.nats

import typings.std.TextDecoder
import typings.std.TextEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodersMod {
  
  @JSImport("nats/lib/nats-base-client/encoders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nats/lib/nats-base-client/encoders", "TD")
  @js.native
  val TD: TextDecoder = js.native
  
  @JSImport("nats/lib/nats-base-client/encoders", "TE")
  @js.native
  val TE: TextEncoder = js.native
  
  inline def decode(a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encode(a: String*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(a.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
}
