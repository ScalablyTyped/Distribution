package typings.mfiles.global.MFiles

import typings.mfiles.IScheduledJobTrigger
import typings.mfiles.ITriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ScheduledJobTrigger")
@js.native
open class ScheduledJobTrigger ()
  extends StObject
     with IScheduledJobTrigger {
  
  /* CompleteClass */
  var BeginDay: Double = js.native
  
  /* CompleteClass */
  var BeginMonth: Double = js.native
  
  /* CompleteClass */
  var BeginYear: Double = js.native
  
  /* CompleteClass */
  override def Clone(): IScheduledJobTrigger = js.native
  
  /* CompleteClass */
  var EndDay: Double = js.native
  
  /* CompleteClass */
  var EndMonth: Double = js.native
  
  /* CompleteClass */
  var EndYear: Double = js.native
  
  /* CompleteClass */
  var StartHour: Double = js.native
  
  /* CompleteClass */
  var StartMinute: Double = js.native
  
  /* CompleteClass */
  var Type: ITriggerType = js.native
  
  /* CompleteClass */
  var ValidEndDate: Boolean = js.native
}
