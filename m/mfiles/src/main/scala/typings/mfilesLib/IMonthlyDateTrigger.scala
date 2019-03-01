package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMonthlyDateTrigger extends js.Object {
  var Days: scala.Double
  var Months: mfilesLib.MFilesNs.MFTriggerMonth
}

object IMonthlyDateTrigger {
  @scala.inline
  def apply(Days: scala.Double, Months: mfilesLib.MFilesNs.MFTriggerMonth): IMonthlyDateTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Days")(Days)
    __obj.updateDynamic("Months")(Months)
    __obj.asInstanceOf[IMonthlyDateTrigger]
  }
}

