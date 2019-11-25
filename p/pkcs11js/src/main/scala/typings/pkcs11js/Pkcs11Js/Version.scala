package typings.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  var major: Double
  var minor: Double
}

object Version {
  @scala.inline
  def apply(major: Double, minor: Double): Version = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Version]
  }
}

