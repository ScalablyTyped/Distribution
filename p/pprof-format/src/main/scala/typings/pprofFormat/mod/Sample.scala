package typings.pprofFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pprof-format", "Sample")
@js.native
open class Sample protected () extends StObject {
  def this(data: SampleInput) = this()
  
  def _encodeToBuffer(buffer: js.typedarray.Uint8Array): Double = js.native
  def _encodeToBuffer(buffer: js.typedarray.Uint8Array, offset: Double): Double = js.native
  
  def encode(): js.typedarray.Uint8Array = js.native
  def encode(buffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  var label: js.Array[Label] = js.native
  
  def length: Double = js.native
  
  var locationId: js.Array[Numeric] = js.native
  
  var value: js.Array[Numeric] = js.native
}
/* static members */
object Sample {
  
  @JSImport("pprof-format", "Sample")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buffer: js.typedarray.Uint8Array): Sample = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Sample]
  
  inline def decodeValue(data: SampleInput, field: Double, buffer: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeValue")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
