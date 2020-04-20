package typings.mfiles

import typings.mfiles.MFiles.MFImportContentFlag
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
    val __obj = js.Dynamic.literal(ActivateAutomaticPermissionsForNewOrChangedDefinitions = ActivateAutomaticPermissionsForNewOrChangedDefinitions.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), DisableImportedExternalObjectTypeConnections = DisableImportedExternalObjectTypeConnections.asInstanceOf[js.Any], DisableImportedExternalUserGroups = DisableImportedExternalUserGroups.asInstanceOf[js.Any], DisableImportedVaultEventHandlers = DisableImportedVaultEventHandlers.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], IgnoreAutomaticPermissionsDefinedByObjects = IgnoreAutomaticPermissionsDefinedByObjects.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], MetadataStructureSelectors = MetadataStructureSelectors.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any], ResetExportTimestamps = ResetExportTimestamps.asInstanceOf[js.Any], SourceLocation = SourceLocation.asInstanceOf[js.Any], UseDefaultObjectTypePermissions = UseDefaultObjectTypePermissions.asInstanceOf[js.Any], UseNamesAsAliases = UseNamesAsAliases.asInstanceOf[js.Any], UsePermissions = UsePermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImportContentJob]
  }
}

