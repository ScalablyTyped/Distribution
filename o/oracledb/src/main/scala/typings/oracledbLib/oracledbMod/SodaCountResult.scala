package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of SODA operation.count();
  */
trait SodaCountResult extends js.Object {
  /** The number of documents matching the SodaOperation criteria. */
  var count: scala.Double
}

object SodaCountResult {
  @scala.inline
  def apply(count: scala.Double): SodaCountResult = {
    val __obj = js.Dynamic.literal(count = count)
  
    __obj.asInstanceOf[SodaCountResult]
  }
}

