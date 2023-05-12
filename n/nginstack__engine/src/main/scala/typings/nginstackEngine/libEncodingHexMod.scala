package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEncodingHexMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/encoding/Hex", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Hex
  @JSImport("@nginstack/engine/lib/encoding/Hex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeString(s: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeString")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeToString(src: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeToString")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Hex extends StObject
}
