package typings.mfiles

import typings.mfiles.MFiles.MFExportContentFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExportContentJob extends js.Object {
  var ExportContent: Boolean
  var ExportStructureItems: Boolean
  var Flags: MFExportContentFlag
  var IgnoreChangesBefore: ITimestamp
  var Impersonation: IImpersonation
  var IncludePrivateUISettingsWithStructure: Boolean
  var IncludeValueListItemsWithStructure: Boolean
  var SearchConditions: ISearchConditions
  var StructureItems: IExportStructureItems
  var TargetLocation: String
  var UseIgnoreChangesBefore: Boolean
  var UseSearchConditions: Boolean
  def Clone(): IExportContentJob
  def SetExportAllStructureItems(IncludeValueListItems: Boolean): Unit
}

object IExportContentJob {
  @scala.inline
  def apply(
    Clone: () => IExportContentJob,
    ExportContent: Boolean,
    ExportStructureItems: Boolean,
    Flags: MFExportContentFlag,
    IgnoreChangesBefore: ITimestamp,
    Impersonation: IImpersonation,
    IncludePrivateUISettingsWithStructure: Boolean,
    IncludeValueListItemsWithStructure: Boolean,
    SearchConditions: ISearchConditions,
    SetExportAllStructureItems: Boolean => Unit,
    StructureItems: IExportStructureItems,
    TargetLocation: String,
    UseIgnoreChangesBefore: Boolean,
    UseSearchConditions: Boolean
  ): IExportContentJob = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ExportContent = ExportContent.asInstanceOf[js.Any], ExportStructureItems = ExportStructureItems.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], IgnoreChangesBefore = IgnoreChangesBefore.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], IncludePrivateUISettingsWithStructure = IncludePrivateUISettingsWithStructure.asInstanceOf[js.Any], IncludeValueListItemsWithStructure = IncludeValueListItemsWithStructure.asInstanceOf[js.Any], SearchConditions = SearchConditions.asInstanceOf[js.Any], SetExportAllStructureItems = js.Any.fromFunction1(SetExportAllStructureItems), StructureItems = StructureItems.asInstanceOf[js.Any], TargetLocation = TargetLocation.asInstanceOf[js.Any], UseIgnoreChangesBefore = UseIgnoreChangesBefore.asInstanceOf[js.Any], UseSearchConditions = UseSearchConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExportContentJob]
  }
}

