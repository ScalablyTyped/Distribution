package typings.mongorito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongorito", "Long")
@js.native
class Long ()
  extends typings.mongodb.mod.Long
/* static members */
@JSImport("mongorito", "Long")
@js.native
object Long extends js.Object {
  
  val MAX_VALUE: typings.bson.mod.Long = js.native
  
  val MIN_VALUE: typings.bson.mod.Long = js.native
  
  val NEG_ONE: typings.bson.mod.Long = js.native
  
  val ONE: typings.bson.mod.Long = js.native
  
  val ZERO: typings.bson.mod.Long = js.native
  
  /**
    * Returns a Long representing the 64-bit integer that comes by concatenating the given high and low bits. Each is assumed to use 32 bits.
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  def fromBits(lowBits: Double, highBits: Double): typings.bson.mod.Long = js.native
  
  /** Returns a Long representing the given (32-bit) integer value. */
  def fromInt(i: Double): typings.bson.mod.Long = js.native
  
  /** Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned. */
  def fromNumber(n: Double): typings.bson.mod.Long = js.native
  
  /**
    * Returns a Long representation of the given string
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  def fromString(s: String): typings.bson.mod.Long = js.native
  def fromString(s: String, opt_radix: Double): typings.bson.mod.Long = js.native
}
