package typings.mfiles.global.MFiles

import typings.mfiles.IWorkflowAdmin
import typings.mfiles.IWorkflowsAdmin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.WorkflowsAdmin")
@js.native
open class WorkflowsAdmin ()
  extends StObject
     with IWorkflowsAdmin {
  
  /* CompleteClass */
  override def Add(Index: Double, WorkflowAdmin: IWorkflowAdmin): Unit = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IWorkflowAdmin = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}
