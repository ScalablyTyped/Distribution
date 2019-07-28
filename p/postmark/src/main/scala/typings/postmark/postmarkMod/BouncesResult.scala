package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BouncesResult extends PaginatedResult {
  var Bounces: js.Array[Bounce]
}

object BouncesResult {
  @scala.inline
  def apply(Bounces: js.Array[Bounce], TotalCount: Double): BouncesResult = {
    val __obj = js.Dynamic.literal(Bounces = Bounces, TotalCount = TotalCount)
  
    __obj.asInstanceOf[BouncesResult]
  }
}

