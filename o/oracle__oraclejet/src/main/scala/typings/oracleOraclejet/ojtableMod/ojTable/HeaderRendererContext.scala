package typings.oracleOraclejet.ojtableMod.ojTable

import typings.oracleOraclejet.anon.`23`
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait HeaderRendererContext[K, D] extends js.Object {
  var columnHeaderDefaultRenderer: js.UndefOr[
    js.Function2[
      /* param0 */ js.Object, 
      /* param1 */ js.Function1[/* param0 */ js.Object, Unit], 
      Unit
    ]
  ] = js.native
  var columnHeaderSortableIconRenderer: js.UndefOr[
    js.Function2[
      /* param0 */ js.Object, 
      /* param1 */ js.Function1[/* param0 */ js.Object, Unit], 
      Unit
    ]
  ] = js.native
  var columnIndex: Double = js.native
  var componentElement: Element = js.native
  var data: String = js.native
  var headerContext: `23`[K, D] = js.native
  var parentElement: Element = js.native
}

object HeaderRendererContext {
  @scala.inline
  def apply[K, D](
    columnIndex: Double,
    componentElement: Element,
    data: String,
    headerContext: `23`[K, D],
    parentElement: Element
  ): HeaderRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headerContext = headerContext.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderRendererContext[K, D]]
  }
  @scala.inline
  implicit class HeaderRendererContextOps[Self <: HeaderRendererContext[_, _], K, D] (val x: Self with (HeaderRendererContext[K, D])) extends AnyVal {
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentElement(value: Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderContext(value: `23`[K, D]): Self = this.set("headerContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnHeaderDefaultRenderer(value: (/* param0 */ js.Object, /* param1 */ js.Function1[/* param0 */ js.Object, Unit]) => Unit): Self = this.set("columnHeaderDefaultRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnHeaderDefaultRenderer: Self = this.set("columnHeaderDefaultRenderer", js.undefined)
    @scala.inline
    def setColumnHeaderSortableIconRenderer(value: (/* param0 */ js.Object, /* param1 */ js.Function1[/* param0 */ js.Object, Unit]) => Unit): Self = this.set("columnHeaderSortableIconRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnHeaderSortableIconRenderer: Self = this.set("columnHeaderSortableIconRenderer", js.undefined)
  }
  
}

