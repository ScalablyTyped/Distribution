package typings.officeDashUiDashFabricDashReact

import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainsFocus extends js.Object {
  var renderedWindowsAhead: Double
  var renderedWindowsBehind: Double
  var startIndex: Double
  def onRenderCell(item: js.Any, index: Double, containsFocus: Boolean): Element
}

object Anon_ContainsFocus {
  @scala.inline
  def apply(
    onRenderCell: (js.Any, Double, Boolean) => Element,
    renderedWindowsAhead: Double,
    renderedWindowsBehind: Double,
    startIndex: Double
  ): Anon_ContainsFocus = {
    val __obj = js.Dynamic.literal(onRenderCell = js.Any.fromFunction3(onRenderCell), renderedWindowsAhead = renderedWindowsAhead, renderedWindowsBehind = renderedWindowsBehind, startIndex = startIndex)
  
    __obj.asInstanceOf[Anon_ContainsFocus]
  }
}

