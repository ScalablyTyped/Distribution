package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultWorkflowOperations")
@js.native
class VaultWorkflowOperations ()
  extends mfilesLib.IVaultWorkflowOperations {
  /* CompleteClass */
  override def AddWorkflowAdmin(Workflow: mfilesLib.IWorkflowAdmin): mfilesLib.IWorkflowAdmin = js.native
  /* CompleteClass */
  override def GetStateTransitionSignatureSettings(FromState: scala.Double, ToState: scala.Double): mfilesLib.ISignatureSettings = js.native
  /* CompleteClass */
  override def GetStateTransitionSignatureSettingsByID(StateTransitionID: scala.Double): mfilesLib.ISignatureSettings = js.native
  /* CompleteClass */
  override def GetWorkflowAdmin(WorkflowID: scala.Double): mfilesLib.IWorkflowAdmin = js.native
  /* CompleteClass */
  override def GetWorkflowForClient(WorkflowID: scala.Double, UpdateFromServer: scala.Boolean): mfilesLib.IWorkflow = js.native
  /* CompleteClass */
  override def GetWorkflowIDByAlias(Alias: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def GetWorkflowIDByGUID(WorkflowGUID: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def GetWorkflowStateIDByAlias(Alias: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def GetWorkflowStateIDByGUID(StateGUID: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def GetWorkflowStateTransitionIDByAlias(Alias: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def GetWorkflowStateTransitionIDByGUID(StateTransitionGUID: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def GetWorkflowStateTransitions(Workflow: scala.Double, CurrentState: mfilesLib.ITypedValue): mfilesLib.IStateTransitionsForClient = js.native
  /* CompleteClass */
  override def GetWorkflowStateTransitionsAsJSON(Workflow: scala.Double, CurrentState: mfilesLib.ITypedValue, ObjVer: mfilesLib.IObjVer): java.lang.String = js.native
  /* CompleteClass */
  override def GetWorkflowStateTransitionsEx(Workflow: scala.Double, CurrentState: mfilesLib.ITypedValue, ObjVer: mfilesLib.IObjVer): mfilesLib.IStateTransitionsForClient = js.native
  /* CompleteClass */
  override def GetWorkflowStates(Workflow: scala.Double, CurrentState: mfilesLib.ITypedValue): mfilesLib.IStates = js.native
  /* CompleteClass */
  override def GetWorkflowStatesEx(Workflow: scala.Double, CurrentState: mfilesLib.ITypedValue, ObjVer: mfilesLib.IObjVer): mfilesLib.IStates = js.native
  /* CompleteClass */
  override def GetWorkflowsAdmin(): mfilesLib.IWorkflowsAdmin = js.native
  /* CompleteClass */
  override def GetWorkflowsAsValueListItems(UpdateFromServer: scala.Boolean): mfilesLib.IValueListItems = js.native
  /* CompleteClass */
  override def GetWorkflowsForClient(UpdateFromServer: scala.Boolean): mfilesLib.IWorkflows = js.native
  /* CompleteClass */
  override def RemoveWorkflowAdmin(WorkflowID: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def UpdateWorkflowAdmin(Workflow: mfilesLib.IWorkflowAdmin): mfilesLib.IWorkflowAdmin = js.native
}

@JSGlobal("MFiles.VaultWorkflowOperations")
@js.native
object VaultWorkflowOperations
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IVaultWorkflowOperations]

