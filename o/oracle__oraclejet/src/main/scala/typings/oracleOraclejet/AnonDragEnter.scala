package typings.oracleOraclejet

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDragEnter extends js.Object {
  var dataTypes: String | js.Array[String]
  def dragEnter(param0: Event_, param1: js.Object): Unit
  def dragLeave(param0: Event_, param1: js.Object): Unit
  def dragOver(param0: Event_, param1: js.Object): Unit
  def drop(param0: Event_, param1: js.Object): Unit
}

object AnonDragEnter {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    dragEnter: (Event_, js.Object) => Unit,
    dragLeave: (Event_, js.Object) => Unit,
    dragOver: (Event_, js.Object) => Unit,
    drop: (Event_, js.Object) => Unit
  ): AnonDragEnter = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], dragEnter = js.Any.fromFunction2(dragEnter), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), drop = js.Any.fromFunction2(drop))
  
    __obj.asInstanceOf[AnonDragEnter]
  }
}

