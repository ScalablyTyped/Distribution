package typings.pprofFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pprof-format", "Profile")
@js.native
open class Profile () extends StObject {
  def this(data: ProfileInput) = this()
  
  def _encodeToBuffer(buffer: js.typedarray.Uint8Array): Double = js.native
  def _encodeToBuffer(buffer: js.typedarray.Uint8Array, offset: Double): Double = js.native
  
  var comment: js.Array[Numeric] = js.native
  
  var defaultSampleType: Numeric = js.native
  
  var dropFrames: Numeric = js.native
  
  var durationNanos: Numeric = js.native
  
  def encode(): js.typedarray.Uint8Array = js.native
  def encode(buffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  var function: js.Array[Function] = js.native
  
  var keepFrames: Numeric = js.native
  
  def length: Double = js.native
  
  var location: js.Array[Location] = js.native
  
  var mapping: js.Array[Mapping] = js.native
  
  var period: Numeric = js.native
  
  var periodType: js.UndefOr[ValueType] = js.native
  
  var sample: js.Array[Sample] = js.native
  
  var sampleType: js.Array[ValueType] = js.native
  
  var stringTable: StringTable = js.native
  
  var timeNanos: Numeric = js.native
}
/* static members */
object Profile {
  
  @JSImport("pprof-format", "Profile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buffer: js.typedarray.Uint8Array): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Profile]
  
  inline def decodeValue(data: ProfileInput, field: Double, buffer: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeValue")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
