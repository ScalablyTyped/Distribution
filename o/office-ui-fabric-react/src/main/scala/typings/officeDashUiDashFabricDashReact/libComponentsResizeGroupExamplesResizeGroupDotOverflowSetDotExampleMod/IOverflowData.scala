package typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupExamplesResizeGroupDotOverflowSetDotExampleMod

import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverflowData extends js.Object {
  var cacheKey: js.UndefOr[String] = js.undefined
  var overflow: js.Array[IContextualMenuItem]
  var primary: js.Array[IContextualMenuItem]
}

object IOverflowData {
  @scala.inline
  def apply(
    overflow: js.Array[IContextualMenuItem],
    primary: js.Array[IContextualMenuItem],
    cacheKey: String = null
  ): IOverflowData = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any])
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(cacheKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverflowData]
  }
}

