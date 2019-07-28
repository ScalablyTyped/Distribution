package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceReference extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var webUrl: js.UndefOr[String] = js.undefined
}

object ResourceReference {
  @scala.inline
  def apply(id: String = null, `type`: String = null, webUrl: String = null): ResourceReference = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[ResourceReference]
  }
}

