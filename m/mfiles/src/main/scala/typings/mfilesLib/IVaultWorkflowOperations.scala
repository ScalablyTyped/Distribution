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
    AddWorkflowAdmin: js.Function1[IWorkflowAdmin, IWorkflowAdmin],
    GetStateTransitionSignatureSettings: js.Function2[scala.Double, scala.Double, ISignatureSettings],
    GetStateTransitionSignatureSettingsByID: js.Function1[scala.Double, ISignatureSettings],
    GetWorkflowAdmin: js.Function1[scala.Double, IWorkflowAdmin],
    GetWorkflowForClient: js.Function2[scala.Double, scala.Boolean, IWorkflow],
    GetWorkflowIDByAlias: js.Function1[java.lang.String, scala.Double],
    GetWorkflowIDByGUID: js.Function1[java.lang.String, scala.Double],
    GetWorkflowStateIDByAlias: js.Function1[java.lang.String, scala.Double],
    GetWorkflowStateIDByGUID: js.Function1[java.lang.String, scala.Double],
    GetWorkflowStateTransitionIDByAlias: js.Function1[java.lang.String, scala.Double],
    GetWorkflowStateTransitionIDByGUID: js.Function1[java.lang.String, scala.Double],
    GetWorkflowStateTransitions: js.Function2[scala.Double, ITypedValue, IStateTransitionsForClient],
    GetWorkflowStateTransitionsAsJSON: js.Function3[scala.Double, ITypedValue, IObjVer, java.lang.String],
    GetWorkflowStateTransitionsEx: js.Function3[scala.Double, ITypedValue, IObjVer, IStateTransitionsForClient],
    GetWorkflowStates: js.Function2[scala.Double, ITypedValue, IStates],
    GetWorkflowStatesEx: js.Function3[scala.Double, ITypedValue, IObjVer, IStates],
    GetWorkflowsAdmin: js.Function0[IWorkflowsAdmin],
    GetWorkflowsAsValueListItems: js.Function1[scala.Boolean, IValueListItems],
    GetWorkflowsForClient: js.Function1[scala.Boolean, IWorkflows],
    RemoveWorkflowAdmin: js.Function1[scala.Double, scala.Unit],
    UpdateWorkflowAdmin: js.Function1[IWorkflowAdmin, IWorkflowAdmin]
  ): IVaultWorkflowOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AddWorkflowAdmin")(AddWorkflowAdmin)
    __obj.updateDynamic("GetStateTransitionSignatureSettings")(GetStateTransitionSignatureSettings)
    __obj.updateDynamic("GetStateTransitionSignatureSettingsByID")(GetStateTransitionSignatureSettingsByID)
    __obj.updateDynamic("GetWorkflowAdmin")(GetWorkflowAdmin)
    __obj.updateDynamic("GetWorkflowForClient")(GetWorkflowForClient)
    __obj.updateDynamic("GetWorkflowIDByAlias")(GetWorkflowIDByAlias)
    __obj.updateDynamic("GetWorkflowIDByGUID")(GetWorkflowIDByGUID)
    __obj.updateDynamic("GetWorkflowStateIDByAlias")(GetWorkflowStateIDByAlias)
    __obj.updateDynamic("GetWorkflowStateIDByGUID")(GetWorkflowStateIDByGUID)
    __obj.updateDynamic("GetWorkflowStateTransitionIDByAlias")(GetWorkflowStateTransitionIDByAlias)
    __obj.updateDynamic("GetWorkflowStateTransitionIDByGUID")(GetWorkflowStateTransitionIDByGUID)
    __obj.updateDynamic("GetWorkflowStateTransitions")(GetWorkflowStateTransitions)
    __obj.updateDynamic("GetWorkflowStateTransitionsAsJSON")(GetWorkflowStateTransitionsAsJSON)
    __obj.updateDynamic("GetWorkflowStateTransitionsEx")(GetWorkflowStateTransitionsEx)
    __obj.updateDynamic("GetWorkflowStates")(GetWorkflowStates)
    __obj.updateDynamic("GetWorkflowStatesEx")(GetWorkflowStatesEx)
    __obj.updateDynamic("GetWorkflowsAdmin")(GetWorkflowsAdmin)
    __obj.updateDynamic("GetWorkflowsAsValueListItems")(GetWorkflowsAsValueListItems)
    __obj.updateDynamic("GetWorkflowsForClient")(GetWorkflowsForClient)
    __obj.updateDynamic("RemoveWorkflowAdmin")(RemoveWorkflowAdmin)
    __obj.updateDynamic("UpdateWorkflowAdmin")(UpdateWorkflowAdmin)
    __obj.asInstanceOf[IVaultWorkflowOperations]
  }
}

