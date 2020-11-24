package typings.mfiles

import typings.mfiles.MFiles.MFAttachVaultOptionsFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAttachVaultOptions extends js.Object {
  
  def Clone(): IAttachVaultOptions = js.native
  
  def DisableAll(): Unit = js.native
  
  var DisableEventHandlers: Boolean = js.native
  
  var DisableExportImportJobs: Boolean = js.native
  
  var DisableExportedDataSets: Boolean = js.native
  
  var DisableExternalObjectTypes: Boolean = js.native
  
  var DisableExternalSources: Boolean = js.native
  
  var DisableExternalUserGroups: Boolean = js.native
  
  var Flags: MFAttachVaultOptionsFlag = js.native
  
  var UpdateAttachmentGUID: Boolean = js.native
}
object IAttachVaultOptions {
  
  @scala.inline
  def apply(
    Clone: () => IAttachVaultOptions,
    DisableAll: () => Unit,
    DisableEventHandlers: Boolean,
    DisableExportImportJobs: Boolean,
    DisableExportedDataSets: Boolean,
    DisableExternalObjectTypes: Boolean,
    DisableExternalSources: Boolean,
    DisableExternalUserGroups: Boolean,
    Flags: MFAttachVaultOptionsFlag,
    UpdateAttachmentGUID: Boolean
  ): IAttachVaultOptions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DisableAll = js.Any.fromFunction0(DisableAll), DisableEventHandlers = DisableEventHandlers.asInstanceOf[js.Any], DisableExportImportJobs = DisableExportImportJobs.asInstanceOf[js.Any], DisableExportedDataSets = DisableExportedDataSets.asInstanceOf[js.Any], DisableExternalObjectTypes = DisableExternalObjectTypes.asInstanceOf[js.Any], DisableExternalSources = DisableExternalSources.asInstanceOf[js.Any], DisableExternalUserGroups = DisableExternalUserGroups.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], UpdateAttachmentGUID = UpdateAttachmentGUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttachVaultOptions]
  }
  
  @scala.inline
  implicit class IAttachVaultOptionsOps[Self <: IAttachVaultOptions] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IAttachVaultOptions): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableAll(value: () => Unit): Self = this.set("DisableAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableEventHandlers(value: Boolean): Self = this.set("DisableEventHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExportImportJobs(value: Boolean): Self = this.set("DisableExportImportJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExportedDataSets(value: Boolean): Self = this.set("DisableExportedDataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExternalObjectTypes(value: Boolean): Self = this.set("DisableExternalObjectTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExternalSources(value: Boolean): Self = this.set("DisableExternalSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExternalUserGroups(value: Boolean): Self = this.set("DisableExternalUserGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: MFAttachVaultOptionsFlag): Self = this.set("Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAttachmentGUID(value: Boolean): Self = this.set("UpdateAttachmentGUID", value.asInstanceOf[js.Any])
  }
}
