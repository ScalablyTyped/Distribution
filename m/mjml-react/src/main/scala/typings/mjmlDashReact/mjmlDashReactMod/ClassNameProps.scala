package typings.mjmlDashReact.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassNameProps extends js.Object {
  var cssClass: js.UndefOr[String] = js.undefined
}

object ClassNameProps {
  @scala.inline
  def apply(cssClass: String = null): ClassNameProps = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    __obj.asInstanceOf[ClassNameProps]
  }
}

