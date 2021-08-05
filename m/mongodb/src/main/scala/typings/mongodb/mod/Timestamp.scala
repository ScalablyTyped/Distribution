package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Timestamp")
@js.native
class Timestamp ()
  extends typings.bson.mod.Timestamp
/* static members */
object Timestamp {
  
  @JSImport("mongodb", "Timestamp")
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def fromBits(lowBits: scala.Double, highBits: scala.Double): typings.bson.mod.Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[typings.bson.mod.Timestamp]
  
  /** Returns a Timestamp represented by the given (32-bit) integer value */
  inline def fromInt(value: scala.Double): typings.bson.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.Timestamp]
  
  /** Returns a Timestamp representing the given number value, provided that it is a finite number. */
  inline def fromNumber(value: scala.Double): typings.bson.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.Timestamp]
  
  /**
    * Returns a Timestamp from the given string.
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  inline def fromString(str: String): typings.bson.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.Timestamp]
  inline def fromString(str: String, opt_radix: scala.Double): typings.bson.mod.Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], opt_radix.asInstanceOf[js.Any])).asInstanceOf[typings.bson.mod.Timestamp]
}
