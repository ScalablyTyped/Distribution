package typings.nats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codecMod {
  
  @JSImport("nats/lib/nats-base-client/codec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def JSONCodec[T](): Codec[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("JSONCodec")().asInstanceOf[Codec[T]]
  inline def JSONCodec[T](reviver: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): Codec[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("JSONCodec")(reviver.asInstanceOf[js.Any]).asInstanceOf[Codec[T]]
  
  inline def StringCodec(): Codec[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("StringCodec")().asInstanceOf[Codec[String]]
  
  trait Codec[T] extends StObject {
    
    def decode(a: js.typedarray.Uint8Array): T
    
    def encode(d: T): js.typedarray.Uint8Array
  }
  object Codec {
    
    inline def apply[T](decode: js.typedarray.Uint8Array => T, encode: T => js.typedarray.Uint8Array): Codec[T] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Codec[T]]
    }
    
    extension [Self <: Codec[?], T](x: Self & Codec[T]) {
      
      inline def setDecode(value: js.typedarray.Uint8Array => T): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: T => js.typedarray.Uint8Array): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
}
