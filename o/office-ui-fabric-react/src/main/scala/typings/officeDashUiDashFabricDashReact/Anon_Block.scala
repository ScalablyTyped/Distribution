package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPosition
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block extends js.Object {
  var display: block
  var position: js.UndefOr[IPosition] = js.undefined
}

object Anon_Block {
  @scala.inline
  def apply(display: block, position: IPosition = null): Anon_Block = {
    val __obj = js.Dynamic.literal(display = display)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_Block]
  }
}

