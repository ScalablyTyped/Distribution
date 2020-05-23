package typings.officeUiFabricReact.documentCardActionsTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
  def apply(
    action: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    views: js.UndefOr[Null | IStyle] = js.undefined,
    viewsIcon: js.UndefOr[Null | IStyle] = js.undefined
  ): IDocumentCardActionsStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(action)) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(views)) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (!js.isUndefined(viewsIcon)) __obj.updateDynamic("viewsIcon")(viewsIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardActionsStyles]
  }
}

