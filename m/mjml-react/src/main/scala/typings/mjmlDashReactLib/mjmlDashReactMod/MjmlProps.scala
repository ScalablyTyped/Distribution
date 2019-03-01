package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlProps extends js.Object {
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var owa: js.UndefOr[java.lang.String] = js.undefined
}

object MjmlProps {
  @scala.inline
  def apply(lang: java.lang.String = null, owa: java.lang.String = null): MjmlProps = {
    val __obj = js.Dynamic.literal()
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (owa != null) __obj.updateDynamic("owa")(owa)
    __obj.asInstanceOf[MjmlProps]
  }
}

