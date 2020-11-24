package typings.multibase

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.ArrayLike
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("multibase/dist/src/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def concat(arrs: js.Array[ArrayLike[Double]], length: Double): Uint8Array = js.native
  
  def decodeText(bytes: ArrayBuffer): String = js.native
  def decodeText(bytes: ArrayBufferView): String = js.native
  
  def encodeText(text: String): Uint8Array = js.native
}
