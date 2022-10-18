package typings.multibase

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilMod {
  
  @JSImport("multibase/dist/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat(arrs: js.Array[ArrayLike[Double]], length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(arrs.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def decodeText(bytes: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeText(bytes: js.typedarray.ArrayBufferView): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeText(text: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeText")(text.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
