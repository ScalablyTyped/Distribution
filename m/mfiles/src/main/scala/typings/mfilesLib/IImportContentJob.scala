package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImportContentJob extends js.Object {
  var ActivateAutomaticPermissionsForNewOrChangedDefinitions: scala.Boolean
  var DisableImportedExternalObjectTypeConnections: scala.Boolean
  var DisableImportedExternalUserGroups: scala.Boolean
  var DisableImportedVaultEventHandlers: scala.Boolean
  var Flags: mfilesLib.MFilesNs.MFImportContentFlag
  var IgnoreAutomaticPermissionsDefinedByObjects: scala.Boolean
  var Impersonation: IImpersonation
  var MetadataStructureSelectors: IMetadataStructureSelectors
  var Permissions: IAccessControlList
  var ResetExportTimestamps: scala.Boolean
  var SourceLocation: java.lang.String
  var UseDefaultObjectTypePermissions: scala.Boolean
  var UseNamesAsAliases: scala.Boolean
  var UsePermissions: scala.Boolean
  def Clone(): IImportContentJob
}

object IImportContentJob {
  @scala.inline
  def apply(
    ActivateAutomaticPermissionsForNewOrChangedDefinitions: scala.Boolean,
    Clone: () => IImportContentJob,
    DisableImportedExternalObjectTypeConnections: scala.Boolean,
    DisableImportedExternalUserGroups: scala.Boolean,
    DisableImportedVaultEventHandlers: scala.Boolean,
    Flags: mfilesLib.MFilesNs.MFImportContentFlag,
    IgnoreAutomaticPermissionsDefinedByObjects: scala.Boolean,
    Impersonation: IImpersonation,
    MetadataStructureSelectors: IMetadataStructureSelectors,
    Permissions: IAccessControlList,
    ResetExportTimestamps: scala.Boolean,
    SourceLocation: java.lang.String,
    UseDefaultObjectTypePermissions: scala.Boolean,
    UseNamesAsAliases: scala.Boolean,
    UsePermissions: scala.Boolean
  ): IImportContentJob = {
    val __obj = js.Dynamic.literal(ActivateAutomaticPermissionsForNewOrChangedDefinitions = ActivateAutomaticPermissionsForNewOrChangedDefinitions, Clone = js.Any.fromFunction0(Clone), DisableImportedExternalObjectTypeConnections = DisableImportedExternalObjectTypeConnections, DisableImportedExternalUserGroups = DisableImportedExternalUserGroups, DisableImportedVaultEventHandlers = DisableImportedVaultEventHandlers, Flags = Flags, IgnoreAutomaticPermissionsDefinedByObjects = IgnoreAutomaticPermissionsDefinedByObjects, Impersonation = Impersonation, MetadataStructureSelectors = MetadataStructureSelectors, Permissions = Permissions, ResetExportTimestamps = ResetExportTimestamps, SourceLocation = SourceLocation, UseDefaultObjectTypePermissions = UseDefaultObjectTypePermissions, UseNamesAsAliases = UseNamesAsAliases, UsePermissions = UsePermissions)
  
    __obj.asInstanceOf[IImportContentJob]
  }
}

