package typings.mfiles

import typings.mfiles.MFiles.MFImportContentFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImportContentJob extends StObject {
  
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
  implicit class IImportContentJobMutableBuilder[Self <: IImportContentJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivateAutomaticPermissionsForNewOrChangedDefinitions(value: Boolean): Self = StObject.set(x, "ActivateAutomaticPermissionsForNewOrChangedDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IImportContentJob): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableImportedExternalObjectTypeConnections(value: Boolean): Self = StObject.set(x, "DisableImportedExternalObjectTypeConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableImportedExternalUserGroups(value: Boolean): Self = StObject.set(x, "DisableImportedExternalUserGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableImportedVaultEventHandlers(value: Boolean): Self = StObject.set(x, "DisableImportedVaultEventHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: MFImportContentFlag): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreAutomaticPermissionsDefinedByObjects(value: Boolean): Self = StObject.set(x, "IgnoreAutomaticPermissionsDefinedByObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpersonation(value: IImpersonation): Self = StObject.set(x, "Impersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataStructureSelectors(value: IMetadataStructureSelectors): Self = StObject.set(x, "MetadataStructureSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: IAccessControlList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetExportTimestamps(value: Boolean): Self = StObject.set(x, "ResetExportTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocation(value: String): Self = StObject.set(x, "SourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultObjectTypePermissions(value: Boolean): Self = StObject.set(x, "UseDefaultObjectTypePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNamesAsAliases(value: Boolean): Self = StObject.set(x, "UseNamesAsAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePermissions(value: Boolean): Self = StObject.set(x, "UsePermissions", value.asInstanceOf[js.Any])
  }
}
