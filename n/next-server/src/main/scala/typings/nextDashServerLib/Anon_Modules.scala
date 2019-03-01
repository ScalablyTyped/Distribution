package typings
package nextDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Modules extends js.Object {
  var modules: js.UndefOr[js.Any] = js.undefined
  var webpack: js.UndefOr[js.Any] = js.undefined
}

object Anon_Modules {
  @scala.inline
  def apply(modules: js.Any = null, webpack: js.Any = null): Anon_Modules = {
    val __obj = js.Dynamic.literal()
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (webpack != null) __obj.updateDynamic("webpack")(webpack)
    __obj.asInstanceOf[Anon_Modules]
  }
}

