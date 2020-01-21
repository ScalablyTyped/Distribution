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
    activity: IStyle = null,
    avatar: IStyle = null,
    avatars: IStyle = null,
    details: IStyle = null,
    name: IStyle = null,
    root: IStyle = null
  ): IDocumentCardActivityStyles = {
    val __obj = js.Dynamic.literal()
    if (activity != null) __obj.updateDynamic("activity")(activity.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (avatars != null) __obj.updateDynamic("avatars")(avatars.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardActivityStyles]
  }
}

