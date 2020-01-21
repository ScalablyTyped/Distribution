package typings.mediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMajor extends js.Object {
  var major: Double
  var minor: Double
  var preRelease: String
  var revision: Double
}

object AnonMajor {
  @scala.inline
  def apply(major: Double, minor: Double, preRelease: String, revision: Double): AnonMajor = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], preRelease = preRelease.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMajor]
  }
}

