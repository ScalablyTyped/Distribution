package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightIdentity extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object InsightIdentity {
  @scala.inline
  def apply(address: String = null, displayName: String = null, id: String = null): InsightIdentity = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[InsightIdentity]
  }
}

