package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionAppLearningSummary extends Entity {
  // Application Name
  var applicationName: js.UndefOr[String] = js.undefined
  // Application Type. Possible values are: universal, desktop.
  var applicationType: js.UndefOr[ApplicationType] = js.undefined
  // Device Count
  var deviceCount: js.UndefOr[Double] = js.undefined
}

object WindowsInformationProtectionAppLearningSummary {
  @scala.inline
  def apply(
    applicationName: String = null,
    applicationType: ApplicationType = null,
    deviceCount: Int | Double = null,
    id: String = null
  ): WindowsInformationProtectionAppLearningSummary = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName)
    if (applicationType != null) __obj.updateDynamic("applicationType")(applicationType)
    if (deviceCount != null) __obj.updateDynamic("deviceCount")(deviceCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[WindowsInformationProtectionAppLearningSummary]
  }
}

