package typings.nodeVagrant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMajor extends js.Object {
  var major: Double
  var minor: Double
  var patch: Double
  var status: String
}

object AnonMajor {
  @scala.inline
  def apply(major: Double, minor: Double, patch: Double, status: String): AnonMajor = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMajor]
  }
}

