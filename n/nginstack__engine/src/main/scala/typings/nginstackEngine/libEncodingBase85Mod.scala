package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEncodingBase85Mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/encoding/Base85", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Base85
  @JSImport("@nginstack/engine/lib/encoding/Base85", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base85", "ARRAY_BUFFER_DECODING")
  @js.native
  val ARRAY_BUFFER_DECODING: Double = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base85", "STRING_DECODING")
  @js.native
  val STRING_DECODING: Double = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Base85", "Z85")
  @js.native
  val Z85: String = js.native
  
  inline def decode(str: String): String | js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.ArrayBuffer]
  inline def decode(str: String, encoding: String): String | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer]
  inline def decode(str: String, encoding: String, decodeFormat: Double): String | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], decodeFormat.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer]
  inline def decode(str: String, encoding: Unit, decodeFormat: Double): String | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], decodeFormat.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer]
  
  inline def decodeStream(input: Any, output: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decodeStream(input: Any, output: Any, encoding: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def encode(bin: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(bin: Any, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(bin: Any, encoding: String, noPadding: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], noPadding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(bin: Any, encoding: Unit, noPadding: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bin.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], noPadding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeStream(input: Any, output: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def encodeStream(input: Any, output: Any, encoding: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Base85 extends StObject
}
