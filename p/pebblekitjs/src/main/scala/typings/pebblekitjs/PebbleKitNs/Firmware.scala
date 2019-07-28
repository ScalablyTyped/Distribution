package typings.pebblekitjs.PebbleKitNs

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
    val __obj = js.Dynamic.literal(major = major, minor = minor, patch = patch, suffix = suffix)
  
    __obj.asInstanceOf[Firmware]
  }
}

