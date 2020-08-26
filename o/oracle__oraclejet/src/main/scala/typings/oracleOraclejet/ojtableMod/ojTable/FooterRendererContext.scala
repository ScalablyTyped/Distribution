package typings.oracleOraclejet.ojtableMod.ojTable

import typings.oracleOraclejet.anon.`23`
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait FooterRendererContext[K, D] extends js.Object {
  var columnIndex: Double = js.native
  var componentElement: Element = js.native
  var footerContext: `23`[K, D] = js.native
  var parentElement: Element = js.native
}

object FooterRendererContext {
  @scala.inline
  def apply[K, D](columnIndex: Double, componentElement: Element, footerContext: `23`[K, D], parentElement: Element): FooterRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], footerContext = footerContext.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterRendererContext[K, D]]
  }
  @scala.inline
  implicit class FooterRendererContextOps[Self <: FooterRendererContext[_, _], K, D] (val x: Self with (FooterRendererContext[K, D])) extends AnyVal {
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
    def setFooterContext(value: `23`[K, D]): Self = this.set("footerContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
  }
  
}

