package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassTimestamp
  extends org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.Timestamp] {
  val MAX_VALUE: bsonLib.bsonMod.Timestamp = js.native
  val MIN_VALUE: bsonLib.bsonMod.Timestamp = js.native
  val NEG_ONE: bsonLib.bsonMod.Timestamp = js.native
  val ONE: bsonLib.bsonMod.Timestamp = js.native
  val ZERO: bsonLib.bsonMod.Timestamp = js.native
  /**
    * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  def fromBits(lowBits: scala.Double, highBits: scala.Double): bsonLib.bsonMod.Timestamp = js.native
  /** Returns a Timestamp represented by the given (32-bit) integer value */
  def fromInt(value: scala.Double): bsonLib.bsonMod.Timestamp = js.native
  /** Returns a Timestamp representing the given number value, provided that it is a finite number. */
  def fromNumber(value: scala.Double): bsonLib.bsonMod.Timestamp = js.native
  /**
    * Returns a Timestamp from the given string.
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  def fromString(str: java.lang.String): bsonLib.bsonMod.Timestamp = js.native
  def fromString(str: java.lang.String, opt_radix: scala.Double): bsonLib.bsonMod.Timestamp = js.native
}

