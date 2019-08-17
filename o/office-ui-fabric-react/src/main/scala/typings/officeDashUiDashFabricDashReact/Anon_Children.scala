package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[String] = js.undefined
  var iconClassName: js.UndefOr[String] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(children: String = null, iconClassName: String = null): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    __obj.asInstanceOf[Anon_Children]
  }
}

