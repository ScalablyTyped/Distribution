package typings.meteor.anon

import org.scalablytyped.runtime.Instantiable1
import typings.bson.mod.Long
import typings.mongodb.mod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTimestamp
  extends StObject
     with Instantiable1[/* int */ js.BigInt, Timestamp] {
  
  val MAX_VALUE: Long = js.native
  
  /**
    * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
    *
    * @param lowBits - the low 32-bits.
    * @param highBits - the high 32-bits.
    */
  def fromBits(lowBits: Double, highBits: Double): typings.bson.mod.Timestamp = js.native
  
  /** Returns a Timestamp represented by the given (32-bit) integer value. */
  def fromInt(value: Double): typings.bson.mod.Timestamp = js.native
  
  /** Returns a Timestamp representing the given number value, provided that it is a finite number. Otherwise, zero is returned. */
  def fromNumber(value: Double): typings.bson.mod.Timestamp = js.native
  
  /**
    * Returns a Timestamp from the given string, optionally using the given radix.
    *
    * @param str - the textual representation of the Timestamp.
    * @param optRadix - the radix in which the text is written.
    */
  def fromString(str: String, optRadix: Double): typings.bson.mod.Timestamp = js.native
}
