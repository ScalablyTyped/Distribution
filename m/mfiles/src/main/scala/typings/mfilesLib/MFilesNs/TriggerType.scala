package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.TriggerType")
@js.native
class TriggerType ()
  extends mfilesLib.ITriggerType {
  /* CompleteClass */
  override val Daily: mfilesLib.IDailyTrigger = js.native
  /* CompleteClass */
  override val MonthlyDOW: mfilesLib.IMonthlyDOWTrigger = js.native
  /* CompleteClass */
  override val MonthlyDate: mfilesLib.IMonthlyDateTrigger = js.native
  /* CompleteClass */
  override var Type: MFTriggerType = js.native
  /* CompleteClass */
  override val Weekly: mfilesLib.IWeeklyTrigger = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.ITriggerType = js.native
  /* CompleteClass */
  override def SetDailyTrigger(DailyTrigger: mfilesLib.IDailyTrigger): scala.Unit = js.native
  /* CompleteClass */
  override def SetMonthlyDOW(MonthlyDOWTrigger: mfilesLib.IMonthlyDOWTrigger): scala.Unit = js.native
  /* CompleteClass */
  override def SetMonthlyDate(MonthlyDateTrigger: mfilesLib.IMonthlyDateTrigger): scala.Unit = js.native
  /* CompleteClass */
  override def SetWeekly(WeeklyTrigger: mfilesLib.IWeeklyTrigger): scala.Unit = js.native
}

@JSGlobal("MFiles.TriggerType")
@js.native
object TriggerType
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.ITriggerType]

