package typings.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceID extends js.Object {
  var BounceID: Double
  var Summary: String
}

object BounceID {
  @scala.inline
  def apply(BounceID: Double, Summary: String): BounceID = {
    val __obj = js.Dynamic.literal(BounceID = BounceID.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceID]
  }
}

