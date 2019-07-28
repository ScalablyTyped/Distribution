package typings.mfiles

import typings.mfiles.MFilesNs.MFTriggerMonth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMonthlyDateTrigger extends js.Object {
  var Days: Double
  var Months: MFTriggerMonth
}

object IMonthlyDateTrigger {
  @scala.inline
  def apply(Days: Double, Months: MFTriggerMonth): IMonthlyDateTrigger = {
    val __obj = js.Dynamic.literal(Days = Days, Months = Months)
  
    __obj.asInstanceOf[IMonthlyDateTrigger]
  }
}

