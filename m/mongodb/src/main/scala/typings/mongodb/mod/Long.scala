package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Long")
@js.native
class Long ()
  extends typings.bson.mod.Long
/* static members */
object Long {
  
  @JSImport("mongodb", "Long")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mongodb", "Long.MAX_VALUE")
  @js.native
  val MAX_VALUE: typings.bson.mod.Long = js.native
  
  @JSImport("mongodb", "Long.MIN_VALUE")
  @js.native
  val MIN_VALUE: typings.bson.mod.Long = js.native
  
  @JSImport("mongodb", "Long.NEG_ONE")
  @js.native
  val NEG_ONE: typings.bson.mod.Long = js.native
  
  @JSImport("mongodb", "Long.ONE")
  @js.native
  val ONE: typings.bson.mod.Long = js.native
  
  @JSImport("mongodb", "Long.ZERO")
  @js.native
  val ZERO: typings.bson.mod.Long = js.native
  
  /**
    * Returns a Long representing the 64-bit integer that comes by concatenating the given high and low bits. Each is assumed to use 32 bits.
    * @param lowBits The low 32-bits.
    * @param highBits The high 32-bits.
    */
  inline def fromBits(lowBits: scala.Double, highBits: scala.Double): typings.bson.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[typings.bson.mod.Long]
  
  /** Returns a Long representing the given (32-bit) integer value. */
  inline def fromInt(i: scala.Double): typings.bson.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(i.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.Long]
  
  /** Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned. */
  inline def fromNumber(n: scala.Double): typings.bson.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(n.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.Long]
  
  /**
    * Returns a Long representation of the given string
    * @param opt_radix The radix in which the text is written. {default:10}
    */
  inline def fromString(s: String): typings.bson.mod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(s.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.Long]
  inline def fromString(s: String, opt_radix: scala.Double): typings.bson.mod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(s.asInstanceOf[js.Any], opt_radix.asInstanceOf[js.Any])).asInstanceOf[typings.bson.mod.Long]
}
