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
    Clone: js.Function0[IImportContentJob],
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActivateAutomaticPermissionsForNewOrChangedDefinitions")(ActivateAutomaticPermissionsForNewOrChangedDefinitions)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("DisableImportedExternalObjectTypeConnections")(DisableImportedExternalObjectTypeConnections)
    __obj.updateDynamic("DisableImportedExternalUserGroups")(DisableImportedExternalUserGroups)
    __obj.updateDynamic("DisableImportedVaultEventHandlers")(DisableImportedVaultEventHandlers)
    __obj.updateDynamic("Flags")(Flags)
    __obj.updateDynamic("IgnoreAutomaticPermissionsDefinedByObjects")(IgnoreAutomaticPermissionsDefinedByObjects)
    __obj.updateDynamic("Impersonation")(Impersonation)
    __obj.updateDynamic("MetadataStructureSelectors")(MetadataStructureSelectors)
    __obj.updateDynamic("Permissions")(Permissions)
    __obj.updateDynamic("ResetExportTimestamps")(ResetExportTimestamps)
    __obj.updateDynamic("SourceLocation")(SourceLocation)
    __obj.updateDynamic("UseDefaultObjectTypePermissions")(UseDefaultObjectTypePermissions)
    __obj.updateDynamic("UseNamesAsAliases")(UseNamesAsAliases)
    __obj.updateDynamic("UsePermissions")(UsePermissions)
    __obj.asInstanceOf[IImportContentJob]
  }
}

