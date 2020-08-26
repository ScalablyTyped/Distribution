package typings.pkijs.policyConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyConstraints extends js.Object {
  var inhibitPolicyMapping: js.UndefOr[Double] = js.native
  var requireExplicitPolicy: js.UndefOr[Double] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object PolicyConstraints {
  @scala.inline
  def apply(fromSchema: js.Any => Unit, toJSON: () => js.Any, toSchema: () => js.Any): PolicyConstraints = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PolicyConstraints]
  }
  @scala.inline
  implicit class PolicyConstraintsOps[Self <: PolicyConstraints] (val x: Self) extends AnyVal {
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
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setInhibitPolicyMapping(value: Double): Self = this.set("inhibitPolicyMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInhibitPolicyMapping: Self = this.set("inhibitPolicyMapping", js.undefined)
    @scala.inline
    def setRequireExplicitPolicy(value: Double): Self = this.set("requireExplicitPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireExplicitPolicy: Self = this.set("requireExplicitPolicy", js.undefined)
  }
  
}

