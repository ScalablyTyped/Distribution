package typings.atOracleOraclejet

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypesDrag extends js.Object {
  var dataTypes: String | js.Array[String]
  var selector: String
  def drag(param0: Event): Unit
  def dragEnd(param0: Event): Unit
  def dragStart(param0: Event, param1: js.Object): Unit
  def linkStyle(param0: js.Object): Unit
}

object Anon_DataTypesDrag {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    drag: Event => Unit,
    dragEnd: Event => Unit,
    dragStart: (Event, js.Object) => Unit,
    linkStyle: js.Object => Unit,
    selector: String
  ): Anon_DataTypesDrag = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drag = js.Any.fromFunction1(drag), dragEnd = js.Any.fromFunction1(dragEnd), dragStart = js.Any.fromFunction2(dragStart), linkStyle = js.Any.fromFunction1(linkStyle), selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataTypesDrag]
  }
}

