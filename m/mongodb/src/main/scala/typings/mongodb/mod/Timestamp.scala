package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Timestamp")
@js.native
class Timestamp ()
  extends typings.bson.mod.Timestamp
/* static members */
object Timestamp {
  
  @JSImport("mongodb", "Timestamp.MAX_VALUE")
  @js.native
  val MAX_VALUE: typings.bson.mod.Timestamp = js.native
  
  @JSImport("mongodb", "Timestamp.MIN_VALUE")
  @js.native
  val MIN_VALUE: typings.bson.mod.Timestamp = js.native
  
  @JSImport("mongodb", "Timestamp.NEG_ONE")
  @js.native
  val NEG_ONE: typings.bson.mod.Timestamp = js.native
  
  @JSImport("mongodb", "Timestamp.ONE")
  @js.native
  val ONE: typings.bson.mod.Timestamp = js.native
  
  @JSImport("mongodb", "Timestamp.ZERO")
  @js.native
  val ZERO: typings.bson.mod.Timestamp = js.native
  
  /**
    * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  @JSImport("mongodb", "Timestamp.fromBits")
  @js.native
  def fromBits(lowBits: scala.Double, highBits: scala.Double): typings.bson.mod.Timestamp = js.native
  
  /** Returns a Timestamp represented by the given (32-bit) integer value */
  @JSImport("mongodb", "Timestamp.fromInt")
  @js.native
  def fromInt(value: scala.Double): typings.bson.mod.Timestamp = js.native
  
  /** Returns a Timestamp representing the given number value, provided that it is a finite number. */
  @JSImport("mongodb", "Timestamp.fromNumber")
  @js.native
  def fromNumber(value: scala.Double): typings.bson.mod.Timestamp = js.native
  
  /**
    * Returns a Timestamp from the given string.
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  @JSImport("mongodb", "Timestamp.fromString")
  @js.native
  def fromString(str: String): typings.bson.mod.Timestamp = js.native
  @JSImport("mongodb", "Timestamp.fromString")
  @js.native
  def fromString(str: String, opt_radix: scala.Double): typings.bson.mod.Timestamp = js.native
}
