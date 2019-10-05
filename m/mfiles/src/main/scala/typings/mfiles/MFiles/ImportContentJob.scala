package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAccessControlList
import typings.mfiles.IImpersonation
import typings.mfiles.IImportContentJob
import typings.mfiles.IMetadataStructureSelectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ImportContentJob")
@js.native
class ImportContentJob () extends IImportContentJob {
  /* CompleteClass */
  override var ActivateAutomaticPermissionsForNewOrChangedDefinitions: Boolean = js.native
  /* CompleteClass */
  override var DisableImportedExternalObjectTypeConnections: Boolean = js.native
  /* CompleteClass */
  override var DisableImportedExternalUserGroups: Boolean = js.native
  /* CompleteClass */
  override var DisableImportedVaultEventHandlers: Boolean = js.native
  /* CompleteClass */
  override var Flags: MFImportContentFlag = js.native
  /* CompleteClass */
  override var IgnoreAutomaticPermissionsDefinedByObjects: Boolean = js.native
  /* CompleteClass */
  override var Impersonation: IImpersonation = js.native
  /* CompleteClass */
  override var MetadataStructureSelectors: IMetadataStructureSelectors = js.native
  /* CompleteClass */
  override var Permissions: IAccessControlList = js.native
  /* CompleteClass */
  override var ResetExportTimestamps: Boolean = js.native
  /* CompleteClass */
  override var SourceLocation: String = js.native
  /* CompleteClass */
  override var UseDefaultObjectTypePermissions: Boolean = js.native
  /* CompleteClass */
  override var UseNamesAsAliases: Boolean = js.native
  /* CompleteClass */
  override var UsePermissions: Boolean = js.native
  /* CompleteClass */
  override def Clone(): IImportContentJob = js.native
}

@JSGlobal("MFiles.ImportContentJob")
@js.native
object ImportContentJob extends Instantiable0[IImportContentJob]

