package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ExportContentJob")
@js.native
class ExportContentJob ()
  extends mfilesLib.IExportContentJob {
  /* CompleteClass */
  override var ExportContent: scala.Boolean = js.native
  /* CompleteClass */
  override var ExportStructureItems: scala.Boolean = js.native
  /* CompleteClass */
  override var Flags: MFExportContentFlag = js.native
  /* CompleteClass */
  override var IgnoreChangesBefore: mfilesLib.ITimestamp = js.native
  /* CompleteClass */
  override var Impersonation: mfilesLib.IImpersonation = js.native
  /* CompleteClass */
  override var IncludePrivateUISettingsWithStructure: scala.Boolean = js.native
  /* CompleteClass */
  override var IncludeValueListItemsWithStructure: scala.Boolean = js.native
  /* CompleteClass */
  override var SearchConditions: mfilesLib.ISearchConditions = js.native
  /* CompleteClass */
  override var StructureItems: mfilesLib.IExportStructureItems = js.native
  /* CompleteClass */
  override var TargetLocation: java.lang.String = js.native
  /* CompleteClass */
  override var UseIgnoreChangesBefore: scala.Boolean = js.native
  /* CompleteClass */
  override var UseSearchConditions: scala.Boolean = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IExportContentJob = js.native
  /* CompleteClass */
  override def SetExportAllStructureItems(IncludeValueListItems: scala.Boolean): scala.Unit = js.native
}

