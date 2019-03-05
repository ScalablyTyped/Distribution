package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigIntConstructor extends js.Object {
  def apply(): stdLib.BigInt = js.native
  def apply(value: js.Any): stdLib.BigInt = js.native
  /**
    * Interprets the low bits of a BigInt as a 2's-complement signed integer.
    * All higher bits are discarded.
    * @param bits The number of low bits to use
    * @param int The BigInt whose bits to extract
    */
  def asIntN(bits: scala.Double, int: stdLib.BigInt): stdLib.BigInt = js.native
  /**
    * Interprets the low bits of a BigInt as an unsigned integer.
    * All higher bits are discarded.
    * @param bits The number of low bits to use
    * @param int The BigInt whose bits to extract
    */
  def asUintN(bits: scala.Double, int: stdLib.BigInt): stdLib.BigInt = js.native
}

