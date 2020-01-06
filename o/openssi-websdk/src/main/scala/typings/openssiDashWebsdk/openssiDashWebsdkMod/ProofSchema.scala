package typings.openssiDashWebsdk.openssiDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProofSchema extends js.Object {
  var id: String
  var name: String
  var requested_attributes: js.Any
  var requested_predicates: js.UndefOr[js.Any] = js.undefined
  var version: String
}

object ProofSchema {
  @scala.inline
  def apply(
    id: String,
    name: String,
    requested_attributes: js.Any,
    version: String,
    requested_predicates: js.Any = null
  ): ProofSchema = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requested_attributes = requested_attributes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (requested_predicates != null) __obj.updateDynamic("requested_predicates")(requested_predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofSchema]
  }
}

