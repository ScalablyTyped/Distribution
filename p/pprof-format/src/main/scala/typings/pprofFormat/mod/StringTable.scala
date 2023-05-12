package typings.pprofFormat.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pprof-format", "StringTable")
@js.native
open class StringTable () extends StObject {
  def this(tok: js.Symbol) = this()
  
  def _decodeString(buffer: js.typedarray.Uint8Array): Unit = js.native
  
  def _encodeToBuffer(buffer: js.typedarray.Uint8Array, offset: Double): Double = js.native
  
  def dedup(string: String): Double = js.native
  
  def encode(): js.typedarray.Uint8Array = js.native
  def encode(buffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  def encodedLength: Double = js.native
  
  /* private */ var `private`: Any = js.native
  
  var strings: js.Array[String] = js.native
}
/* static members */
object StringTable {
  
  @JSImport("pprof-format", "StringTable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _encodeString(string: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("_encodeString")(string.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def _encodeStringFromUtf8(stringBuffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("_encodeStringFromUtf8")(stringBuffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def _encodeStringFromUtf8(stringBuffer: Buffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("_encodeStringFromUtf8")(stringBuffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
