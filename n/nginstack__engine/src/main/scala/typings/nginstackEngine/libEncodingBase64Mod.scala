package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEncodingBase64Mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/encoding/Base64", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Base64
  @JSImport("@nginstack/engine/lib/encoding/Base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base64", "ARRAY_BUFFER_DECODING")
  @js.native
  def ARRAY_BUFFER_DECODING: Double = js.native
  inline def ARRAY_BUFFER_DECODING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARRAY_BUFFER_DECODING")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/encoding/Base64", "MIME_ENCODING")
  @js.native
  def MIME_ENCODING: Double = js.native
  inline def MIME_ENCODING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIME_ENCODING")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/encoding/Base64", "STANDARD_ENCODING")
  @js.native
  def STANDARD_ENCODING: Double = js.native
  inline def STANDARD_ENCODING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STANDARD_ENCODING")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/encoding/Base64", "STRING_DECODING")
  @js.native
  def STRING_DECODING: Double = js.native
  inline def STRING_DECODING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING_DECODING")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/encoding/Base64", "URL_ENCODING")
  @js.native
  def URL_ENCODING: Double = js.native
  inline def URL_ENCODING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL_ENCODING")(x.asInstanceOf[js.Any])
  
  inline def decode(str: String): String | js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.ArrayBuffer]
  inline def decode(str: String, decodeFormat: Double): String | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], decodeFormat.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer]
  inline def decode(str: js.typedarray.ArrayBuffer): String | js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.ArrayBuffer]
  inline def decode(str: js.typedarray.ArrayBuffer, decodeFormat: Double): String | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], decodeFormat.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer]
  
  inline def encode(bin: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(bin: String, encodeFormat: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], encodeFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(bin: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(bin: js.typedarray.ArrayBuffer, encodeFormat: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], encodeFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(bin: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(bin: js.typedarray.Uint8Array, encodeFormat: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], encodeFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(bin: MemoryStream): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(bin: MemoryStream, encodeFormat: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], encodeFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(bin: typings.std.File): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(bin: typings.std.File, encodeFormat: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], encodeFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Base64 extends StObject
  
  type File = typings.nginstackEngine.libIoFileMod.^
  
  type MemoryStream = typings.nginstackEngine.libIoMemoryStreamMod.^
}
