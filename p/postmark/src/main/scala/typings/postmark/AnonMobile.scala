package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMobile extends js.Object {
  var Date: String
  var Desktop: Double
  var Mobile: Double
  var Unknown: Double
}

object AnonMobile {
  @scala.inline
  def apply(Date: String, Desktop: Double, Mobile: Double, Unknown: Double): AnonMobile = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Desktop = Desktop.asInstanceOf[js.Any], Mobile = Mobile.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMobile]
  }
}

