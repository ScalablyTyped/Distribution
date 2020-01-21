package typings.oracleOraclejet

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataTypes extends js.Object {
  var dataTypes: String | js.Array[String]
  def drag(param0: Event_): Unit
  def dragEnd(param0: Event_): Unit
  def dragStart(param0: Event_, param1: js.Object): Unit
}

object AnonDataTypes {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    drag: Event_ => Unit,
    dragEnd: Event_ => Unit,
    dragStart: (Event_, js.Object) => Unit
  ): AnonDataTypes = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drag = js.Any.fromFunction1(drag), dragEnd = js.Any.fromFunction1(dragEnd), dragStart = js.Any.fromFunction2(dragStart))
  
    __obj.asInstanceOf[AnonDataTypes]
  }
}

