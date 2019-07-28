package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojganttMod.ojGanttNs.Row
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentElement[K2] extends js.Object {
  var componentElement: Element
  var rowData: Row[K2]
}

object Anon_ComponentElement {
  @scala.inline
  def apply[K2](componentElement: Element, rowData: Row[K2]): Anon_ComponentElement[K2] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement, rowData = rowData)
  
    __obj.asInstanceOf[Anon_ComponentElement[K2]]
  }
}

