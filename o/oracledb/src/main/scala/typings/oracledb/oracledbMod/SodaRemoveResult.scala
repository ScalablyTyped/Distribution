package typings.oracledb.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of SODA operation.remove();
  */
trait SodaRemoveResult extends js.Object {
  /** The number of documents matching the SodaOperation criteria. */
  var count: Double
}

object SodaRemoveResult {
  @scala.inline
  def apply(count: Double): SodaRemoveResult = {
    val __obj = js.Dynamic.literal(count = count)
  
    __obj.asInstanceOf[SodaRemoveResult]
  }
}

