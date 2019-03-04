package typings
package ngDashTableLib.srcCoreDataResultsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataRowGroup[T] extends js.Object {
  @JSName("$hideRows")
  var $hideRows: scala.Boolean
  var data: js.Array[T]
  var value: java.lang.String
}

object IDataRowGroup {
  @scala.inline
  def apply[T]($hideRows: scala.Boolean, data: js.Array[T], value: java.lang.String): IDataRowGroup[T] = {
    val __obj = js.Dynamic.literal($hideRows = $hideRows, data = data, value = value)
  
    __obj.asInstanceOf[IDataRowGroup[T]]
  }
}

