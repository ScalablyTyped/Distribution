package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenTypeExtension extends Entity {
  // A unique text identifier for an open type open extension. Required.
  var extensionName: js.UndefOr[String] = js.undefined
}

object OpenTypeExtension {
  @scala.inline
  def apply(extensionName: String = null, id: String = null): OpenTypeExtension = {
    val __obj = js.Dynamic.literal()
    if (extensionName != null) __obj.updateDynamic("extensionName")(extensionName)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[OpenTypeExtension]
  }
}

