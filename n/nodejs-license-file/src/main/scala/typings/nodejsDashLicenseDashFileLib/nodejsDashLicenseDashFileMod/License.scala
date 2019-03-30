package typings
package nodejsDashLicenseDashFileLib.nodejsDashLicenseDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait License extends js.Object {
  var data: js.Any
  var serial: java.lang.String
  var valid: scala.Boolean
}

object License {
  @scala.inline
  def apply(data: js.Any, serial: java.lang.String, valid: scala.Boolean): License = {
    val __obj = js.Dynamic.literal(data = data, serial = serial, valid = valid)
  
    __obj.asInstanceOf[License]
  }
}

