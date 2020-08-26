package typings.oracleOraclejet.ojtableMod.ojTable

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Datasource
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait RowRendererContext[K, D] extends js.Object {
  var componentElement: Element = js.native
  var data: StringDictionary[js.Any] = js.native
  var parentElement: Element = js.native
  var rowContext: Datasource[K, D] = js.native
}

object RowRendererContext {
  @scala.inline
  def apply[K, D](
    componentElement: Element,
    data: StringDictionary[js.Any],
    parentElement: Element,
    rowContext: Datasource[K, D]
  ): RowRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], rowContext = rowContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowRendererContext[K, D]]
  }
  @scala.inline
  implicit class RowRendererContextOps[Self <: RowRendererContext[_, _], K, D] (val x: Self with (RowRendererContext[K, D])) extends AnyVal {
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
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowContext(value: Datasource[K, D]): Self = this.set("rowContext", value.asInstanceOf[js.Any])
  }
  
}

