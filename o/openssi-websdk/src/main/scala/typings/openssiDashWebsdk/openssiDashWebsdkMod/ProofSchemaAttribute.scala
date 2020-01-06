package typings.openssiDashWebsdk.openssiDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProofSchemaAttribute extends js.Object {
  var restrictions: js.UndefOr[js.Array[Restriction]] = js.undefined
}

object ProofSchemaAttribute {
  @scala.inline
  def apply(restrictions: js.Array[Restriction] = null): ProofSchemaAttribute = {
    val __obj = js.Dynamic.literal()
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofSchemaAttribute]
  }
}

