package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Major extends js.Object {
  var major: String
  var minor: String
  var name: String
  var patch: String
}

object Major {
  @scala.inline
  def apply(major: String, minor: String, name: String, patch: String): Major = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Major]
  }
}

