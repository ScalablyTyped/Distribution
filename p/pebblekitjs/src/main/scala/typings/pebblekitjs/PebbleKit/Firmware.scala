package typings.pebblekitjs.PebbleKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object containing firmware version information.
  */
trait Firmware extends js.Object {
  var major: Double
  var minor: Double
  var patch: Double
  var suffix: String
}

object Firmware {
  @scala.inline
  def apply(major: Double, minor: Double, patch: Double, suffix: String): Firmware = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Firmware]
  }
}

