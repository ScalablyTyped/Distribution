package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentElement[K2] extends js.Object {
  var componentElement: typings.std.Element
  var rowData: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2]
}

object ComponentElement {
  @scala.inline
  def apply[K2](componentElement: typings.std.Element, rowData: typings.oracleOraclejet.ojganttMod.ojGantt.Row[K2]): ComponentElement[K2] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[K2]]
  }
}

