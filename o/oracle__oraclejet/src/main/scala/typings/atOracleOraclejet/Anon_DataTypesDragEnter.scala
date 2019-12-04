package typings.atOracleOraclejet

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypesDragEnter extends js.Object {
  var dataTypes: String | js.Array[String]
  def dragEnter(param0: Event, param1: js.Object): Unit
  def dragLeave(param0: Event, param1: js.Object): Unit
  def dragOver(param0: Event, param1: js.Object): Unit
  def drop(param0: Event, param1: js.Object): Unit
}

object Anon_DataTypesDragEnter {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    dragEnter: (Event, js.Object) => Unit,
    dragLeave: (Event, js.Object) => Unit,
    dragOver: (Event, js.Object) => Unit,
    drop: (Event, js.Object) => Unit
  ): Anon_DataTypesDragEnter = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], dragEnter = js.Any.fromFunction2(dragEnter), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), drop = js.Any.fromFunction2(drop))
  
    __obj.asInstanceOf[Anon_DataTypesDragEnter]
  }
}

