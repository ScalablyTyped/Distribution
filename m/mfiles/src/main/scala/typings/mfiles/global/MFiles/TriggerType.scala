package typings.mfiles.global.MFiles

import typings.mfiles.IDailyTrigger
import typings.mfiles.IMonthlyDOWTrigger
import typings.mfiles.IMonthlyDateTrigger
import typings.mfiles.ITriggerType
import typings.mfiles.IWeeklyTrigger
import typings.mfiles.MFiles.MFTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.TriggerType")
@js.native
class TriggerType ()
  extends StObject
     with ITriggerType {
  
  /* CompleteClass */
  override def Clone(): ITriggerType = js.native
  
  /* CompleteClass */
  override val Daily: IDailyTrigger = js.native
  
  /* CompleteClass */
  override val MonthlyDOW: IMonthlyDOWTrigger = js.native
  
  /* CompleteClass */
  override val MonthlyDate: IMonthlyDateTrigger = js.native
  
  /* CompleteClass */
  override def SetDailyTrigger(DailyTrigger: IDailyTrigger): Unit = js.native
  
  /* CompleteClass */
  override def SetMonthlyDOW(MonthlyDOWTrigger: IMonthlyDOWTrigger): Unit = js.native
  
  /* CompleteClass */
  override def SetMonthlyDate(MonthlyDateTrigger: IMonthlyDateTrigger): Unit = js.native
  
  /* CompleteClass */
  override def SetWeekly(WeeklyTrigger: IWeeklyTrigger): Unit = js.native
  
  /* CompleteClass */
  var Type: MFTriggerType = js.native
  
  /* CompleteClass */
  override val Weekly: IWeeklyTrigger = js.native
}
