package typings.muiDatatables.mod

import typings.muiDatatables.anon.DataIndex
import typings.muiDatatables.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableIsRowCheck extends js.Object {
  var data: js.Array[Index]
  var lookup: DataIndex
}

object MUIDataTableIsRowCheck {
  @scala.inline
  def apply(data: js.Array[Index], lookup: DataIndex): MUIDataTableIsRowCheck = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableIsRowCheck]
  }
}

