package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Variable extends js.Object {
  
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.native
  
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.native
  
  /**
    * For mobile containers only: A list of trigger IDs for disabling conditional variables; the variable is enabled if one of the enabling trigger is true while all the disabling trigger
    * are false. Treated as an unordered set. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable tagmanager.accounts.containers.workspaces.variables.update
    */
  var disablingTriggerId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * For mobile containers only: A list of trigger IDs for enabling conditional variables; the variable is enabled if one of the enabling triggers is true while all the disabling
    * triggers are false. Treated as an unordered set. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable
    * tagmanager.accounts.containers.workspaces.variables.update
    */
  var enablingTriggerId: js.UndefOr[js.Array[String]] = js.native
  
  /** The fingerprint of the GTM Variable as computed at storage time. This value is recomputed whenever the variable is modified. */
  var fingerprint: js.UndefOr[String] = js.native
  
  /** Option to convert a variable value to other value. */
  var formatValue: js.UndefOr[VariableFormatValue] = js.native
  
  /** Variable display name. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable tagmanager.accounts.containers.workspaces.variables.update */
  var name: js.UndefOr[String] = js.native
  
  /**
    * User notes on how to apply this variable in the container. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable
    * tagmanager.accounts.containers.workspaces.variables.update
    */
  var notes: js.UndefOr[String] = js.native
  
  /** The variable's parameters. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable tagmanager.accounts.containers.workspaces.variables.update */
  var parameter: js.UndefOr[js.Array[Parameter]] = js.native
  
  /** Parent folder id. */
  var parentFolderId: js.UndefOr[String] = js.native
  
  /** GTM Variable's API relative path. */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The end timestamp in milliseconds to schedule a variable. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable
    * tagmanager.accounts.containers.workspaces.variables.update
    */
  var scheduleEndMs: js.UndefOr[String] = js.native
  
  /**
    * The start timestamp in milliseconds to schedule a variable. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable
    * tagmanager.accounts.containers.workspaces.variables.update
    */
  var scheduleStartMs: js.UndefOr[String] = js.native
  
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.native
  
  /** GTM Variable Type. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable tagmanager.accounts.containers.workspaces.variables.update */
  var `type`: js.UndefOr[String] = js.native
  
  /** The Variable ID uniquely identifies the GTM Variable. */
  var variableId: js.UndefOr[String] = js.native
  
  /** GTM Workspace ID. */
  var workspaceId: js.UndefOr[String] = js.native
}
object Variable {
  
  @scala.inline
  def apply(): Variable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variable]
  }
  
  @scala.inline
  implicit class VariableOps[Self <: Variable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setDisablingTriggerIdVarargs(value: String*): Self = this.set("disablingTriggerId", js.Array(value :_*))
    
    @scala.inline
    def setDisablingTriggerId(value: js.Array[String]): Self = this.set("disablingTriggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablingTriggerId: Self = this.set("disablingTriggerId", js.undefined)
    
    @scala.inline
    def setEnablingTriggerIdVarargs(value: String*): Self = this.set("enablingTriggerId", js.Array(value :_*))
    
    @scala.inline
    def setEnablingTriggerId(value: js.Array[String]): Self = this.set("enablingTriggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablingTriggerId: Self = this.set("enablingTriggerId", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setFormatValue(value: VariableFormatValue): Self = this.set("formatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatValue: Self = this.set("formatValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setParameterVarargs(value: Parameter*): Self = this.set("parameter", js.Array(value :_*))
    
    @scala.inline
    def setParameter(value: js.Array[Parameter]): Self = this.set("parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
    
    @scala.inline
    def setParentFolderId(value: String): Self = this.set("parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFolderId: Self = this.set("parentFolderId", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setScheduleEndMs(value: String): Self = this.set("scheduleEndMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleEndMs: Self = this.set("scheduleEndMs", js.undefined)
    
    @scala.inline
    def setScheduleStartMs(value: String): Self = this.set("scheduleStartMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleStartMs: Self = this.set("scheduleStartMs", js.undefined)
    
    @scala.inline
    def setTagManagerUrl(value: String): Self = this.set("tagManagerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagManagerUrl: Self = this.set("tagManagerUrl", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVariableId(value: String): Self = this.set("variableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableId: Self = this.set("variableId", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceId: Self = this.set("workspaceId", js.undefined)
  }
}
