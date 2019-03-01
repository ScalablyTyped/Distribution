package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypes extends js.Object {
  var dataTypes: java.lang.String | js.Array[java.lang.String]
  def drag(param0: stdLib.Event): scala.Unit
  def dragEnd(param0: stdLib.Event): scala.Unit
  def dragStart(param0: stdLib.Event, param1: js.Object): scala.Unit
}

object Anon_DataTypes {
  @scala.inline
  def apply(
    dataTypes: java.lang.String | js.Array[java.lang.String],
    drag: js.Function1[stdLib.Event, scala.Unit],
    dragEnd: js.Function1[stdLib.Event, scala.Unit],
    dragStart: js.Function2[stdLib.Event, js.Object, scala.Unit]
  ): Anon_DataTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataTypes")(dataTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("drag")(drag)
    __obj.updateDynamic("dragEnd")(dragEnd)
    __obj.updateDynamic("dragStart")(dragStart)
    __obj.asInstanceOf[Anon_DataTypes]
  }
}

