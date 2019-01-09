package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FromBits
  extends org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.Long] {
  val MAX_VALUE: bsonLib.bsonMod.Long = js.native
  val MIN_VALUE: bsonLib.bsonMod.Long = js.native
  val NEG_ONE: bsonLib.bsonMod.Long = js.native
  val ONE: bsonLib.bsonMod.Long = js.native
  val ZERO: bsonLib.bsonMod.Long = js.native
  /**
    * Returns a Long representing the 64-bit integer that comes by concatenating the given high and low bits. Each is assumed to use 32 bits.
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  def fromBits(lowBits: scala.Double, highBits: scala.Double): bsonLib.bsonMod.Long = js.native
  /** Returns a Long representing the given (32-bit) integer value. */
  def fromInt(i: scala.Double): bsonLib.bsonMod.Long = js.native
  /** Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned. */
  def fromNumber(n: scala.Double): bsonLib.bsonMod.Long = js.native
  /**
    * Returns a Long representation of the given string
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  def fromString(s: java.lang.String): bsonLib.bsonMod.Long = js.native
  def fromString(s: java.lang.String, opt_radix: scala.Double): bsonLib.bsonMod.Long = js.native
}

