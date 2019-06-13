package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Security extends Entity {
  /** Read-only. Nullable. */
  var alerts: js.UndefOr[js.Array[Alert]] = js.undefined
  var secureScoreControlProfiles: js.UndefOr[js.Array[SecureScoreControlProfile]] = js.undefined
  var secureScores: js.UndefOr[js.Array[SecureScore]] = js.undefined
}

object Security {
  @scala.inline
  def apply(
    alerts: js.Array[Alert] = null,
    id: java.lang.String = null,
    secureScoreControlProfiles: js.Array[SecureScoreControlProfile] = null,
    secureScores: js.Array[SecureScore] = null
  ): Security = {
    val __obj = js.Dynamic.literal()
    if (alerts != null) __obj.updateDynamic("alerts")(alerts)
    if (id != null) __obj.updateDynamic("id")(id)
    if (secureScoreControlProfiles != null) __obj.updateDynamic("secureScoreControlProfiles")(secureScoreControlProfiles)
    if (secureScores != null) __obj.updateDynamic("secureScores")(secureScores)
    __obj.asInstanceOf[Security]
  }
}

