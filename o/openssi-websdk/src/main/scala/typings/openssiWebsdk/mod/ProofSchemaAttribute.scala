package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProofSchemaAttribute extends js.Object {
  var restrictions: js.UndefOr[js.Array[Restriction]] = js.native
}

object ProofSchemaAttribute {
  @scala.inline
  def apply(): ProofSchemaAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProofSchemaAttribute]
  }
  @scala.inline
  implicit class ProofSchemaAttributeOps[Self <: ProofSchemaAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRestrictionsVarargs(value: Restriction*): Self = this.set("restrictions", js.Array(value :_*))
    @scala.inline
    def setRestrictions(value: js.Array[Restriction]): Self = this.set("restrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictions: Self = this.set("restrictions", js.undefined)
  }
  
}

