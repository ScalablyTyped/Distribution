package typings.ngDashTable.srcCoreDataResultsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataRowGroup[T] extends js.Object {
  @JSName("$hideRows")
  var $hideRows: Boolean
  var data: js.Array[T]
  var value: String
}

object IDataRowGroup {
  @scala.inline
  def apply[T]($hideRows: Boolean, data: js.Array[T], value: String): IDataRowGroup[T] = {
    val __obj = js.Dynamic.literal($hideRows = $hideRows, data = data, value = value)
  
    __obj.asInstanceOf[IDataRowGroup[T]]
  }
}

