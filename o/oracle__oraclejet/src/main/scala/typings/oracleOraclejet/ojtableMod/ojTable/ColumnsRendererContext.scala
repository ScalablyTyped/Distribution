package typings.oracleOraclejet.ojtableMod.ojTable

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Datasource
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ColumnsRendererContext[K, D] extends js.Object {
  var cellContext: Datasource[K, D] = js.native
  var columnIndex: Double = js.native
  var componentElement: Element = js.native
  var data: D = js.native
  var parentElement: Element = js.native
  var row: StringDictionary[js.Any] = js.native
}

object ColumnsRendererContext {
  @scala.inline
  def apply[K, D](
    cellContext: Datasource[K, D],
    columnIndex: Double,
    componentElement: Element,
    data: D,
    parentElement: Element,
    row: StringDictionary[js.Any]
  ): ColumnsRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(cellContext = cellContext.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsRendererContext[K, D]]
  }
  @scala.inline
  implicit class ColumnsRendererContextOps[Self <: ColumnsRendererContext[_, _], K, D] (val x: Self with (ColumnsRendererContext[K, D])) extends AnyVal {
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
    def setCellContext(value: Datasource[K, D]): Self = this.set("cellContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentElement(value: Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: D): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: StringDictionary[js.Any]): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}

