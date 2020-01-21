package typings.oracleOraclejet

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataTypesDragEnterDragLeave extends js.Object {
  var dataTypes: String | js.Array[String]
  var selector: String
  def dragEnter(param0: Event_, param1: js.Object): Unit
  def dragLeave(param0: Event_, param1: js.Object): Unit
  def dragOver(param0: Event_, param1: js.Object): Unit
  def drop(param0: Event_, param1: js.Object): Unit
}

object AnonDataTypesDragEnterDragLeave {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    dragEnter: (Event_, js.Object) => Unit,
    dragLeave: (Event_, js.Object) => Unit,
    dragOver: (Event_, js.Object) => Unit,
    drop: (Event_, js.Object) => Unit,
    selector: String
  ): AnonDataTypesDragEnterDragLeave = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], dragEnter = js.Any.fromFunction2(dragEnter), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), drop = js.Any.fromFunction2(drop), selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataTypesDragEnterDragLeave]
  }
}

