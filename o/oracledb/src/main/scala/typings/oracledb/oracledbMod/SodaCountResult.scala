package typings.oracledb.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of SODA operation.count();
  */
trait SodaCountResult extends js.Object {
  /** The number of documents matching the SodaOperation criteria. */
  var count: Double
}

object SodaCountResult {
  @scala.inline
  def apply(count: Double): SodaCountResult = {
    val __obj = js.Dynamic.literal(count = count)
  
    __obj.asInstanceOf[SodaCountResult]
  }
}

