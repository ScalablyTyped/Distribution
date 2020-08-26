package typings.pkijs.policyInformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyInformation extends js.Object {
  var policyIdentifier: String = js.native
  /**
    * Value of the TIME class
    */
  var policyQualifiers: js.Array[typings.pkijs.policyQualifierInfoMod.default] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object PolicyInformation {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    policyIdentifier: String,
    policyQualifiers: js.Array[typings.pkijs.policyQualifierInfoMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PolicyInformation = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), policyIdentifier = policyIdentifier.asInstanceOf[js.Any], policyQualifiers = policyQualifiers.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PolicyInformation]
  }
  @scala.inline
  implicit class PolicyInformationOps[Self <: PolicyInformation] (val x: Self) extends AnyVal {
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
    def setPolicyIdentifier(value: String): Self = this.set("policyIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyQualifiersVarargs(value: typings.pkijs.policyQualifierInfoMod.default*): Self = this.set("policyQualifiers", js.Array(value :_*))
    @scala.inline
    def setPolicyQualifiers(value: js.Array[typings.pkijs.policyQualifierInfoMod.default]): Self = this.set("policyQualifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
  
}

