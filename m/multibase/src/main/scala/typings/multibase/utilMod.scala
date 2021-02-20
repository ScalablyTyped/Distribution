package typings.multibase

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.ArrayLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("multibase/dist/src/util", "concat")
  @js.native
  def concat(arrs: js.Array[ArrayLike[Double]], length: Double): Uint8Array = js.native
  
  @JSImport("multibase/dist/src/util", "decodeText")
  @js.native
  def decodeText(bytes: ArrayBuffer): String = js.native
  @JSImport("multibase/dist/src/util", "decodeText")
  @js.native
  def decodeText(bytes: ArrayBufferView): String = js.native
  
  @JSImport("multibase/dist/src/util", "encodeText")
  @js.native
  def encodeText(text: String): Uint8Array = js.native
}
