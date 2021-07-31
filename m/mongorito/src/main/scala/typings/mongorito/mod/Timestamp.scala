package typings.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongorito", "Timestamp")
@js.native
class Timestamp ()
  extends typings.mongodb.mod.Timestamp
/* static members */
object Timestamp {
  
  @JSImport("mongorito", "Timestamp")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mongorito", "Timestamp.MAX_VALUE")
  @js.native
  val MAX_VALUE: typings.bson.mod.Timestamp = js.native
  
  @JSImport("mongorito", "Timestamp.MIN_VALUE")
  @js.native
  val MIN_VALUE: typings.bson.mod.Timestamp = js.native
  
  @JSImport("mongorito", "Timestamp.NEG_ONE")
  @js.native
  val NEG_ONE: typings.bson.mod.Timestamp = js.native
  
  @JSImport("mongorito", "Timestamp.ONE")
  @js.native
  val ONE: typings.bson.mod.Timestamp = js.native
  
  @JSImport("mongorito", "Timestamp.ZERO")
  @js.native
  val ZERO: typings.bson.mod.Timestamp = js.native
  
  /**
    * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  @scala.inline
  def fromBits(lowBits: Double, highBits: Double): typings.bson.mod.Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[typings.bson.mod.Timestamp]
  
  /** Returns a Timestamp represented by the given (32-bit) integer value */
  @scala.inline
  def fromInt(value: Double): typings.bson.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.Timestamp]
  
  /** Returns a Timestamp representing the given number value, provided that it is a finite number. */
  @scala.inline
  def fromNumber(value: Double): typings.bson.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.Timestamp]
  
  /**
    * Returns a Timestamp from the given string.
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  @scala.inline
  def fromString(str: String): typings.bson.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.Timestamp]
  @scala.inline
  def fromString(str: String, opt_radix: Double): typings.bson.mod.Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], opt_radix.asInstanceOf[js.Any])).asInstanceOf[typings.bson.mod.Timestamp]
}
