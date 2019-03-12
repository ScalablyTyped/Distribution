package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypesDragEnter extends js.Object {
  var dataTypes: java.lang.String | js.Array[java.lang.String]
  def dragEnter(param0: stdLib.Event, param1: js.Object): scala.Unit
  def dragLeave(param0: stdLib.Event, param1: js.Object): scala.Unit
  def dragOver(param0: stdLib.Event, param1: js.Object): scala.Unit
  def drop(param0: stdLib.Event, param1: js.Object): scala.Unit
}

object Anon_DataTypesDragEnter {
  @scala.inline
  def apply(
    dataTypes: java.lang.String | js.Array[java.lang.String],
    dragEnter: (stdLib.Event, js.Object) => scala.Unit,
    dragLeave: (stdLib.Event, js.Object) => scala.Unit,
    dragOver: (stdLib.Event, js.Object) => scala.Unit,
    drop: (stdLib.Event, js.Object) => scala.Unit
  ): Anon_DataTypesDragEnter = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], dragEnter = js.Any.fromFunction2(dragEnter), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), drop = js.Any.fromFunction2(drop))
  
    __obj.asInstanceOf[Anon_DataTypesDragEnter]
  }
}

