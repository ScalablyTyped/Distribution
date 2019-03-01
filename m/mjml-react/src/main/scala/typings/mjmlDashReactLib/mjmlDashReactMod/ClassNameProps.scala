package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassNameProps extends js.Object {
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
}

object ClassNameProps {
  @scala.inline
  def apply(cssClass: java.lang.String = null): ClassNameProps = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    __obj.asInstanceOf[ClassNameProps]
  }
}

