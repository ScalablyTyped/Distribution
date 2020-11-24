package typings.mfiles

import typings.mfiles.MFiles.MFImportContentFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImportContentJob extends js.Object {
  
  var ActivateAutomaticPermissionsForNewOrChangedDefinitions: Boolean = js.native
  
  def Clone(): IImportContentJob = js.native
  
  var DisableImportedExternalObjectTypeConnections: Boolean = js.native
  
  var DisableImportedExternalUserGroups: Boolean = js.native
  
  var DisableImportedVaultEventHandlers: Boolean = js.native
  
  var Flags: MFImportContentFlag = js.native
  
  var IgnoreAutomaticPermissionsDefinedByObjects: Boolean = js.native
  
  var Impersonation: IImpersonation = js.native
  
  var MetadataStructureSelectors: IMetadataStructureSelectors = js.native
  
  var Permissions: IAccessControlList = js.native
  
  var ResetExportTimestamps: Boolean = js.native
  
  var SourceLocation: String = js.native
  
  var UseDefaultObjectTypePermissions: Boolean = js.native
  
  var UseNamesAsAliases: Boolean = js.native
  
  var UsePermissions: Boolean = js.native
}
object IImportContentJob {
  
  @scala.inline
  def apply(
    ActivateAutomaticPermissionsForNewOrChangedDefinitions: Boolean,
    Clone: () => IImportContentJob,
    DisableImportedExternalObjectTypeConnections: Boolean,
    DisableImportedExternalUserGroups: Boolean,
    DisableImportedVaultEventHandlers: Boolean,
    Flags: MFImportContentFlag,
    IgnoreAutomaticPermissionsDefinedByObjects: Boolean,
    Impersonation: IImpersonation,
    MetadataStructureSelectors: IMetadataStructureSelectors,
    Permissions: IAccessControlList,
    ResetExportTimestamps: Boolean,
    SourceLocation: String,
    UseDefaultObjectTypePermissions: Boolean,
    UseNamesAsAliases: Boolean,
    UsePermissions: Boolean
  ): IImportContentJob = {
    val __obj = js.Dynamic.literal(ActivateAutomaticPermissionsForNewOrChangedDefinitions = ActivateAutomaticPermissionsForNewOrChangedDefinitions.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), DisableImportedExternalObjectTypeConnections = DisableImportedExternalObjectTypeConnections.asInstanceOf[js.Any], DisableImportedExternalUserGroups = DisableImportedExternalUserGroups.asInstanceOf[js.Any], DisableImportedVaultEventHandlers = DisableImportedVaultEventHandlers.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], IgnoreAutomaticPermissionsDefinedByObjects = IgnoreAutomaticPermissionsDefinedByObjects.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], MetadataStructureSelectors = MetadataStructureSelectors.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any], ResetExportTimestamps = ResetExportTimestamps.asInstanceOf[js.Any], SourceLocation = SourceLocation.asInstanceOf[js.Any], UseDefaultObjectTypePermissions = UseDefaultObjectTypePermissions.asInstanceOf[js.Any], UseNamesAsAliases = UseNamesAsAliases.asInstanceOf[js.Any], UsePermissions = UsePermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImportContentJob]
  }
  
  @scala.inline
  implicit class IImportContentJobOps[Self <: IImportContentJob] (val x: Self) extends AnyVal {
    
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
    def setActivateAutomaticPermissionsForNewOrChangedDefinitions(value: Boolean): Self = this.set("ActivateAutomaticPermissionsForNewOrChangedDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IImportContentJob): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableImportedExternalObjectTypeConnections(value: Boolean): Self = this.set("DisableImportedExternalObjectTypeConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableImportedExternalUserGroups(value: Boolean): Self = this.set("DisableImportedExternalUserGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableImportedVaultEventHandlers(value: Boolean): Self = this.set("DisableImportedVaultEventHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: MFImportContentFlag): Self = this.set("Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreAutomaticPermissionsDefinedByObjects(value: Boolean): Self = this.set("IgnoreAutomaticPermissionsDefinedByObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpersonation(value: IImpersonation): Self = this.set("Impersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataStructureSelectors(value: IMetadataStructureSelectors): Self = this.set("MetadataStructureSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: IAccessControlList): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetExportTimestamps(value: Boolean): Self = this.set("ResetExportTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocation(value: String): Self = this.set("SourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultObjectTypePermissions(value: Boolean): Self = this.set("UseDefaultObjectTypePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNamesAsAliases(value: Boolean): Self = this.set("UseNamesAsAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePermissions(value: Boolean): Self = this.set("UsePermissions", value.asInstanceOf[js.Any])
  }
}
