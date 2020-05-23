package typings.officeUiFabricReact.documentCardActivityTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardActivityStyles extends js.Object {
  var activity: IStyle
  var avatar: IStyle
  var avatars: IStyle
  var details: IStyle
  var name: IStyle
  var root: IStyle
}

object IDocumentCardActivityStyles {
  @scala.inline
  def apply(
    activity: js.UndefOr[Null | IStyle] = js.undefined,
    avatar: js.UndefOr[Null | IStyle] = js.undefined,
    avatars: js.UndefOr[Null | IStyle] = js.undefined,
    details: js.UndefOr[Null | IStyle] = js.undefined,
    name: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IDocumentCardActivityStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activity)) __obj.updateDynamic("activity")(activity.asInstanceOf[js.Any])
    if (!js.isUndefined(avatar)) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (!js.isUndefined(avatars)) __obj.updateDynamic("avatars")(avatars.asInstanceOf[js.Any])
    if (!js.isUndefined(details)) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardActivityStyles]
  }
}

