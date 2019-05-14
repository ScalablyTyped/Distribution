package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of SODA operation.remove();
  */
trait SodaRemoveResult extends js.Object {
  /** The number of documents matching the SodaOperation criteria. */
  var count: scala.Double
}

object SodaRemoveResult {
  @scala.inline
  def apply(count: scala.Double): SodaRemoveResult = {
    val __obj = js.Dynamic.literal(count = count)
  
    __obj.asInstanceOf[SodaRemoveResult]
  }
}

