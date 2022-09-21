package typings.mfiles.global.MFiles

import typings.mfiles.IObjVer
import typings.mfiles.ISignatureSettings
import typings.mfiles.IStateTransitionsForClient
import typings.mfiles.IStates
import typings.mfiles.ITypedValue
import typings.mfiles.IValueListItems
import typings.mfiles.IVaultWorkflowOperations
import typings.mfiles.IWorkflow
import typings.mfiles.IWorkflowAdmin
import typings.mfiles.IWorkflows
import typings.mfiles.IWorkflowsAdmin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultWorkflowOperations")
@js.native
open class VaultWorkflowOperations ()
  extends StObject
     with IVaultWorkflowOperations {
  
  /* CompleteClass */
  override def AddWorkflowAdmin(Workflow: IWorkflowAdmin): IWorkflowAdmin = js.native
  
  /* CompleteClass */
  override def GetStateTransitionSignatureSettings(FromState: Double, ToState: Double): ISignatureSettings = js.native
  
  /* CompleteClass */
  override def GetStateTransitionSignatureSettingsByID(StateTransitionID: Double): ISignatureSettings = js.native
  
  /* CompleteClass */
  override def GetWorkflowAdmin(WorkflowID: Double): IWorkflowAdmin = js.native
  
  /* CompleteClass */
  override def GetWorkflowForClient(WorkflowID: Double, UpdateFromServer: Boolean): IWorkflow = js.native
  
  /* CompleteClass */
  override def GetWorkflowIDByAlias(Alias: String): Double = js.native
  
  /* CompleteClass */
  override def GetWorkflowIDByGUID(WorkflowGUID: String): Double = js.native
  
  /* CompleteClass */
  override def GetWorkflowStateIDByAlias(Alias: String): Double = js.native
  
  /* CompleteClass */
  override def GetWorkflowStateIDByGUID(StateGUID: String): Double = js.native
  
  /* CompleteClass */
  override def GetWorkflowStateTransitionIDByAlias(Alias: String): Double = js.native
  
  /* CompleteClass */
  override def GetWorkflowStateTransitionIDByGUID(StateTransitionGUID: String): Double = js.native
  
  /* CompleteClass */
  override def GetWorkflowStateTransitions(Workflow: Double, CurrentState: ITypedValue): IStateTransitionsForClient = js.native
  
  /* CompleteClass */
  override def GetWorkflowStateTransitionsAsJSON(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): String = js.native
  
  /* CompleteClass */
  override def GetWorkflowStateTransitionsEx(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): IStateTransitionsForClient = js.native
  
  /* CompleteClass */
  override def GetWorkflowStates(Workflow: Double, CurrentState: ITypedValue): IStates = js.native
  
  /* CompleteClass */
  override def GetWorkflowStatesEx(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): IStates = js.native
  
  /* CompleteClass */
  override def GetWorkflowsAdmin(): IWorkflowsAdmin = js.native
  
  /* CompleteClass */
  override def GetWorkflowsAsValueListItems(UpdateFromServer: Boolean): IValueListItems = js.native
  
  /* CompleteClass */
  override def GetWorkflowsForClient(UpdateFromServer: Boolean): IWorkflows = js.native
  
  /* CompleteClass */
  override def RemoveWorkflowAdmin(WorkflowID: Double): Unit = js.native
  
  /* CompleteClass */
  override def UpdateWorkflowAdmin(Workflow: IWorkflowAdmin): IWorkflowAdmin = js.native
}
