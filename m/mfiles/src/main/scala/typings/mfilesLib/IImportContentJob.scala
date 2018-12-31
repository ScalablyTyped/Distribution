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

