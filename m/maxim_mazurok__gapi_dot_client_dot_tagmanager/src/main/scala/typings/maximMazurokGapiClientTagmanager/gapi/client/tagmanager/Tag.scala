package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tag extends js.Object {
  
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Blocking rule IDs. If any of the listed rules evaluate to true, the tag will not fire. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
    * tagmanager.accounts.containers.workspaces.tags.update
    */
  var blockingRuleId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Blocking trigger IDs. If any of the listed triggers evaluate to true, the tag will not fire. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
    * tagmanager.accounts.containers.workspaces.tags.update
    */
  var blockingTriggerId: js.UndefOr[js.Array[String]] = js.native
  
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.native
  
  /** The fingerprint of the GTM Tag as computed at storage time. This value is recomputed whenever the tag is modified. */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * Firing rule IDs. A tag will fire when any of the listed rules are true and all of its blockingRuleIds (if any specified) are false. @mutable
    * tagmanager.accounts.containers.workspaces.tags.create @mutable tagmanager.accounts.containers.workspaces.tags.update
    */
  var firingRuleId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Firing trigger IDs. A tag will fire when any of the listed triggers are true and all of its blockingTriggerIds (if any specified) are false. @mutable
    * tagmanager.accounts.containers.workspaces.tags.create @mutable tagmanager.accounts.containers.workspaces.tags.update
    */
  var firingTriggerId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If set to true, this tag will only fire in the live environment (e.g. not in preview or debug mode). @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
    * tagmanager.accounts.containers.workspaces.tags.update
    */
  var liveOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * A map of key-value pairs of tag metadata to be included in the event data for tag monitoring. Notes: - This parameter must be type MAP. - Each parameter in the map are type
    * TEMPLATE, however cannot contain variable references. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable tagmanager.accounts.containers.workspaces.tags.update
    */
  var monitoringMetadata: js.UndefOr[Parameter] = js.native
  
  /**
    * If non-empty, then the tag display name will be included in the monitoring metadata map using the key specified. @mutable tagmanager.accounts.containers.workspaces.tags.create
    * @mutable tagmanager.accounts.containers.workspaces.tags.update
    */
  var monitoringMetadataTagNameKey: js.UndefOr[String] = js.native
  
  /** Tag display name. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable tagmanager.accounts.containers.workspaces.tags.update */
  var name: js.UndefOr[String] = js.native
  
  /** User notes on how to apply this tag in the container. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable tagmanager.accounts.containers.workspaces.tags.update */
  var notes: js.UndefOr[String] = js.native
  
  /** The tag's parameters. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable tagmanager.accounts.containers.workspaces.tags.update */
  var parameter: js.UndefOr[js.Array[Parameter]] = js.native
  
  /** Parent folder id. */
  var parentFolderId: js.UndefOr[String] = js.native
  
  /** GTM Tag's API relative path. */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the tag is paused, which prevents the tag from firing. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
    * tagmanager.accounts.containers.workspaces.tags.update
    */
  var paused: js.UndefOr[Boolean] = js.native
  
  /**
    * User defined numeric priority of the tag. Tags are fired asynchronously in order of priority. Tags with higher numeric value fire first. A tag's priority can be a positive or
    * negative value. The default value is 0. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable tagmanager.accounts.containers.workspaces.tags.update
    */
  var priority: js.UndefOr[Parameter] = js.native
  
  /** The end timestamp in milliseconds to schedule a tag. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable tagmanager.accounts.containers.workspaces.tags.update */
  var scheduleEndMs: js.UndefOr[String] = js.native
  
  /** The start timestamp in milliseconds to schedule a tag. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable tagmanager.accounts.containers.workspaces.tags.update */
  var scheduleStartMs: js.UndefOr[String] = js.native
  
  /** The list of setup tags. Currently we only allow one. */
  var setupTag: js.UndefOr[js.Array[SetupTag]] = js.native
  
  /** Option to fire this tag. */
  var tagFiringOption: js.UndefOr[String] = js.native
  
  /** The Tag ID uniquely identifies the GTM Tag. */
  var tagId: js.UndefOr[String] = js.native
  
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.native
  
  /** The list of teardown tags. Currently we only allow one. */
  var teardownTag: js.UndefOr[js.Array[TeardownTag]] = js.native
  
  /** GTM Tag Type. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable tagmanager.accounts.containers.workspaces.tags.update */
  var `type`: js.UndefOr[String] = js.native
  
  /** GTM Workspace ID. */
  var workspaceId: js.UndefOr[String] = js.native
}
object Tag {
  
