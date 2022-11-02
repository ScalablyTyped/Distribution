package typings.pprofFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pprof-format", "Function")
@js.native
open class Function protected () extends StObject {
  def this(data: FunctionInput) = this()
  
  def _encodeToBuffer(buffer: js.typedarray.Uint8Array): Double = js.native
  def _encodeToBuffer(buffer: js.typedarray.Uint8Array, offset: Double): Double = js.native
  
  def encode(): js.typedarray.Uint8Array = js.native
  def encode(buffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  var filename: Numeric = js.native
  
  var id: Numeric = js.native
  
  def length: Double = js.native
  
  var name: Numeric = js.native
  
  var startLine: Numeric = js.native
  
  var systemName: Numeric = js.native
}
/* static members */
object Function {
  
  @JSImport("pprof-format", "Function")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buffer: js.typedarray.Uint8Array): Function = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Function]
  
  inline def decodeValue(data: FunctionInput, field: Double, buffer: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeValue")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
