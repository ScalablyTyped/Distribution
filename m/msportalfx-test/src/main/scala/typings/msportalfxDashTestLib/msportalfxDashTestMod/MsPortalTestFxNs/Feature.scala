package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object Feature {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): Feature = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Feature]
  }
}

