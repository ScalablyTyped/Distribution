package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Teamwork extends Entity {
  var workforceIntegrations: js.UndefOr[js.Array[WorkforceIntegration]] = js.native
}

object Teamwork {
  @scala.inline
  def apply(): Teamwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Teamwork]
  }
  @scala.inline
  implicit class TeamworkOps[Self <: Teamwork] (val x: Self) extends AnyVal {
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
    def setWorkforceIntegrationsVarargs(value: WorkforceIntegration*): Self = this.set("workforceIntegrations", js.Array(value :_*))
    @scala.inline
    def setWorkforceIntegrations(value: js.Array[WorkforceIntegration]): Self = this.set("workforceIntegrations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkforceIntegrations: Self = this.set("workforceIntegrations", js.undefined)
  }
  
}

