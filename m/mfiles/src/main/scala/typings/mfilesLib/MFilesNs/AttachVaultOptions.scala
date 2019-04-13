package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AttachVaultOptions")
@js.native
class AttachVaultOptions ()
  extends mfilesLib.IAttachVaultOptions {
  /* CompleteClass */
  override var DisableEventHandlers: scala.Boolean = js.native
  /* CompleteClass */
  override var DisableExportImportJobs: scala.Boolean = js.native
  /* CompleteClass */
  override var DisableExportedDataSets: scala.Boolean = js.native
  /* CompleteClass */
  override var DisableExternalObjectTypes: scala.Boolean = js.native
  /* CompleteClass */
  override var DisableExternalSources: scala.Boolean = js.native
  /* CompleteClass */
  override var DisableExternalUserGroups: scala.Boolean = js.native
  /* CompleteClass */
  override var Flags: MFAttachVaultOptionsFlag = js.native
  /* CompleteClass */
  override var UpdateAttachmentGUID: scala.Boolean = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IAttachVaultOptions = js.native
  /* CompleteClass */
  override def DisableAll(): scala.Unit = js.native
}

@JSGlobal("MFiles.AttachVaultOptions")
@js.native
object AttachVaultOptions
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IAttachVaultOptions]

