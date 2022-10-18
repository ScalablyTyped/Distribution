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
  val ARRAY_BUFFER_DECODING: Double = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base64", "MIME_ENCODING")
  @js.native
  val MIME_ENCODING: Double = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base64", "STANDARD_ENCODING")
  @js.native
  val STANDARD_ENCODING: Double = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base64", "STRING_DECODING")
  @js.native
  val STRING_DECODING: Double = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base64", "URL_ENCODING")
  @js.native
  val URL_ENCODING: Double = js.native
  
  inline def decode(str: String): String | js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.ArrayBuffer]
  inline def decode(str: String, decodeFormat: Double): String | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], decodeFormat.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer]
  inline def decode(str: js.typedarray.ArrayBuffer): String | js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.ArrayBuffer]
  inline def decode(str: js.typedarray.ArrayBuffer, decodeFormat: Double): String | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], decodeFormat.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer]
  
  inline def encode(bin: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(bin: Any, encodeFormat: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], encodeFormat.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Base64 extends StObject
}
