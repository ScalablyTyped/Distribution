package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEncodingBase32Mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/encoding/Base32", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Base32
  @JSImport("@nginstack/engine/lib/encoding/Base32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base32", "BASE32HEX")
  @js.native
  val BASE32HEX: String = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base32", "BASE32HEX_NOPAD")
  @js.native
  val BASE32HEX_NOPAD: String = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base32", "BASE32")
  @js.native
  val BASE32_ : String = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base32", "BASE32_DNSCURVE")
  @js.native
  val BASE32_DNSCURVE: String = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base32", "BASE32_DNSSEC")
  @js.native
  val BASE32_DNSSEC: String = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base32", "BASE32_NOPAD")
  @js.native
  val BASE32_NOPAD: String = js.native
  
  inline def decode(str: String): String | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array]
  inline def decode(str: String, variant: String): String | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array]
  inline def decode(str: String, variant: String, resultType: String): String | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], variant.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array]
  inline def decode(str: String, variant: Unit, resultType: String): String | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], variant.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array]
  
  inline def decodeStream(input: Any, output: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decodeStream(input: Any, output: Any, variant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def encode(bin: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(bin: String, variant: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(bin: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(bin: js.typedarray.ArrayBuffer, variant: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(bin: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(bin: js.typedarray.Uint8Array, variant: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeStream(input: Any, output: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def encodeStream(input: Any, output: Any, variant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Base32 extends StObject
}
