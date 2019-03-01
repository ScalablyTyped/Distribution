package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestExtension extends js.Object {
  var name: java.lang.String
  var uri: java.lang.String
}

object TestExtension {
  @scala.inline
  def apply(name: java.lang.String, uri: java.lang.String): TestExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[TestExtension]
  }
}

