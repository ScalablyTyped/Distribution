package typings.mongodb.mod

import typings.bson.anon.I
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (low : unknown, high : number | boolean | undefined, unsigned : boolean | undefined): bson.anon.PinExcludekeyofLongTimest */ @JSImport("mongodb", "Timestamp")
@js.native
open class Timestamp protected ()
  extends typings.bson.mod.Timestamp {
  /**
    * @param int - A 64-bit bigint representing the Timestamp.
    */
  def this(int: js.BigInt) = this()
  /**
    * @param long - A 64-bit Long representing the Timestamp.
    */
  def this(long: typings.bson.mod.Long) = this()
  /**
    * @param value - A pair of two values indicating timestamp and increment.
    */
  def this(value: I) = this()
}
/* static members */
object Timestamp {
  
  @JSImport("mongodb", "Timestamp")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mongodb", "Timestamp.MAX_VALUE")
  @js.native
  val MAX_VALUE: typings.bson.mod.Long = js.native
  
  /**
    * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
    *
    * @param lowBits - the low 32-bits.
    * @param highBits - the high 32-bits.
    */
  inline def fromBits(lowBits: scala.Double, highBits: scala.Double): typings.bson.mod.Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[typings.bson.mod.Timestamp]
  
  /** Returns a Timestamp represented by the given (32-bit) integer value. */
  inline def fromInt(value: scala.Double): typings.bson.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.Timestamp]
  
  /** Returns a Timestamp representing the given number value, provided that it is a finite number. Otherwise, zero is returned. */
  inline def fromNumber(value: scala.Double): typings.bson.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.Timestamp]
  
  /**
    * Returns a Timestamp from the given string, optionally using the given radix.
    *
    * @param str - the textual representation of the Timestamp.
    * @param optRadix - the radix in which the text is written.
    */
  inline def fromString(str: String, optRadix: scala.Double): typings.bson.mod.Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], optRadix.asInstanceOf[js.Any])).asInstanceOf[typings.bson.mod.Timestamp]
}
