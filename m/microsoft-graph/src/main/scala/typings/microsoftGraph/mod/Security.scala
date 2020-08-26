package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Security extends Entity {
  // Read-only. Nullable.
  var alerts: js.UndefOr[js.Array[Alert]] = js.native
  var secureScoreControlProfiles: js.UndefOr[js.Array[SecureScoreControlProfile]] = js.native
  var secureScores: js.UndefOr[js.Array[SecureScore]] = js.native
}

object Security {
  @scala.inline
  def apply(): Security = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Security]
  }
  @scala.inline
  implicit class SecurityOps[Self <: Security] (val x: Self) extends AnyVal {
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
    def setAlertsVarargs(value: Alert*): Self = this.set("alerts", js.Array(value :_*))
    @scala.inline
    def setAlerts(value: js.Array[Alert]): Self = this.set("alerts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlerts: Self = this.set("alerts", js.undefined)
    @scala.inline
    def setSecureScoreControlProfilesVarargs(value: SecureScoreControlProfile*): Self = this.set("secureScoreControlProfiles", js.Array(value :_*))
    @scala.inline
    def setSecureScoreControlProfiles(value: js.Array[SecureScoreControlProfile]): Self = this.set("secureScoreControlProfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureScoreControlProfiles: Self = this.set("secureScoreControlProfiles", js.undefined)
    @scala.inline
    def setSecureScoresVarargs(value: SecureScore*): Self = this.set("secureScores", js.Array(value :_*))
    @scala.inline
    def setSecureScores(value: js.Array[SecureScore]): Self = this.set("secureScores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureScores: Self = this.set("secureScores", js.undefined)
  }
  
}

