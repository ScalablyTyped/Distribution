package typings.officeUiFabricReact

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnRenderCell extends js.Object {
  var renderedWindowsAhead: Double
  var renderedWindowsBehind: Double
  var startIndex: Double
  def onRenderCell(item: js.Any, index: Double, containsFocus: Boolean): Element
}

object AnonOnRenderCell {
  @scala.inline
  def apply(
    onRenderCell: (js.Any, Double, Boolean) => Element,
    renderedWindowsAhead: Double,
    renderedWindowsBehind: Double,
    startIndex: Double
  ): AnonOnRenderCell = {
    val __obj = js.Dynamic.literal(onRenderCell = js.Any.fromFunction3(onRenderCell), renderedWindowsAhead = renderedWindowsAhead.asInstanceOf[js.Any], renderedWindowsBehind = renderedWindowsBehind.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnRenderCell]
  }
}

