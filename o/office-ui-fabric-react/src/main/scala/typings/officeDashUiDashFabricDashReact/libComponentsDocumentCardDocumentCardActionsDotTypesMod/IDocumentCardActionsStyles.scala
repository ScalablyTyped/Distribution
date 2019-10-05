package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardActionsDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardActionsStyles extends js.Object {
  var action: IStyle
  var root: IStyle
  var views: IStyle
  var viewsIcon: IStyle
}

object IDocumentCardActionsStyles {
  @scala.inline
  def apply(action: IStyle = null, root: IStyle = null, views: IStyle = null, viewsIcon: IStyle = null): IDocumentCardActionsStyles = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (viewsIcon != null) __obj.updateDynamic("viewsIcon")(viewsIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardActionsStyles]
  }
}

