package typings.mfiles

import typings.mfiles.MFilesNs.MFExportContentFlag
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ExportContent = ExportContent, ExportStructureItems = ExportStructureItems, Flags = Flags, IgnoreChangesBefore = IgnoreChangesBefore, Impersonation = Impersonation, IncludePrivateUISettingsWithStructure = IncludePrivateUISettingsWithStructure, IncludeValueListItemsWithStructure = IncludeValueListItemsWithStructure, SearchConditions = SearchConditions, SetExportAllStructureItems = js.Any.fromFunction1(SetExportAllStructureItems), StructureItems = StructureItems, TargetLocation = TargetLocation, UseIgnoreChangesBefore = UseIgnoreChangesBefore, UseSearchConditions = UseSearchConditions)
  
    __obj.asInstanceOf[IExportContentJob]
  }
}

