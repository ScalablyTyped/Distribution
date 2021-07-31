package typings.mfiles

import typings.mfiles.MFiles.MFAttachVaultOptionsFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttachVaultOptions extends StObject {
  
  def Clone(): IAttachVaultOptions
  
  def DisableAll(): Unit
  
  var DisableEventHandlers: Boolean
  
  var DisableExportImportJobs: Boolean
  
  var DisableExportedDataSets: Boolean
  
  var DisableExternalObjectTypes: Boolean
  
  var DisableExternalSources: Boolean
  
  var DisableExternalUserGroups: Boolean
  
  var Flags: MFAttachVaultOptionsFlag
  
  var UpdateAttachmentGUID: Boolean
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
  implicit class IAttachVaultOptionsMutableBuilder[Self <: IAttachVaultOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IAttachVaultOptions): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableAll(value: () => Unit): Self = StObject.set(x, "DisableAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableEventHandlers(value: Boolean): Self = StObject.set(x, "DisableEventHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExportImportJobs(value: Boolean): Self = StObject.set(x, "DisableExportImportJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExportedDataSets(value: Boolean): Self = StObject.set(x, "DisableExportedDataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExternalObjectTypes(value: Boolean): Self = StObject.set(x, "DisableExternalObjectTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExternalSources(value: Boolean): Self = StObject.set(x, "DisableExternalSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExternalUserGroups(value: Boolean): Self = StObject.set(x, "DisableExternalUserGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: MFAttachVaultOptionsFlag): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAttachmentGUID(value: Boolean): Self = StObject.set(x, "UpdateAttachmentGUID", value.asInstanceOf[js.Any])
  }
}
