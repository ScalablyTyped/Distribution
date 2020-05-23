package typings.oracleOraclejet.ojthematicmapMod.ojThematicMap

import typings.oracleOraclejet.anon.Focused
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RendererContext[K1, K2, K3, D1, D2, D3] extends js.Object {
  var color: String
  var componentElement: Element
  var data: js.Object
  var id: K1 | K2 | K3
  var itemData: D1 | D2 | D3
  var label: String
  var location: String | Null
  var parentElement: Element
  var previousState: Focused
  var root: Element | Null
  var state: Focused
  var x: Double | Null
  var y: Double | Null
  def renderDefaultFocus(): Unit
  def renderDefaultHover(): Unit
  def renderDefaultSelection(): Unit
}

object RendererContext {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](
    color: String,
    componentElement: Element,
    data: js.Object,
    id: K1 | K2 | K3,
    itemData: D1 | D2 | D3,
    label: String,
    parentElement: Element,
    previousState: Focused,
    renderDefaultFocus: () => Unit,
    renderDefaultHover: () => Unit,
    renderDefaultSelection: () => Unit,
    state: Focused,
    location: String = null,
    root: Element = null,
    x: Double = null.asInstanceOf[Double],
    y: Double = null.asInstanceOf[Double]
  ): RendererContext[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any], renderDefaultFocus = js.Any.fromFunction0(renderDefaultFocus), renderDefaultHover = js.Any.fromFunction0(renderDefaultHover), renderDefaultSelection = js.Any.fromFunction0(renderDefaultSelection), state = state.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererContext[K1, K2, K3, D1, D2, D3]]
  }
}

