package typings.mfiles

import typings.mfiles.MFilesNs.MFImportContentFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImportContentJob extends js.Object {
  var ActivateAutomaticPermissionsForNewOrChangedDefinitions: Boolean
  var DisableImportedExternalObjectTypeConnections: Boolean
  var DisableImportedExternalUserGroups: Boolean
  var DisableImportedVaultEventHandlers: Boolean
  var Flags: MFImportContentFlag
  var IgnoreAutomaticPermissionsDefinedByObjects: Boolean
  var Impersonation: IImpersonation
  var MetadataStructureSelectors: IMetadataStructureSelectors
  var Permissions: IAccessControlList
  var ResetExportTimestamps: Boolean
  var SourceLocation: String
  var UseDefaultObjectTypePermissions: Boolean
  var UseNamesAsAliases: Boolean
  var UsePermissions: Boolean
  def Clone(): IImportContentJob
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
    val __obj = js.Dynamic.literal(ActivateAutomaticPermissionsForNewOrChangedDefinitions = ActivateAutomaticPermissionsForNewOrChangedDefinitions, Clone = js.Any.fromFunction0(Clone), DisableImportedExternalObjectTypeConnections = DisableImportedExternalObjectTypeConnections, DisableImportedExternalUserGroups = DisableImportedExternalUserGroups, DisableImportedVaultEventHandlers = DisableImportedVaultEventHandlers, Flags = Flags, IgnoreAutomaticPermissionsDefinedByObjects = IgnoreAutomaticPermissionsDefinedByObjects, Impersonation = Impersonation, MetadataStructureSelectors = MetadataStructureSelectors, Permissions = Permissions, ResetExportTimestamps = ResetExportTimestamps, SourceLocation = SourceLocation, UseDefaultObjectTypePermissions = UseDefaultObjectTypePermissions, UseNamesAsAliases = UseNamesAsAliases, UsePermissions = UsePermissions)
  
    __obj.asInstanceOf[IImportContentJob]
  }
}

