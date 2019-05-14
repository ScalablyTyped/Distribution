package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of SODA operation.replaceOne();
  */
trait SodaReplaceOneResult extends js.Object {
  /** This attribute will be true if the document was successfully replaced, false otherwise. */
  var replaced: scala.Boolean
}

object SodaReplaceOneResult {
  @scala.inline
  def apply(replaced: scala.Boolean): SodaReplaceOneResult = {
    val __obj = js.Dynamic.literal(replaced = replaced)
  
    __obj.asInstanceOf[SodaReplaceOneResult]
  }
}

