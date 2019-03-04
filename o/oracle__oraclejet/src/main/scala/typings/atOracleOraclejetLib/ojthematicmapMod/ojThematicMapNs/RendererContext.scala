package typings
package atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RendererContext[K1, K2, K3, D1, D2, D3] extends js.Object {
  var color: java.lang.String
  var componentElement: stdLib.Element
  var data: js.Object
  var id: K1 | K2 | K3
  var itemData: D1 | D2 | D3
  var label: java.lang.String
  var location: java.lang.String | scala.Null
  var parentElement: stdLib.Element
  var previousState: atOracleOraclejetLib.Anon_Focused
  var root: stdLib.Element | scala.Null
  var state: atOracleOraclejetLib.Anon_Focused
  var x: scala.Double | scala.Null
  var y: scala.Double | scala.Null
  def renderDefaultFocus(): scala.Unit
  def renderDefaultHover(): scala.Unit
  def renderDefaultSelection(): scala.Unit
}

object RendererContext {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](
    color: java.lang.String,
    componentElement: stdLib.Element,
    data: js.Object,
    id: K1 | K2 | K3,
    itemData: D1 | D2 | D3,
    label: java.lang.String,
    parentElement: stdLib.Element,
    previousState: atOracleOraclejetLib.Anon_Focused,
    renderDefaultFocus: js.Function0[scala.Unit],
    renderDefaultHover: js.Function0[scala.Unit],
    renderDefaultSelection: js.Function0[scala.Unit],
    state: atOracleOraclejetLib.Anon_Focused,
    location: java.lang.String = null,
    root: stdLib.Element = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): RendererContext[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(color = color, componentElement = componentElement, data = data, id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], label = label, parentElement = parentElement, previousState = previousState, renderDefaultFocus = renderDefaultFocus, renderDefaultHover = renderDefaultHover, renderDefaultSelection = renderDefaultSelection, state = state)
    if (location != null) __obj.updateDynamic("location")(location)
    if (root != null) __obj.updateDynamic("root")(root)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererContext[K1, K2, K3, D1, D2, D3]]
  }
}

