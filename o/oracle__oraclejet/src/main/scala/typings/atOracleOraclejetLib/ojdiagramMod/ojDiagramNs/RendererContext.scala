package typings
package atOracleOraclejetLib.ojdiagramMod.ojDiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RendererContext[K1, D1] extends js.Object {
  var componentElement: stdLib.Element
  var content: atOracleOraclejetLib.Anon_Element
  var data: js.Object
  var id: K1
  var itemData: D1
  var parentElement: stdLib.Element
  var previousState: atOracleOraclejetLib.Anon_Expanded
  var state: atOracleOraclejetLib.Anon_Expanded
  var `type`: java.lang.String
  def renderDefaultFocus(): scala.Unit
  def renderDefaultHover(): scala.Unit
  def renderDefaultSelection(): scala.Unit
}

object RendererContext {
  @scala.inline
  def apply[K1, D1](
    componentElement: stdLib.Element,
    content: atOracleOraclejetLib.Anon_Element,
    data: js.Object,
    id: K1,
    itemData: D1,
    parentElement: stdLib.Element,
    previousState: atOracleOraclejetLib.Anon_Expanded,
    renderDefaultFocus: js.Function0[scala.Unit],
    renderDefaultHover: js.Function0[scala.Unit],
    renderDefaultSelection: js.Function0[scala.Unit],
    state: atOracleOraclejetLib.Anon_Expanded,
    `type`: java.lang.String
  ): RendererContext[K1, D1] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("componentElement")(componentElement)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    __obj.updateDynamic("parentElement")(parentElement)
    __obj.updateDynamic("previousState")(previousState)
    __obj.updateDynamic("renderDefaultFocus")(renderDefaultFocus)
    __obj.updateDynamic("renderDefaultHover")(renderDefaultHover)
    __obj.updateDynamic("renderDefaultSelection")(renderDefaultSelection)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[RendererContext[K1, D1]]
  }
}

