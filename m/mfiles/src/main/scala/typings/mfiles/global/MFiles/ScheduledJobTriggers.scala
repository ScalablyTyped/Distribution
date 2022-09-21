package typings.mfiles.global.MFiles

import typings.mfiles.IScheduledJobTrigger
import typings.mfiles.IScheduledJobTriggers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ScheduledJobTriggers")
@js.native
open class ScheduledJobTriggers ()
  extends StObject
     with IScheduledJobTriggers {
  
  /* CompleteClass */
  override def Add(Index: Double, ScheduledJobTrigger: IScheduledJobTrigger): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IScheduledJobTriggers = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IScheduledJobTrigger = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}
