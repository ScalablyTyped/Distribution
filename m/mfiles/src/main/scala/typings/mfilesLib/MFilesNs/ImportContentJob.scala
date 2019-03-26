package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ImportContentJob")
@js.native
class ImportContentJob ()
  extends mfilesLib.IImportContentJob {
  /* CompleteClass */
  override var ActivateAutomaticPermissionsForNewOrChangedDefinitions: scala.Boolean = js.native
  /* CompleteClass */
  override var DisableImportedExternalObjectTypeConnections: scala.Boolean = js.native
  /* CompleteClass */
  override var DisableImportedExternalUserGroups: scala.Boolean = js.native
  /* CompleteClass */
  override var DisableImportedVaultEventHandlers: scala.Boolean = js.native
  /* CompleteClass */
  override var Flags: MFImportContentFlag = js.native
  /* CompleteClass */
  override var IgnoreAutomaticPermissionsDefinedByObjects: scala.Boolean = js.native
  /* CompleteClass */
  override var Impersonation: mfilesLib.IImpersonation = js.native
  /* CompleteClass */
  override var MetadataStructureSelectors: mfilesLib.IMetadataStructureSelectors = js.native
  /* CompleteClass */
  override var Permissions: mfilesLib.IAccessControlList = js.native
  /* CompleteClass */
  override var ResetExportTimestamps: scala.Boolean = js.native
  /* CompleteClass */
  override var SourceLocation: java.lang.String = js.native
  /* CompleteClass */
  override var UseDefaultObjectTypePermissions: scala.Boolean = js.native
  /* CompleteClass */
  override var UseNamesAsAliases: scala.Boolean = js.native
  /* CompleteClass */
  override var UsePermissions: scala.Boolean = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IImportContentJob = js.native
}

