package typings.pkijs.policyMappingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyMapping extends js.Object {
  var issuerDomainPolicy: String = js.native
  var subjectDomainPolicy: String = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object PolicyMapping {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    issuerDomainPolicy: String,
    subjectDomainPolicy: String,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PolicyMapping = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), issuerDomainPolicy = issuerDomainPolicy.asInstanceOf[js.Any], subjectDomainPolicy = subjectDomainPolicy.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PolicyMapping]
  }
  @scala.inline
  implicit class PolicyMappingOps[Self <: PolicyMapping] (val x: Self) extends AnyVal {
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
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setIssuerDomainPolicy(value: String): Self = this.set("issuerDomainPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubjectDomainPolicy(value: String): Self = this.set("subjectDomainPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
  
}

