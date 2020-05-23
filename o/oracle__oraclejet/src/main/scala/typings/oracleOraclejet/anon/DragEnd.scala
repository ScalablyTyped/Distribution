package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEnd extends js.Object {
  var dataTypes: String | js.Array[String]
  var selector: String
  def drag(param0: typings.std.Event): Unit
  def dragEnd(param0: typings.std.Event): Unit
  def dragStart(param0: typings.std.Event, param1: js.Object): Unit
  def linkStyle(param0: js.Object): Unit
}

object DragEnd {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    drag: typings.std.Event => Unit,
    dragEnd: typings.std.Event => Unit,
    dragStart: (typings.std.Event, js.Object) => Unit,
    linkStyle: js.Object => Unit,
    selector: String
  ): DragEnd = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drag = js.Any.fromFunction1(drag), dragEnd = js.Any.fromFunction1(dragEnd), dragStart = js.Any.fromFunction2(dragStart), linkStyle = js.Any.fromFunction1(linkStyle), selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEnd]
  }
}

