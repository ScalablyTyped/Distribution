package typings
package nodeDashInt64Lib.nodeDashInt64Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Int64 extends js.Object {
  var buffer: nodeLib.Buffer = js.native
  var offset: scala.Double = js.native
  def _2scomp(): scala.Unit = js.native
  def compare(other: Int64): scala.Double = js.native
  def copy(targetBuffer: nodeLib.Buffer): scala.Unit = js.native
  def copy(targetBuffer: nodeLib.Buffer, targetOffset: scala.Double): scala.Unit = js.native
  def equals(other: Int64): scala.Boolean = js.native
  def inspect(): java.lang.String = js.native
  // setValue(hi, lo) - Raw bits as two 32-bit values
  def setValue(hi: scala.Double, lo: scala.Double): scala.Unit = js.native
  // setValue(number) - Number (throws if n is outside int64 range)
  def setValue(num: scala.Double): scala.Unit = js.native
  // setValue(string) - A hexidecimal string
  def setValue(str: java.lang.String): scala.Unit = js.native
  def toBuffer(): nodeLib.Buffer = js.native
  def toBuffer(rawBuffer: scala.Boolean): nodeLib.Buffer = js.native
  def toNumber(): scala.Double = js.native
  def toNumber(allowImprecise: scala.Boolean): scala.Double = js.native
  def toOctetString(): java.lang.String = js.native
  def toOctetString(separator: java.lang.String): java.lang.String = js.native
  def toString(radix: scala.Double): java.lang.String = js.native
}

