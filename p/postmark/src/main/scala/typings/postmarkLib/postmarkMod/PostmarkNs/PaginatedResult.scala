package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatedResult extends js.Object {
  var TotalCount: scala.Double
}

object PaginatedResult {
  @scala.inline
  def apply(TotalCount: scala.Double): PaginatedResult = {
    val __obj = js.Dynamic.literal(TotalCount = TotalCount)
  
    __obj.asInstanceOf[PaginatedResult]
  }
}

