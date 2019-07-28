package typings.nodejsDashLicenseDashFile.nodejsDashLicenseDashFileMod

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
    val __obj = js.Dynamic.literal(data = data, serial = serial, valid = valid)
  
    __obj.asInstanceOf[License]
  }
}

