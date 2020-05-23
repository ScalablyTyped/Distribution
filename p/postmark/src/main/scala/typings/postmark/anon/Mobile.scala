package typings.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mobile extends js.Object {
  var Date: String
  var Desktop: Double
  var Mobile: Double
  var Unknown: Double
}

object Mobile {
  @scala.inline
  def apply(Date: String, Desktop: Double, Mobile: Double, Unknown: Double): Mobile = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Desktop = Desktop.asInstanceOf[js.Any], Mobile = Mobile.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mobile]
  }
}

