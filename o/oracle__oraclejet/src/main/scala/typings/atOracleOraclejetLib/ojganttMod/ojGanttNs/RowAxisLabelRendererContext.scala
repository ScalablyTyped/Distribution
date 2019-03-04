package typings
package atOracleOraclejetLib.ojganttMod.ojGanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RowAxisLabelRendererContext[K2, D2] extends js.Object {
  var componentElement: stdLib.Element
  var itemData: js.Array[D2]
  var maxHeight: scala.Double
  var maxWidth: scala.Double
  var parentElement: stdLib.Element
  var rowData: Row[K2]
}

object RowAxisLabelRendererContext {
  @scala.inline
  def apply[K2, D2](
    componentElement: stdLib.Element,
    itemData: js.Array[D2],
    maxHeight: scala.Double,
    maxWidth: scala.Double,
    parentElement: stdLib.Element,
    rowData: Row[K2]
  ): RowAxisLabelRendererContext[K2, D2] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement, itemData = itemData, maxHeight = maxHeight, maxWidth = maxWidth, parentElement = parentElement, rowData = rowData)
  
    __obj.asInstanceOf[RowAxisLabelRendererContext[K2, D2]]
  }
}

