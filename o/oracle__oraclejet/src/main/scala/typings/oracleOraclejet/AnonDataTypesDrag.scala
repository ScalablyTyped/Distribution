package typings.oracleOraclejet

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataTypesDrag extends js.Object {
  var dataTypes: String | js.Array[String]
  var selector: String
  def drag(param0: Event_): Unit
  def dragEnd(param0: Event_): Unit
  def dragStart(param0: Event_, param1: js.Object): Unit
  def linkStyle(param0: js.Object): Unit
}

object AnonDataTypesDrag {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    drag: Event_ => Unit,
    dragEnd: Event_ => Unit,
    dragStart: (Event_, js.Object) => Unit,
    linkStyle: js.Object => Unit,
    selector: String
  ): AnonDataTypesDrag = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drag = js.Any.fromFunction1(drag), dragEnd = js.Any.fromFunction1(dragEnd), dragStart = js.Any.fromFunction2(dragStart), linkStyle = js.Any.fromFunction1(linkStyle), selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataTypesDrag]
  }
}

