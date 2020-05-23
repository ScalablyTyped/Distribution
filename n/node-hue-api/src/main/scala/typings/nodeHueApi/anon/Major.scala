package typings.nodeHueApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Major extends js.Object {
  var major: String
  var minor: String
}

object Major {
  @scala.inline
  def apply(major: String, minor: String): Major = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Major]
  }
}

