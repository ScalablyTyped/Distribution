package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IVaultWorkflowOperations extends js.Object {
  def AddWorkflowAdmin(Workflow: IWorkflowAdmin): IWorkflowAdmin
  def GetStateTransitionSignatureSettings(FromState: scala.Double, ToState: scala.Double): ISignatureSettings
  def GetStateTransitionSignatureSettingsByID(StateTransitionID: scala.Double): ISignatureSettings
  def GetWorkflowAdmin(WorkflowID: scala.Double): IWorkflowAdmin
  def GetWorkflowForClient(WorkflowID: scala.Double, UpdateFromServer: scala.Boolean): IWorkflow
  def GetWorkflowIDByAlias(Alias: java.lang.String): scala.Double
  def GetWorkflowIDByGUID(WorkflowGUID: java.lang.String): scala.Double
  def GetWorkflowStateIDByAlias(Alias: java.lang.String): scala.Double
  def GetWorkflowStateIDByGUID(StateGUID: java.lang.String): scala.Double
  def GetWorkflowStateTransitionIDByAlias(Alias: java.lang.String): scala.Double
  def GetWorkflowStateTransitionIDByGUID(StateTransitionGUID: java.lang.String): scala.Double
  def GetWorkflowStateTransitions(Workflow: scala.Double, CurrentState: ITypedValue): IStateTransitionsForClient
  def GetWorkflowStateTransitionsAsJSON(Workflow: scala.Double, CurrentState: ITypedValue, ObjVer: IObjVer): java.lang.String
  def GetWorkflowStateTransitionsEx(Workflow: scala.Double, CurrentState: ITypedValue, ObjVer: IObjVer): IStateTransitionsForClient
  def GetWorkflowStates(Workflow: scala.Double, CurrentState: ITypedValue): IStates
  def GetWorkflowStatesEx(Workflow: scala.Double, CurrentState: ITypedValue, ObjVer: IObjVer): IStates
  def GetWorkflowsAdmin(): IWorkflowsAdmin
  def GetWorkflowsAsValueListItems(UpdateFromServer: scala.Boolean): IValueListItems
  def GetWorkflowsForClient(UpdateFromServer: scala.Boolean): IWorkflows
  def RemoveWorkflowAdmin(WorkflowID: scala.Double): scala.Unit
  def UpdateWorkflowAdmin(Workflow: IWorkflowAdmin): IWorkflowAdmin
}

