package typings.pprofFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pprof-format", "Label")
@js.native
open class Label protected () extends StObject {
  def this(data: LabelInput) = this()
  
  def _encodeToBuffer(buffer: js.typedarray.Uint8Array): Double = js.native
  def _encodeToBuffer(buffer: js.typedarray.Uint8Array, offset: Double): Double = js.native
  
  def encode(): js.typedarray.Uint8Array = js.native
  def encode(buffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  var key: Numeric = js.native
  
  def length: Double = js.native
  
  var num: Numeric = js.native
  
  var numUnit: Numeric = js.native
  
  var str: Numeric = js.native
}
/* static members */
object Label {
  
  @JSImport("pprof-format", "Label")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buffer: js.typedarray.Uint8Array): Label = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Label]
  
  inline def decodeValue(data: LabelInput, field: Double, buffer: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeValue")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
