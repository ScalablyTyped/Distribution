package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatedResult extends js.Object {
  var TotalCount: Double
}

object PaginatedResult {
  @scala.inline
  def apply(TotalCount: Double): PaginatedResult = {
    val __obj = js.Dynamic.literal(TotalCount = TotalCount)
  
    __obj.asInstanceOf[PaginatedResult]
  }
}

