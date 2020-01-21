package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBounceID extends js.Object {
  var BounceID: Double
  var Summary: String
}

object AnonBounceID {
  @scala.inline
  def apply(BounceID: Double, Summary: String): AnonBounceID = {
    val __obj = js.Dynamic.literal(BounceID = BounceID.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBounceID]
  }
}

