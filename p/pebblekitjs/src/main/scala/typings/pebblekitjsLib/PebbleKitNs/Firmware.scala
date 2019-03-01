package typings
package pebblekitjsLib.PebbleKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object containing firmware version information.
  */
trait Firmware extends js.Object {
  var major: scala.Double
  var minor: scala.Double
  var patch: scala.Double
  var suffix: java.lang.String
}

object Firmware {
  @scala.inline
  def apply(major: scala.Double, minor: scala.Double, patch: scala.Double, suffix: java.lang.String): Firmware = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("major")(major)
    __obj.updateDynamic("minor")(minor)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[Firmware]
  }
}

