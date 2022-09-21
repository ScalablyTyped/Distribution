package typings.polycrc

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("polycrc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("polycrc", "CRC")
  @js.native
  open class CRC_ protected () extends StObject {
    def this(width: Double, poly: Double, xor_in: Double, xor_out: Double, reflect: Boolean) = this()
    
    def calculate(buffer: Buffer): Double = js.native
    
    def calculate_no_table(buffer: Buffer): Double = js.native
    
    def gen_table(): js.typedarray.Int32Array = js.native
    
    def print_table(): String = js.native
  }
  
  inline def crc(width: Double, poly: Double, xor_in: Double, xor_out: Double, reflect: Boolean): js.Function1[/* buffer */ Buffer, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("crc")(width.asInstanceOf[js.Any], poly.asInstanceOf[js.Any], xor_in.asInstanceOf[js.Any], xor_out.asInstanceOf[js.Any], reflect.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* buffer */ Buffer, Double]]
  
  @JSImport("polycrc", "crc1")
  @js.native
  val crc1: CRC_ = js.native
  
  @JSImport("polycrc", "crc10")
  @js.native
  val crc10: CRC_ = js.native
  
  @JSImport("polycrc", "crc16")
  @js.native
  val crc16: CRC_ = js.native
  
  @JSImport("polycrc", "crc24")
  @js.native
  val crc24: CRC_ = js.native
  
  @JSImport("polycrc", "crc32")
  @js.native
  val crc32: CRC_ = js.native
  
  @JSImport("polycrc", "crc32c")
  @js.native
  val crc32c: CRC_ = js.native
  
  @JSImport("polycrc", "crc6")
  @js.native
  val crc6: CRC_ = js.native
  
  @JSImport("polycrc", "crc8")
  @js.native
  val crc8: CRC_ = js.native
}
