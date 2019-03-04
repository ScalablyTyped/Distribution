package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExportContentJob extends js.Object {
  var ExportContent: scala.Boolean
  var ExportStructureItems: scala.Boolean
  var Flags: mfilesLib.MFilesNs.MFExportContentFlag
  var IgnoreChangesBefore: ITimestamp
  var Impersonation: IImpersonation
  var IncludePrivateUISettingsWithStructure: scala.Boolean
  var IncludeValueListItemsWithStructure: scala.Boolean
  var SearchConditions: ISearchConditions
  var StructureItems: IExportStructureItems
  var TargetLocation: java.lang.String
  var UseIgnoreChangesBefore: scala.Boolean
  var UseSearchConditions: scala.Boolean
  def Clone(): IExportContentJob
  def SetExportAllStructureItems(IncludeValueListItems: scala.Boolean): scala.Unit
}

object IExportContentJob {
  @scala.inline
  def apply(
    Clone: js.Function0[IExportContentJob],
    ExportContent: scala.Boolean,
    ExportStructureItems: scala.Boolean,
    Flags: mfilesLib.MFilesNs.MFExportContentFlag,
    IgnoreChangesBefore: ITimestamp,
    Impersonation: IImpersonation,
    IncludePrivateUISettingsWithStructure: scala.Boolean,
    IncludeValueListItemsWithStructure: scala.Boolean,
    SearchConditions: ISearchConditions,
    SetExportAllStructureItems: js.Function1[scala.Boolean, scala.Unit],
    StructureItems: IExportStructureItems,
    TargetLocation: java.lang.String,
    UseIgnoreChangesBefore: scala.Boolean,
    UseSearchConditions: scala.Boolean
  ): IExportContentJob = {
    val __obj = js.Dynamic.literal(Clone = Clone, ExportContent = ExportContent, ExportStructureItems = ExportStructureItems, Flags = Flags, IgnoreChangesBefore = IgnoreChangesBefore, Impersonation = Impersonation, IncludePrivateUISettingsWithStructure = IncludePrivateUISettingsWithStructure, IncludeValueListItemsWithStructure = IncludeValueListItemsWithStructure, SearchConditions = SearchConditions, SetExportAllStructureItems = SetExportAllStructureItems, StructureItems = StructureItems, TargetLocation = TargetLocation, UseIgnoreChangesBefore = UseIgnoreChangesBefore, UseSearchConditions = UseSearchConditions)
  
    __obj.asInstanceOf[IExportContentJob]
  }
}