  @scala.inline
  def apply(): Tag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit class TagOps[Self <: Tag] (val x: Self) extends AnyVal {
    
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
    def setBlockingRuleIdVarargs(value: String*): Self = this.set("blockingRuleId", js.Array(value :_*))
    
    @scala.inline
    def setBlockingRuleId(value: js.Array[String]): Self = this.set("blockingRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockingRuleId: Self = this.set("blockingRuleId", js.undefined)
    
    @scala.inline
    def setBlockingTriggerIdVarargs(value: String*): Self = this.set("blockingTriggerId", js.Array(value :_*))
    
    @scala.inline
    def setBlockingTriggerId(value: js.Array[String]): Self = this.set("blockingTriggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockingTriggerId: Self = this.set("blockingTriggerId", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setFiringRuleIdVarargs(value: String*): Self = this.set("firingRuleId", js.Array(value :_*))
    
    @scala.inline
    def setFiringRuleId(value: js.Array[String]): Self = this.set("firingRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiringRuleId: Self = this.set("firingRuleId", js.undefined)
    
    @scala.inline
    def setFiringTriggerIdVarargs(value: String*): Self = this.set("firingTriggerId", js.Array(value :_*))
    
    @scala.inline
    def setFiringTriggerId(value: js.Array[String]): Self = this.set("firingTriggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiringTriggerId: Self = this.set("firingTriggerId", js.undefined)
    
    @scala.inline
    def setLiveOnly(value: Boolean): Self = this.set("liveOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveOnly: Self = this.set("liveOnly", js.undefined)
    
    @scala.inline
    def setMonitoringMetadata(value: Parameter): Self = this.set("monitoringMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringMetadata: Self = this.set("monitoringMetadata", js.undefined)
    
    @scala.inline
    def setMonitoringMetadataTagNameKey(value: String): Self = this.set("monitoringMetadataTagNameKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringMetadataTagNameKey: Self = this.set("monitoringMetadataTagNameKey", js.undefined)
    
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
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    
    @scala.inline
    def setPriority(value: Parameter): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setScheduleEndMs(value: String): Self = this.set("scheduleEndMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleEndMs: Self = this.set("scheduleEndMs", js.undefined)
    
    @scala.inline
    def setScheduleStartMs(value: String): Self = this.set("scheduleStartMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleStartMs: Self = this.set("scheduleStartMs", js.undefined)
    
    @scala.inline
    def setSetupTagVarargs(value: SetupTag*): Self = this.set("setupTag", js.Array(value :_*))
    
    @scala.inline
    def setSetupTag(value: js.Array[SetupTag]): Self = this.set("setupTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupTag: Self = this.set("setupTag", js.undefined)
    
    @scala.inline
    def setTagFiringOption(value: String): Self = this.set("tagFiringOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagFiringOption: Self = this.set("tagFiringOption", js.undefined)
    
    @scala.inline
    def setTagId(value: String): Self = this.set("tagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagId: Self = this.set("tagId", js.undefined)
    
    @scala.inline
    def setTagManagerUrl(value: String): Self = this.set("tagManagerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagManagerUrl: Self = this.set("tagManagerUrl", js.undefined)
    
    @scala.inline
    def setTeardownTagVarargs(value: TeardownTag*): Self = this.set("teardownTag", js.Array(value :_*))
    
    @scala.inline
    def setTeardownTag(value: js.Array[TeardownTag]): Self = this.set("teardownTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeardownTag: Self = this.set("teardownTag", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceId: Self = this.set("workspaceId", js.undefined)
  }
}
