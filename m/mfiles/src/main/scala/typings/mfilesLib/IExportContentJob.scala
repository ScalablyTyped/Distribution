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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("ExportContent")(ExportContent)
    __obj.updateDynamic("ExportStructureItems")(ExportStructureItems)
    __obj.updateDynamic("Flags")(Flags)
    __obj.updateDynamic("IgnoreChangesBefore")(IgnoreChangesBefore)
    __obj.updateDynamic("Impersonation")(Impersonation)
    __obj.updateDynamic("IncludePrivateUISettingsWithStructure")(IncludePrivateUISettingsWithStructure)
    __obj.updateDynamic("IncludeValueListItemsWithStructure")(IncludeValueListItemsWithStructure)
    __obj.updateDynamic("SearchConditions")(SearchConditions)
    __obj.updateDynamic("SetExportAllStructureItems")(SetExportAllStructureItems)
    __obj.updateDynamic("StructureItems")(StructureItems)
    __obj.updateDynamic("TargetLocation")(TargetLocation)
    __obj.updateDynamic("UseIgnoreChangesBefore")(UseIgnoreChangesBefore)
    __obj.updateDynamic("UseSearchConditions")(UseSearchConditions)
    __obj.asInstanceOf[IExportContentJob]
  }
}

