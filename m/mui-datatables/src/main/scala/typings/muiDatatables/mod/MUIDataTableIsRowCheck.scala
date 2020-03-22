package typings.muiDatatables.mod

import typings.muiDatatables.AnonDataIndex
import typings.muiDatatables.AnonIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableIsRowCheck extends js.Object {
  var data: js.Array[AnonIndex]
  var lookup: AnonDataIndex
}

object MUIDataTableIsRowCheck {
  @scala.inline
  def apply(data: js.Array[AnonIndex], lookup: AnonDataIndex): MUIDataTableIsRowCheck = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MUIDataTableIsRowCheck]
  }
}

