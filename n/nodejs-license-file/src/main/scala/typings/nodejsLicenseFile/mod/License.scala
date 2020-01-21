package typings.nodejsLicenseFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait License extends js.Object {
  var data: js.Any
  var serial: String
  var valid: Boolean
}

object License {
  @scala.inline
  def apply(data: js.Any, serial: String, valid: Boolean): License = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[License]
  }
}

