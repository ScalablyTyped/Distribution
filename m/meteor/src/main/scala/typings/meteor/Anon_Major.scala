package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Major extends js.Object {
  var major: String
  var minor: String
  var name: String
  var patch: String
}

object Anon_Major {
  @scala.inline
  def apply(major: String, minor: String, name: String, patch: String): Anon_Major = {
    val __obj = js.Dynamic.literal(major = major, minor = minor, name = name, patch = patch)
  
    __obj.asInstanceOf[Anon_Major]
  }
}

