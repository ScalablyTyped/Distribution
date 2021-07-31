package typings.multibase

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.ArrayLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("multibase/dist/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def concat(arrs: js.Array[ArrayLike[Double]], length: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(arrs.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  @scala.inline
  def decodeText(bytes: ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def decodeText(bytes: ArrayBufferView): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def encodeText(text: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeText")(text.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
}
