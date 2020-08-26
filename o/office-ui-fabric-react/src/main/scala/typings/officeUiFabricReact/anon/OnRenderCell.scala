package typings.officeUiFabricReact.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnRenderCell extends js.Object {
  var renderedWindowsAhead: Double = js.native
  var renderedWindowsBehind: Double = js.native
  var startIndex: Double = js.native
  def onRenderCell(item: js.Any, index: Double, containsFocus: Boolean): Element = js.native
}

object OnRenderCell {
  @scala.inline
  def apply(
    onRenderCell: (js.Any, Double, Boolean) => Element,
    renderedWindowsAhead: Double,
    renderedWindowsBehind: Double,
    startIndex: Double
  ): OnRenderCell = {
    val __obj = js.Dynamic.literal(onRenderCell = js.Any.fromFunction3(onRenderCell), renderedWindowsAhead = renderedWindowsAhead.asInstanceOf[js.Any], renderedWindowsBehind = renderedWindowsBehind.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRenderCell]
  }
  @scala.inline
  implicit class OnRenderCellOps[Self <: OnRenderCell] (val x: Self) extends AnyVal {
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
    def setOnRenderCell(value: (js.Any, Double, Boolean) => Element): Self = this.set("onRenderCell", js.Any.fromFunction3(value))
    @scala.inline
    def setRenderedWindowsAhead(value: Double): Self = this.set("renderedWindowsAhead", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderedWindowsBehind(value: Double): Self = this.set("renderedWindowsBehind", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
  }
  
}

