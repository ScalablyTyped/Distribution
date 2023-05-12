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
  def BASE32HEX: String = js.native
  inline def BASE32HEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE32HEX")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/encoding/Base32", "BASE32HEX_NOPAD")
  @js.native
  def BASE32HEX_NOPAD: String = js.native
  inline def BASE32HEX_NOPAD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE32HEX_NOPAD")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/encoding/Base32", "BASE32")
  @js.native
  def BASE32_ : String = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base32", "BASE32_DNSCURVE")
  @js.native
  def BASE32_DNSCURVE: String = js.native
  inline def BASE32_DNSCURVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE32_DNSCURVE")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/encoding/Base32", "BASE32_DNSSEC")
  @js.native
  def BASE32_DNSSEC: String = js.native
  inline def BASE32_DNSSEC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE32_DNSSEC")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/encoding/Base32", "BASE32_NOPAD")
  @js.native
  def BASE32_NOPAD: String = js.native
  inline def BASE32_NOPAD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE32_NOPAD")(x.asInstanceOf[js.Any])
  
  inline def BASE32__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE32")(x.asInstanceOf[js.Any])
  
  inline def decode(str: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def decode(str: String, variant: Unit, resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], variant.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def decode(str: String, variant: Base32Variant): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def decode(str: String, variant: Base32Variant, resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], variant.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  
  inline def decodeStream(input: MemoryStream, output: MemoryStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decodeStream(input: MemoryStream, output: MemoryStream, variant: Base32Variant): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decodeStream(input: MemoryStream, output: typings.std.File): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decodeStream(input: MemoryStream, output: typings.std.File, variant: Base32Variant): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decodeStream(input: typings.std.File, output: MemoryStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decodeStream(input: typings.std.File, output: MemoryStream, variant: Base32Variant): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decodeStream(input: typings.std.File, output: typings.std.File): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decodeStream(input: typings.std.File, output: typings.std.File, variant: Base32Variant): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def encode(bin: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(bin: String, variant: Base32Variant): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(bin: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(bin: js.typedarray.ArrayBuffer, variant: Base32Variant): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(bin: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(bin: js.typedarray.Uint8Array, variant: Base32Variant): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeStream(input: MemoryStream, output: MemoryStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def encodeStream(input: MemoryStream, output: MemoryStream, variant: Base32Variant): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def encodeStream(input: MemoryStream, output: typings.std.File): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def encodeStream(input: MemoryStream, output: typings.std.File, variant: Base32Variant): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def encodeStream(input: typings.std.File, output: MemoryStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def encodeStream(input: typings.std.File, output: MemoryStream, variant: Base32Variant): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def encodeStream(input: typings.std.File, output: typings.std.File): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def encodeStream(input: typings.std.File, output: typings.std.File, variant: Base32Variant): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Base32 extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.nginstackEngine.nginstackEngineStrings.base32
    - typings.nginstackEngine.nginstackEngineStrings.base32_nopad
    - typings.nginstackEngine.nginstackEngineStrings.base32hex
    - typings.nginstackEngine.nginstackEngineStrings.base32hex_nopad
    - typings.nginstackEngine.nginstackEngineStrings.base32_dnssec
    - typings.nginstackEngine.nginstackEngineStrings.base32_dnscurve
  */
  trait Base32Variant extends StObject
  object Base32Variant {
    
    inline def base32: typings.nginstackEngine.nginstackEngineStrings.base32 = "base32".asInstanceOf[typings.nginstackEngine.nginstackEngineStrings.base32]
    
    inline def base32_dnscurve: typings.nginstackEngine.nginstackEngineStrings.base32_dnscurve = "base32_dnscurve".asInstanceOf[typings.nginstackEngine.nginstackEngineStrings.base32_dnscurve]
    
    inline def base32_dnssec: typings.nginstackEngine.nginstackEngineStrings.base32_dnssec = "base32_dnssec".asInstanceOf[typings.nginstackEngine.nginstackEngineStrings.base32_dnssec]
    
    inline def base32_nopad: typings.nginstackEngine.nginstackEngineStrings.base32_nopad = "base32_nopad".asInstanceOf[typings.nginstackEngine.nginstackEngineStrings.base32_nopad]
    
    inline def base32hex: typings.nginstackEngine.nginstackEngineStrings.base32hex = "base32hex".asInstanceOf[typings.nginstackEngine.nginstackEngineStrings.base32hex]
    
    inline def base32hex_nopad: typings.nginstackEngine.nginstackEngineStrings.base32hex_nopad = "base32hex_nopad".asInstanceOf[typings.nginstackEngine.nginstackEngineStrings.base32hex_nopad]
  }
  
  type File = typings.nginstackEngine.libIoFileMod.^
  
  type MemoryStream = typings.nginstackEngine.libIoMemoryStreamMod.^
}
