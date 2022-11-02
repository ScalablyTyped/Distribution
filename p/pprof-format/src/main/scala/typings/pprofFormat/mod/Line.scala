package typings.pprofFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pprof-format", "Line")
@js.native
open class Line protected () extends StObject {
  def this(data: LineInput) = this()
  
  def _encodeToBuffer(buffer: js.typedarray.Uint8Array): Double = js.native
  def _encodeToBuffer(buffer: js.typedarray.Uint8Array, offset: Double): Double = js.native
  
  def encode(): js.typedarray.Uint8Array = js.native
  def encode(buffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  var functionId: Numeric = js.native
  
  def length: Double = js.native
  
  var line: Numeric = js.native
}
/* static members */
object Line {
  
  @JSImport("pprof-format", "Line")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buffer: js.typedarray.Uint8Array): Line = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Line]
  
  inline def decodeValue(data: LineInput, field: Double, buffer: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeValue")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
