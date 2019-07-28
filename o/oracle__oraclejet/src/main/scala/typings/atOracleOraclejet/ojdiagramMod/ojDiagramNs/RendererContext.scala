package typings.atOracleOraclejet.ojdiagramMod.ojDiagramNs

import typings.atOracleOraclejet.Anon_Element
import typings.atOracleOraclejet.Anon_Expanded
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RendererContext[K1, D1] extends js.Object {
  var componentElement: Element
  var content: Anon_Element
  var data: js.Object
  var id: K1
  var itemData: D1
  var parentElement: Element
  var previousState: Anon_Expanded
  var state: Anon_Expanded
  var `type`: String
  def renderDefaultFocus(): Unit
  def renderDefaultHover(): Unit
  def renderDefaultSelection(): Unit
}

object RendererContext {
  @scala.inline
  def apply[K1, D1](
    componentElement: Element,
    content: Anon_Element,
    data: js.Object,
    id: K1,
    itemData: D1,
    parentElement: Element,
    previousState: Anon_Expanded,
    renderDefaultFocus: () => Unit,
    renderDefaultHover: () => Unit,
    renderDefaultSelection: () => Unit,
    state: Anon_Expanded,
    `type`: String
  ): RendererContext[K1, D1] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement, content = content, data = data, id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement, previousState = previousState, renderDefaultFocus = js.Any.fromFunction0(renderDefaultFocus), renderDefaultHover = js.Any.fromFunction0(renderDefaultHover), renderDefaultSelection = js.Any.fromFunction0(renderDefaultSelection), state = state)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RendererContext[K1, D1]]
  }
}

