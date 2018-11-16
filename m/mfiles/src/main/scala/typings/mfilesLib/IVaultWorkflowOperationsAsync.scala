package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultWorkflowOperationsAsync extends js.Object {
  def AddWorkflowAdmin(Workflow: IWorkflowAdmin): scala.Unit = js.native
  def AddWorkflowAdmin(Workflow: IWorkflowAdmin, successCallback: js.Function1[/* result */ IWorkflowAdmin, scala.Unit]): scala.Unit = js.native
  def AddWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetStateTransitionSignatureSettings(FromState: scala.Double, ToState: scala.Double): scala.Unit = js.native
  def GetStateTransitionSignatureSettings(
    FromState: scala.Double,
    ToState: scala.Double,
    successCallback: js.Function1[/* result */ ISignatureSettings, scala.Unit]
  ): scala.Unit = js.native
  def GetStateTransitionSignatureSettings(
    FromState: scala.Double,
    ToState: scala.Double,
    successCallback: js.Function1[/* result */ ISignatureSettings, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetStateTransitionSignatureSettings(
    FromState: scala.Double,
    ToState: scala.Double,
    successCallback: js.Function1[/* result */ ISignatureSettings, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetStateTransitionSignatureSettingsByID(StateTransitionID: scala.Double): scala.Unit = js.native
  def GetStateTransitionSignatureSettingsByID(
    StateTransitionID: scala.Double,
    successCallback: js.Function1[/* result */ ISignatureSettings, scala.Unit]
  ): scala.Unit = js.native
  def GetStateTransitionSignatureSettingsByID(
    StateTransitionID: scala.Double,
    successCallback: js.Function1[/* result */ ISignatureSettings, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetStateTransitionSignatureSettingsByID(
    StateTransitionID: scala.Double,
    successCallback: js.Function1[/* result */ ISignatureSettings, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowAdmin(WorkflowID: scala.Double): scala.Unit = js.native
  def GetWorkflowAdmin(WorkflowID: scala.Double, successCallback: js.Function1[/* result */ IWorkflowAdmin, scala.Unit]): scala.Unit = js.native
  def GetWorkflowAdmin(
    WorkflowID: scala.Double,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowAdmin(
    WorkflowID: scala.Double,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowForClient(WorkflowID: scala.Double, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def GetWorkflowForClient(
    WorkflowID: scala.Double,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IWorkflow, scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowForClient(
    WorkflowID: scala.Double,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IWorkflow, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowForClient(
    WorkflowID: scala.Double,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IWorkflow, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowIDByAlias(Alias: java.lang.String): scala.Unit = js.native
  def GetWorkflowIDByAlias(Alias: java.lang.String, successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def GetWorkflowIDByAlias(
    Alias: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowIDByAlias(
    Alias: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowIDByGUID(WorkflowGUID: java.lang.String): scala.Unit = js.native
  def GetWorkflowIDByGUID(
    WorkflowGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowIDByGUID(
    WorkflowGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowIDByGUID(
    WorkflowGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStateIDByAlias(Alias: java.lang.String): scala.Unit = js.native
  def GetWorkflowStateIDByAlias(Alias: java.lang.String, successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def GetWorkflowStateIDByAlias(
    Alias: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowStateIDByAlias(
    Alias: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStateIDByGUID(StateGUID: java.lang.String): scala.Unit = js.native
  def GetWorkflowStateIDByGUID(StateGUID: java.lang.String, successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def GetWorkflowStateIDByGUID(
    StateGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowStateIDByGUID(
    StateGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStateTransitionIDByAlias(Alias: java.lang.String): scala.Unit = js.native
  def GetWorkflowStateTransitionIDByAlias(Alias: java.lang.String, successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def GetWorkflowStateTransitionIDByAlias(
    Alias: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowStateTransitionIDByAlias(
    Alias: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStateTransitionIDByGUID(StateTransitionGUID: java.lang.String): scala.Unit = js.native
  def GetWorkflowStateTransitionIDByGUID(
    StateTransitionGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStateTransitionIDByGUID(
    StateTransitionGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowStateTransitionIDByGUID(
    StateTransitionGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStateTransitions(Workflow: scala.Double, CurrentState: ITypedValue): scala.Unit = js.native
  def GetWorkflowStateTransitions(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    successCallback: js.Function1[/* result */ IStateTransitionsForClient, scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStateTransitions(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    successCallback: js.Function1[/* result */ IStateTransitionsForClient, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowStateTransitions(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    successCallback: js.Function1[/* result */ IStateTransitionsForClient, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStateTransitionsAsJSON(Workflow: scala.Double, CurrentState: ITypedValue, ObjVer: IObjVer): scala.Unit = js.native
  def GetWorkflowStateTransitionsAsJSON(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStateTransitionsAsJSON(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowStateTransitionsAsJSON(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStateTransitionsEx(Workflow: scala.Double, CurrentState: ITypedValue, ObjVer: IObjVer): scala.Unit = js.native
  def GetWorkflowStateTransitionsEx(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IStateTransitionsForClient, scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStateTransitionsEx(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IStateTransitionsForClient, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowStateTransitionsEx(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IStateTransitionsForClient, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStates(Workflow: scala.Double, CurrentState: ITypedValue): scala.Unit = js.native
  def GetWorkflowStates(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    successCallback: js.Function1[/* result */ IStates, scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStates(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    successCallback: js.Function1[/* result */ IStates, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowStates(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    successCallback: js.Function1[/* result */ IStates, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStatesEx(Workflow: scala.Double, CurrentState: ITypedValue, ObjVer: IObjVer): scala.Unit = js.native
  def GetWorkflowStatesEx(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IStates, scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowStatesEx(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IStates, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowStatesEx(
    Workflow: scala.Double,
    CurrentState: ITypedValue,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IStates, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowsAdmin(): scala.Unit = js.native
  def GetWorkflowsAdmin(successCallback: js.Function1[/* result */ IWorkflowsAdmin, scala.Unit]): scala.Unit = js.native
  def GetWorkflowsAdmin(
    successCallback: js.Function1[/* result */ IWorkflowsAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowsAdmin(
    successCallback: js.Function1[/* result */ IWorkflowsAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowsAsValueListItems(UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def GetWorkflowsAsValueListItems(
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowsAsValueListItems(
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowsAsValueListItems(
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowsForClient(UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def GetWorkflowsForClient(
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IWorkflows, scala.Unit]
  ): scala.Unit = js.native
  def GetWorkflowsForClient(
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IWorkflows, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetWorkflowsForClient(
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IWorkflows, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveWorkflowAdmin(WorkflowID: scala.Double): scala.Unit = js.native
  def RemoveWorkflowAdmin(WorkflowID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def RemoveWorkflowAdmin(
    WorkflowID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveWorkflowAdmin(
    WorkflowID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UpdateWorkflowAdmin(Workflow: IWorkflowAdmin): scala.Unit = js.native
  def UpdateWorkflowAdmin(Workflow: IWorkflowAdmin, successCallback: js.Function1[/* result */ IWorkflowAdmin, scala.Unit]): scala.Unit = js.native
  def UpdateWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UpdateWorkflowAdmin(
    Workflow: IWorkflowAdmin,
    successCallback: js.Function1[/* result */ IWorkflowAdmin, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

