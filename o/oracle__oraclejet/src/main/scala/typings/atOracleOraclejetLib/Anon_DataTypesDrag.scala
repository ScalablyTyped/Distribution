package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypesDrag extends js.Object {
  var dataTypes: java.lang.String | js.Array[java.lang.String]
  var selector: java.lang.String
  def drag(param0: stdLib.Event): scala.Unit
  def dragEnd(param0: stdLib.Event): scala.Unit
  def dragStart(param0: stdLib.Event, param1: js.Object): scala.Unit
  def linkStyle(param0: js.Object): scala.Unit
}

object Anon_DataTypesDrag {
  @scala.inline
  def apply(
    dataTypes: java.lang.String | js.Array[java.lang.String],
    drag: stdLib.Event => scala.Unit,
    dragEnd: stdLib.Event => scala.Unit,
    dragStart: (stdLib.Event, js.Object) => scala.Unit,
    linkStyle: js.Object => scala.Unit,
    selector: java.lang.String
  ): Anon_DataTypesDrag = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drag = js.Any.fromFunction1(drag), dragEnd = js.Any.fromFunction1(dragEnd), dragStart = js.Any.fromFunction2(dragStart), linkStyle = js.Any.fromFunction1(linkStyle), selector = selector)
  
    __obj.asInstanceOf[Anon_DataTypesDrag]
  }
}

