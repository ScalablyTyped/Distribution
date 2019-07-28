package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IDailyTrigger
import typings.mfiles.IMonthlyDOWTrigger
import typings.mfiles.IMonthlyDateTrigger
import typings.mfiles.ITriggerType
import typings.mfiles.IWeeklyTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.TriggerType")
@js.native
class TriggerType () extends ITriggerType {
  /* CompleteClass */
  override val Daily: IDailyTrigger = js.native
  /* CompleteClass */
  override val MonthlyDOW: IMonthlyDOWTrigger = js.native
  /* CompleteClass */
  override val MonthlyDate: IMonthlyDateTrigger = js.native
  /* CompleteClass */
  override var Type: MFTriggerType = js.native
  /* CompleteClass */
  override val Weekly: IWeeklyTrigger = js.native
  /* CompleteClass */
  override def Clone(): ITriggerType = js.native
  /* CompleteClass */
  override def SetDailyTrigger(DailyTrigger: IDailyTrigger): Unit = js.native
  /* CompleteClass */
  override def SetMonthlyDOW(MonthlyDOWTrigger: IMonthlyDOWTrigger): Unit = js.native
  /* CompleteClass */
  override def SetMonthlyDate(MonthlyDateTrigger: IMonthlyDateTrigger): Unit = js.native
  /* CompleteClass */
  override def SetWeekly(WeeklyTrigger: IWeeklyTrigger): Unit = js.native
}

@JSGlobal("MFiles.TriggerType")
@js.native
object TriggerType extends Instantiable0[ITriggerType]

