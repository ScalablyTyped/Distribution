package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var iconClassName: js.UndefOr[String] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(children: String = null, fontFamily: String = null, iconClassName: String = null): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

