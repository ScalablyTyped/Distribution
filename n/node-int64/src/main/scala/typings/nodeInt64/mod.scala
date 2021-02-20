package typings.nodeInt64

import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-int64", JSImport.Namespace)
  @js.native
  class ^ protected () extends Int64 {
    def this(array: Uint8Array) = this()
    def this(buffer: Buffer) = this()
    def this(num: Double) = this()
    def this(str: String) = this()
    def this(array: Uint8Array, offset: Double) = this()
    def this(buffer: Buffer, offset: Double) = this()
    def this(hi: Double, lo: Double) = this()
  }
  @JSImport("node-int64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("node-int64", "MAX_INT")
  @js.native
  def MAX_INT: Double = js.native
  @scala.inline
  def MAX_INT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_INT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("node-int64", "MIN_INT")
  @js.native
  def MIN_INT: Double = js.native
  @scala.inline
  def MIN_INT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_INT")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Int64 extends StObject {
    
    def _2scomp(): Unit = js.native
    
    var buffer: Buffer = js.native
    
    def compare(other: Int64): Double = js.native
    
    def copy(targetBuffer: Buffer): Unit = js.native
    def copy(targetBuffer: Buffer, targetOffset: Double): Unit = js.native
    
    def equals(other: Int64): Boolean = js.native
    
    def inspect(): String = js.native
    
    var offset: Double = js.native
    
    // setValue(hi, lo) - Raw bits as two 32-bit values
    def setValue(hi: Double, lo: Double): Unit = js.native
    // setValue(number) - Number (throws if n is outside int64 range)
    def setValue(num: Double): Unit = js.native
    // setValue(string) - A hexidecimal string
    def setValue(str: String): Unit = js.native
    
    def toBuffer(): Buffer = js.native
    def toBuffer(rawBuffer: Boolean): Buffer = js.native
    
    def toNumber(): Double = js.native
    def toNumber(allowImprecise: Boolean): Double = js.native
    
    def toOctetString(): String = js.native
    def toOctetString(separator: String): String = js.native
    
    def toString(radix: Double): String = js.native
  }
}
