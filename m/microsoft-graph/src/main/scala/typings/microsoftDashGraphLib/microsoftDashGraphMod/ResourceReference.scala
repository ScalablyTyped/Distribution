package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceReference extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var webUrl: js.UndefOr[java.lang.String] = js.undefined
}

object ResourceReference {
  @scala.inline
  def apply(id: java.lang.String = null, `type`: java.lang.String = null, webUrl: java.lang.String = null): ResourceReference = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[ResourceReference]
  }
}

