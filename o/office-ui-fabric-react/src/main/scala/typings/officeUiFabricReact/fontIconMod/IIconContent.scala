package typings.officeUiFabricReact.fontIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconContent extends js.Object {
  var children: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var iconClassName: js.UndefOr[String] = js.undefined
}

object IIconContent {
  @scala.inline
  def apply(children: String = null, fontFamily: String = null, iconClassName: String = null): IIconContent = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconContent]
  }
}

