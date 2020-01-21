package typings.oracleOraclejet.ojganttMod.ojGantt

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RowAxisLabelRendererContext[K2, D2] extends js.Object {
  var componentElement: Element
  var itemData: js.Array[D2]
  var maxHeight: Double
  var maxWidth: Double
  var parentElement: Element
  var rowData: Row[K2]
}

object RowAxisLabelRendererContext {
  @scala.inline
  def apply[K2, D2](
    componentElement: Element,
    itemData: js.Array[D2],
    maxHeight: Double,
    maxWidth: Double,
    parentElement: Element,
    rowData: Row[K2]
  ): RowAxisLabelRendererContext[K2, D2] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowAxisLabelRendererContext[K2, D2]]
  }
}

