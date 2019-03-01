package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnIndexComponentElement extends js.Object {
  var columnIndex: scala.Double
  var componentElement: stdLib.Element
  var data: js.Object
  var index: scala.Double
  var key: js.Any
  var mode: java.lang.String
  var row: js.Object
}

object Anon_ColumnIndexComponentElement {
  @scala.inline
  def apply(
    columnIndex: scala.Double,
    componentElement: stdLib.Element,
    data: js.Object,
    index: scala.Double,
    key: js.Any,
    mode: java.lang.String,
    row: js.Object
  ): Anon_ColumnIndexComponentElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnIndex")(columnIndex)
    __obj.updateDynamic("componentElement")(componentElement)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[Anon_ColumnIndexComponentElement]
  }
}

