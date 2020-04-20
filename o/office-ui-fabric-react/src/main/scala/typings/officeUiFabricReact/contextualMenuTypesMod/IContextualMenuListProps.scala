package typings.officeUiFabricReact.contextualMenuTypesMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuListProps extends js.Object {
  var hasCheckmarks: Boolean
  var hasIcons: Boolean
  var items: js.Array[IContextualMenuItem]
  var totalItemCount: Double
  def defaultMenuItemRenderer(item: IContextualMenuItemRenderProps): ReactNode
}

object IContextualMenuListProps {
  @scala.inline
  def apply(
    defaultMenuItemRenderer: IContextualMenuItemRenderProps => ReactNode,
    hasCheckmarks: Boolean,
    hasIcons: Boolean,
    items: js.Array[IContextualMenuItem],
    totalItemCount: Double
  ): IContextualMenuListProps = {
    val __obj = js.Dynamic.literal(defaultMenuItemRenderer = js.Any.fromFunction1(defaultMenuItemRenderer), hasCheckmarks = hasCheckmarks.asInstanceOf[js.Any], hasIcons = hasIcons.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuListProps]
  }
}

