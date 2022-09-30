package typings.mongodb.mod

import typings.buffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Decimal128")
@js.native
open class Decimal128 protected ()
  extends typings.bson.mod.Decimal128 {
  def this(bytes: String) = this()
  /**
    * @param bytes - a buffer containing the raw Decimal128 bytes in little endian order,
    *                or a string representation as returned by .toString()
    */
  def this(bytes: Buffer) = this()
}
/* static members */
object Decimal128 {
  
  @JSImport("mongodb", "Decimal128")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a Decimal128 instance from a string representation
    *
    * @param representation - a numeric string representation.
    */
  inline def fromString(representation: String): typings.bson.mod.Decimal128 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(representation.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.Decimal128]
}
