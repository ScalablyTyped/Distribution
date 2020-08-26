package typings.oracleOraclejet.ojganttMod.ojGantt

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait RowAxisLabelRendererContext[K2, D2] extends js.Object {
  var componentElement: Element = js.native
  var itemData: js.Array[D2] = js.native
  var maxHeight: Double = js.native
  var maxWidth: Double = js.native
  var parentElement: Element = js.native
  var rowData: Row[K2] = js.native
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
  @scala.inline
  implicit class RowAxisLabelRendererContextOps[Self <: RowAxisLabelRendererContext[_, _], K2, D2] (val x: Self with (RowAxisLabelRendererContext[K2, D2])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponentElement(value: Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemDataVarargs(value: D2*): Self = this.set("itemData", js.Array(value :_*))
    @scala.inline
    def setItemData(value: js.Array[D2]): Self = this.set("itemData", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowData(value: Row[K2]): Self = this.set("rowData", value.asInstanceOf[js.Any])
  }
  
}

