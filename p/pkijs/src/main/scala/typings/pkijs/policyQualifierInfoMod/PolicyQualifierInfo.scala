package typings.pkijs.policyQualifierInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyQualifierInfo extends js.Object {
  var policyQualifierId: String = js.native
  var qualifier: js.Any = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object PolicyQualifierInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    policyQualifierId: String,
    qualifier: js.Any,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PolicyQualifierInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), policyQualifierId = policyQualifierId.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PolicyQualifierInfo]
  }
  @scala.inline
  implicit class PolicyQualifierInfoOps[Self <: PolicyQualifierInfo] (val x: Self) extends AnyVal {
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
    def setPolicyQualifierId(value: String): Self = this.set("policyQualifierId", value.asInstanceOf[js.Any])
    @scala.inline
    def setQualifier(value: js.Any): Self = this.set("qualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
  
}

