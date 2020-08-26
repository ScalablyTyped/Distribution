package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlScore extends js.Object {
  // Control action category (Identity, Data, Device, Apps, Infrastructure).
  var controlCategory: js.UndefOr[String] = js.native
  // Control unique name.
  var controlName: js.UndefOr[String] = js.native
  // Description of the control.
  var description: js.UndefOr[String] = js.native
  // Tenant achieved score for the control (it varies day by day depending on tenant operations on the control).
  var score: js.UndefOr[Double] = js.native
}

object ControlScore {
  @scala.inline
  def apply(): ControlScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlScore]
  }
  @scala.inline
  implicit class ControlScoreOps[Self <: ControlScore] (val x: Self) extends AnyVal {
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
    def setControlCategory(value: String): Self = this.set("controlCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlCategory: Self = this.set("controlCategory", js.undefined)
    @scala.inline
    def setControlName(value: String): Self = this.set("controlName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlName: Self = this.set("controlName", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
  }
  
}

