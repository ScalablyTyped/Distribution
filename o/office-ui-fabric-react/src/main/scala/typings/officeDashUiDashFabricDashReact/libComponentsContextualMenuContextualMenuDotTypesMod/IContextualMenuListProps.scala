package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuListProps extends js.Object {
  var hasCheckmarks: Boolean
  var hasIcons: Boolean
  var items: js.Array[IContextualMenuItem]
  var totalItemCount: Double
}

object IContextualMenuListProps {
  @scala.inline
  def apply(
    hasCheckmarks: Boolean,
    hasIcons: Boolean,
    items: js.Array[IContextualMenuItem],
    totalItemCount: Double
  ): IContextualMenuListProps = {
    val __obj = js.Dynamic.literal(hasCheckmarks = hasCheckmarks, hasIcons = hasIcons, items = items, totalItemCount = totalItemCount)
  
    __obj.asInstanceOf[IContextualMenuListProps]
  }
}

