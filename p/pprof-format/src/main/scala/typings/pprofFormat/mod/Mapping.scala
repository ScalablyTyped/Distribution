package typings.pprofFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pprof-format", "Mapping")
@js.native
open class Mapping protected () extends StObject {
  def this(data: MappingInput) = this()
  
  def _encodeToBuffer(buffer: js.typedarray.Uint8Array): Double = js.native
  def _encodeToBuffer(buffer: js.typedarray.Uint8Array, offset: Double): Double = js.native
  
  var buildId: Numeric = js.native
  
  def encode(): js.typedarray.Uint8Array = js.native
  def encode(buffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  var fileOffset: Numeric = js.native
  
  var filename: Numeric = js.native
  
  var hasFilenames: Boolean = js.native
  
  var hasFunctions: Boolean = js.native
  
  var hasInlineFrames: Boolean = js.native
  
  var hasLineNumbers: Boolean = js.native
  
  var id: Numeric = js.native
  
  def length: Double = js.native
  
  var memoryLimit: Numeric = js.native
  
  var memoryStart: Numeric = js.native
}
/* static members */
object Mapping {
  
  @JSImport("pprof-format", "Mapping")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buffer: js.typedarray.Uint8Array): Mapping = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Mapping]
  
  inline def decodeValue(data: MappingInput, field: Double, buffer: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeValue")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
