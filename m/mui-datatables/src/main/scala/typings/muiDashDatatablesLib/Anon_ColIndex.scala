package typings
package muiDashDatatablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColIndex extends js.Object {
  var colIndex: scala.Double
  var dataIndex: scala.Double
  var event: reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent]
  var rowIndex: scala.Double
}

object Anon_ColIndex {
  @scala.inline
  def apply(
    colIndex: scala.Double,
    dataIndex: scala.Double,
    event: reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent],
    rowIndex: scala.Double
  ): Anon_ColIndex = {
    val __obj = js.Dynamic.literal(colIndex = colIndex, dataIndex = dataIndex, event = event, rowIndex = rowIndex)
  
    __obj.asInstanceOf[Anon_ColIndex]
  }
}

