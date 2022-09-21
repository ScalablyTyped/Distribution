package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variable extends StObject {
  
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * For mobile containers only: A list of trigger IDs for disabling conditional variables; the variable is enabled if one of the enabling trigger is true while all the disabling trigger
    * are false. Treated as an unordered set. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable tagmanager.accounts.containers.workspaces.variables.update
    */
  var disablingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * For mobile containers only: A list of trigger IDs for enabling conditional variables; the variable is enabled if one of the enabling triggers is true while all the disabling
    * triggers are false. Treated as an unordered set. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable
    * tagmanager.accounts.containers.workspaces.variables.update
    */
  var enablingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The fingerprint of the GTM Variable as computed at storage time. This value is recomputed whenever the variable is modified. */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /** Option to convert a variable value to other value. */
  var formatValue: js.UndefOr[VariableFormatValue] = js.undefined
  
  /** Variable display name. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable tagmanager.accounts.containers.workspaces.variables.update */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * User notes on how to apply this variable in the container. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable
    * tagmanager.accounts.containers.workspaces.variables.update
    */
  var notes: js.UndefOr[String] = js.undefined
  
  /** The variable's parameters. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable tagmanager.accounts.containers.workspaces.variables.update */
  var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
  
  /** Parent folder id. */
  var parentFolderId: js.UndefOr[String] = js.undefined
  
  /** GTM Variable's API relative path. */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The end timestamp in milliseconds to schedule a variable. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable
    * tagmanager.accounts.containers.workspaces.variables.update
    */
  var scheduleEndMs: js.UndefOr[String] = js.undefined
  
  /**
    * The start timestamp in milliseconds to schedule a variable. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable
    * tagmanager.accounts.containers.workspaces.variables.update
    */
  var scheduleStartMs: js.UndefOr[String] = js.undefined
  
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  
  /** GTM Variable Type. @mutable tagmanager.accounts.containers.workspaces.variables.create @mutable tagmanager.accounts.containers.workspaces.variables.update */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The Variable ID uniquely identifies the GTM Variable. */
  var variableId: js.UndefOr[String] = js.undefined
  
  /** GTM Workspace ID. */
  var workspaceId: js.UndefOr[String] = js.undefined
}
object Variable {
  
  inline def apply(): Variable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variable]
  }
  
  extension [Self <: Variable](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setDisablingTriggerId(value: js.Array[String]): Self = StObject.set(x, "disablingTriggerId", value.asInstanceOf[js.Any])
    
    inline def setDisablingTriggerIdUndefined: Self = StObject.set(x, "disablingTriggerId", js.undefined)
    
    inline def setDisablingTriggerIdVarargs(value: String*): Self = StObject.set(x, "disablingTriggerId", js.Array(value*))
    
    inline def setEnablingTriggerId(value: js.Array[String]): Self = StObject.set(x, "enablingTriggerId", value.asInstanceOf[js.Any])
    
    inline def setEnablingTriggerIdUndefined: Self = StObject.set(x, "enablingTriggerId", js.undefined)
    
    inline def setEnablingTriggerIdVarargs(value: String*): Self = StObject.set(x, "enablingTriggerId", js.Array(value*))
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setFormatValue(value: VariableFormatValue): Self = StObject.set(x, "formatValue", value.asInstanceOf[js.Any])
    
    inline def setFormatValueUndefined: Self = StObject.set(x, "formatValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setParameter(value: js.Array[Parameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: Parameter*): Self = StObject.set(x, "parameter", js.Array(value*))
    
    inline def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    inline def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setScheduleEndMs(value: String): Self = StObject.set(x, "scheduleEndMs", value.asInstanceOf[js.Any])
    
    inline def setScheduleEndMsUndefined: Self = StObject.set(x, "scheduleEndMs", js.undefined)
    
    inline def setScheduleStartMs(value: String): Self = StObject.set(x, "scheduleStartMs", value.asInstanceOf[js.Any])
    
    inline def setScheduleStartMsUndefined: Self = StObject.set(x, "scheduleStartMs", js.undefined)
    
    inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVariableId(value: String): Self = StObject.set(x, "variableId", value.asInstanceOf[js.Any])
    
    inline def setVariableIdUndefined: Self = StObject.set(x, "variableId", js.undefined)
    
    inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
  }
}
