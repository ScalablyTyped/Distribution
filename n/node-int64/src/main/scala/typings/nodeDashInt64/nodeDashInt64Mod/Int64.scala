package typings.nodeDashInt64.nodeDashInt64Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Int64 extends js.Object {
  var buffer: Buffer = js.native
  var offset: Double = js.native
  def _2scomp(): Unit = js.native
  def compare(other: Int64): Double = js.native
  def copy(targetBuffer: Buffer): Unit = js.native
  def copy(targetBuffer: Buffer, targetOffset: Double): Unit = js.native
  def equals(other: Int64): Boolean = js.native
  def inspect(): String = js.native
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

