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

object IVaultWorkflowOperations {
  @scala.inline
  def apply(
    AddWorkflowAdmin: IWorkflowAdmin => IWorkflowAdmin,
    GetStateTransitionSignatureSettings: (scala.Double, scala.Double) => ISignatureSettings,
    GetStateTransitionSignatureSettingsByID: scala.Double => ISignatureSettings,
    GetWorkflowAdmin: scala.Double => IWorkflowAdmin,
    GetWorkflowForClient: (scala.Double, scala.Boolean) => IWorkflow,
    GetWorkflowIDByAlias: java.lang.String => scala.Double,
    GetWorkflowIDByGUID: java.lang.String => scala.Double,
    GetWorkflowStateIDByAlias: java.lang.String => scala.Double,
    GetWorkflowStateIDByGUID: java.lang.String => scala.Double,
    GetWorkflowStateTransitionIDByAlias: java.lang.String => scala.Double,
    GetWorkflowStateTransitionIDByGUID: java.lang.String => scala.Double,
    GetWorkflowStateTransitions: (scala.Double, ITypedValue) => IStateTransitionsForClient,
    GetWorkflowStateTransitionsAsJSON: (scala.Double, ITypedValue, IObjVer) => java.lang.String,
    GetWorkflowStateTransitionsEx: (scala.Double, ITypedValue, IObjVer) => IStateTransitionsForClient,
    GetWorkflowStates: (scala.Double, ITypedValue) => IStates,
    GetWorkflowStatesEx: (scala.Double, ITypedValue, IObjVer) => IStates,
    GetWorkflowsAdmin: () => IWorkflowsAdmin,
    GetWorkflowsAsValueListItems: scala.Boolean => IValueListItems,
    GetWorkflowsForClient: scala.Boolean => IWorkflows,
    RemoveWorkflowAdmin: scala.Double => scala.Unit,
    UpdateWorkflowAdmin: IWorkflowAdmin => IWorkflowAdmin
  ): IVaultWorkflowOperations = {
    val __obj = js.Dynamic.literal(AddWorkflowAdmin = js.Any.fromFunction1(AddWorkflowAdmin), GetStateTransitionSignatureSettings = js.Any.fromFunction2(GetStateTransitionSignatureSettings), GetStateTransitionSignatureSettingsByID = js.Any.fromFunction1(GetStateTransitionSignatureSettingsByID), GetWorkflowAdmin = js.Any.fromFunction1(GetWorkflowAdmin), GetWorkflowForClient = js.Any.fromFunction2(GetWorkflowForClient), GetWorkflowIDByAlias = js.Any.fromFunction1(GetWorkflowIDByAlias), GetWorkflowIDByGUID = js.Any.fromFunction1(GetWorkflowIDByGUID), GetWorkflowStateIDByAlias = js.Any.fromFunction1(GetWorkflowStateIDByAlias), GetWorkflowStateIDByGUID = js.Any.fromFunction1(GetWorkflowStateIDByGUID), GetWorkflowStateTransitionIDByAlias = js.Any.fromFunction1(GetWorkflowStateTransitionIDByAlias), GetWorkflowStateTransitionIDByGUID = js.Any.fromFunction1(GetWorkflowStateTransitionIDByGUID), GetWorkflowStateTransitions = js.Any.fromFunction2(GetWorkflowStateTransitions), GetWorkflowStateTransitionsAsJSON = js.Any.fromFunction3(GetWorkflowStateTransitionsAsJSON), GetWorkflowStateTransitionsEx = js.Any.fromFunction3(GetWorkflowStateTransitionsEx), GetWorkflowStates = js.Any.fromFunction2(GetWorkflowStates), GetWorkflowStatesEx = js.Any.fromFunction3(GetWorkflowStatesEx), GetWorkflowsAdmin = js.Any.fromFunction0(GetWorkflowsAdmin), GetWorkflowsAsValueListItems = js.Any.fromFunction1(GetWorkflowsAsValueListItems), GetWorkflowsForClient = js.Any.fromFunction1(GetWorkflowsForClient), RemoveWorkflowAdmin = js.Any.fromFunction1(RemoveWorkflowAdmin), UpdateWorkflowAdmin = js.Any.fromFunction1(UpdateWorkflowAdmin))
  
    __obj.asInstanceOf[IVaultWorkflowOperations]
  }
}

