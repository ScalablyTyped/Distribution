package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultWorkflowOperationsAsync extends js.Object {
  
  def AddWorkflowAdmin(Workflow: IWorkflowAdmin): Unit = js.native
  def AddWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddWorkflowAdmin(Workflow: IWorkflowAdmin, successCallback: js.Function1[/* result */ IWorkflowAdmin, Unit]): Unit = js.native
  def AddWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetStateTransitionSignatureSettings(FromState: Double, ToState: Double): Unit = js.native
  def GetStateTransitionSignatureSettings(
    FromState: Double,
    ToState: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetStateTransitionSignatureSettings(
    FromState: Double,
    ToState: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetStateTransitionSignatureSettings(
    FromState: Double,
    ToState: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetStateTransitionSignatureSettings(
    FromState: Double,
    ToState: Double,
    successCallback: js.Function1[/* result */ ISignatureSettings, Unit]
  ): Unit = js.native
  def GetStateTransitionSignatureSettings(
    FromState: Double,
    ToState: Double,
    successCallback: js.Function1[/* result */ ISignatureSettings, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetStateTransitionSignatureSettings(
    FromState: Double,
    ToState: Double,
    successCallback: js.Function1[/* result */ ISignatureSettings, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetStateTransitionSignatureSettings(
    FromState: Double,
    ToState: Double,
    successCallback: js.Function1[/* result */ ISignatureSettings, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetStateTransitionSignatureSettingsByID(StateTransitionID: Double): Unit = js.native
  def GetStateTransitionSignatureSettingsByID(
    StateTransitionID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetStateTransitionSignatureSettingsByID(
    StateTransitionID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetStateTransitionSignatureSettingsByID(
    StateTransitionID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetStateTransitionSignatureSettingsByID(StateTransitionID: Double, successCallback: js.Function1[/* result */ ISignatureSettings, Unit]): Unit = js.native
  def GetStateTransitionSignatureSettingsByID(
    StateTransitionID: Double,
    successCallback: js.Function1[/* result */ ISignatureSettings, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetStateTransitionSignatureSettingsByID(
    StateTransitionID: Double,
    successCallback: js.Function1[/* result */ ISignatureSettings, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetStateTransitionSignatureSettingsByID(
    StateTransitionID: Double,
    successCallback: js.Function1[/* result */ ISignatureSettings, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowAdmin(WorkflowID: Double): Unit = js.native
  def GetWorkflowAdmin(
    WorkflowID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowAdmin(
    WorkflowID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowAdmin(
    WorkflowID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowAdmin(WorkflowID: Double, successCallback: js.Function1[/* result */ IWorkflowAdmin, Unit]): Unit = js.native
  def GetWorkflowAdmin(
    WorkflowID: Double,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowAdmin(
    WorkflowID: Double,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowAdmin(
    WorkflowID: Double,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowForClient(WorkflowID: Double, UpdateFromServer: Boolean): Unit = js.native
  def GetWorkflowForClient(
    WorkflowID: Double,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowForClient(
    WorkflowID: Double,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowForClient(
    WorkflowID: Double,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowForClient(
    WorkflowID: Double,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IWorkflow, Unit]
  ): Unit = js.native
  def GetWorkflowForClient(
    WorkflowID: Double,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IWorkflow, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowForClient(
    WorkflowID: Double,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IWorkflow, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowForClient(
    WorkflowID: Double,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IWorkflow, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowIDByAlias(Alias: String): Unit = js.native
  def GetWorkflowIDByAlias(
    Alias: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowIDByAlias(
    Alias: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowIDByAlias(
    Alias: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowIDByAlias(Alias: String, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def GetWorkflowIDByAlias(
    Alias: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowIDByAlias(
    Alias: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowIDByAlias(
    Alias: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowIDByGUID(WorkflowGUID: String): Unit = js.native
  def GetWorkflowIDByGUID(
    WorkflowGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowIDByGUID(
    WorkflowGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowIDByGUID(
    WorkflowGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowIDByGUID(WorkflowGUID: String, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def GetWorkflowIDByGUID(
    WorkflowGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowIDByGUID(
    WorkflowGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowIDByGUID(
    WorkflowGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowStateIDByAlias(Alias: String): Unit = js.native
  def GetWorkflowStateIDByAlias(
    Alias: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateIDByAlias(
    Alias: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStateIDByAlias(
    Alias: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateIDByAlias(Alias: String, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def GetWorkflowStateIDByAlias(
    Alias: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateIDByAlias(
    Alias: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStateIDByAlias(
    Alias: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowStateIDByGUID(StateGUID: String): Unit = js.native
  def GetWorkflowStateIDByGUID(
    StateGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateIDByGUID(
    StateGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStateIDByGUID(
    StateGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateIDByGUID(StateGUID: String, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def GetWorkflowStateIDByGUID(
    StateGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateIDByGUID(
    StateGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStateIDByGUID(
    StateGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowStateTransitionIDByAlias(Alias: String): Unit = js.native
  def GetWorkflowStateTransitionIDByAlias(
    Alias: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionIDByAlias(
    Alias: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionIDByAlias(
    Alias: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionIDByAlias(Alias: String, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def GetWorkflowStateTransitionIDByAlias(
    Alias: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionIDByAlias(
    Alias: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionIDByAlias(
    Alias: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowStateTransitionIDByGUID(StateTransitionGUID: String): Unit = js.native
  def GetWorkflowStateTransitionIDByGUID(
    StateTransitionGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionIDByGUID(
    StateTransitionGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionIDByGUID(
    StateTransitionGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionIDByGUID(StateTransitionGUID: String, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def GetWorkflowStateTransitionIDByGUID(
    StateTransitionGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionIDByGUID(
    StateTransitionGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionIDByGUID(
    StateTransitionGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowStateTransitions(Workflow: Double, CurrentState: ITypedValue): Unit = js.native
  def GetWorkflowStateTransitions(
    Workflow: Double,
    CurrentState: ITypedValue,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitions(
    Workflow: Double,
    CurrentState: ITypedValue,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitions(
    Workflow: Double,
    CurrentState: ITypedValue,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitions(
    Workflow: Double,
    CurrentState: ITypedValue,
    successCallback: js.Function1[/* result */ IStateTransitionsForClient, Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitions(
    Workflow: Double,
    CurrentState: ITypedValue,
    successCallback: js.Function1[/* result */ IStateTransitionsForClient, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitions(
    Workflow: Double,
    CurrentState: ITypedValue,
    successCallback: js.Function1[/* result */ IStateTransitionsForClient, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitions(
    Workflow: Double,
    CurrentState: ITypedValue,
    successCallback: js.Function1[/* result */ IStateTransitionsForClient, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowStateTransitionsAsJSON(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): Unit = js.native
  def GetWorkflowStateTransitionsAsJSON(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionsAsJSON(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionsAsJSON(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionsAsJSON(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionsAsJSON(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionsAsJSON(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionsAsJSON(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowStateTransitionsEx(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): Unit = js.native
  def GetWorkflowStateTransitionsEx(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionsEx(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionsEx(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionsEx(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IStateTransitionsForClient, Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionsEx(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IStateTransitionsForClient, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionsEx(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IStateTransitionsForClient, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStateTransitionsEx(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IStateTransitionsForClient, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowStates(Workflow: Double, CurrentState: ITypedValue): Unit = js.native
  def GetWorkflowStates(
    Workflow: Double,
    CurrentState: ITypedValue,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStates(
    Workflow: Double,
    CurrentState: ITypedValue,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStates(
    Workflow: Double,
    CurrentState: ITypedValue,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStates(
    Workflow: Double,
    CurrentState: ITypedValue,
    successCallback: js.Function1[/* result */ IStates, Unit]
  ): Unit = js.native
  def GetWorkflowStates(
    Workflow: Double,
    CurrentState: ITypedValue,
    successCallback: js.Function1[/* result */ IStates, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStates(
    Workflow: Double,
    CurrentState: ITypedValue,
    successCallback: js.Function1[/* result */ IStates, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStates(
    Workflow: Double,
    CurrentState: ITypedValue,
    successCallback: js.Function1[/* result */ IStates, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowStatesEx(Workflow: Double, CurrentState: ITypedValue, ObjVer: IObjVer): Unit = js.native
  def GetWorkflowStatesEx(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStatesEx(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStatesEx(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStatesEx(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IStates, Unit]
  ): Unit = js.native
  def GetWorkflowStatesEx(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IStates, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowStatesEx(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IStates, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowStatesEx(
    Workflow: Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IStates, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowsAdmin(): Unit = js.native
  def GetWorkflowsAdmin(
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowsAdmin(
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowsAdmin(
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowsAdmin(successCallback: js.Function1[/* result */ IWorkflowsAdmin, Unit]): Unit = js.native
  def GetWorkflowsAdmin(
    successCallback: js.Function1[/* result */ IWorkflowsAdmin, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowsAdmin(
    successCallback: js.Function1[/* result */ IWorkflowsAdmin, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowsAdmin(
    successCallback: js.Function1[/* result */ IWorkflowsAdmin, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowsAsValueListItems(UpdateFromServer: Boolean): Unit = js.native
  def GetWorkflowsAsValueListItems(
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowsAsValueListItems(
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowsAsValueListItems(
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowsAsValueListItems(UpdateFromServer: Boolean, successCallback: js.Function1[/* result */ IValueListItems, Unit]): Unit = js.native
  def GetWorkflowsAsValueListItems(
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowsAsValueListItems(
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowsAsValueListItems(
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetWorkflowsForClient(UpdateFromServer: Boolean): Unit = js.native
  def GetWorkflowsForClient(
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowsForClient(
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowsForClient(
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowsForClient(UpdateFromServer: Boolean, successCallback: js.Function1[/* result */ IWorkflows, Unit]): Unit = js.native
  def GetWorkflowsForClient(
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IWorkflows, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetWorkflowsForClient(
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IWorkflows, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetWorkflowsForClient(
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IWorkflows, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def RemoveWorkflowAdmin(WorkflowID: Double): Unit = js.native
  def RemoveWorkflowAdmin(
    WorkflowID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveWorkflowAdmin(
    WorkflowID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveWorkflowAdmin(
    WorkflowID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveWorkflowAdmin(WorkflowID: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def RemoveWorkflowAdmin(
    WorkflowID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveWorkflowAdmin(
    WorkflowID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveWorkflowAdmin(
    WorkflowID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UpdateWorkflowAdmin(Workflow: IWorkflowAdmin): Unit = js.native
  def UpdateWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UpdateWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateWorkflowAdmin(Workflow: IWorkflowAdmin, successCallback: js.Function1[/* result */ IWorkflowAdmin, Unit]): Unit = js.native
  def UpdateWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UpdateWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}
