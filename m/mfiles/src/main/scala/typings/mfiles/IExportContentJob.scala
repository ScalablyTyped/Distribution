package typings.mfiles

import typings.mfiles.MFiles.MFExportContentFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExportContentJob extends js.Object {
  var ExportContent: Boolean = js.native
  var ExportStructureItems: Boolean = js.native
  var Flags: MFExportContentFlag = js.native
  var IgnoreChangesBefore: ITimestamp = js.native
  var Impersonation: IImpersonation = js.native
  var IncludePrivateUISettingsWithStructure: Boolean = js.native
  var IncludeValueListItemsWithStructure: Boolean = js.native
  var SearchConditions: ISearchConditions = js.native
  var StructureItems: IExportStructureItems = js.native
  var TargetLocation: String = js.native
  var UseIgnoreChangesBefore: Boolean = js.native
  var UseSearchConditions: Boolean = js.native
  def Clone(): IExportContentJob = js.native
  def SetExportAllStructureItems(IncludeValueListItems: Boolean): Unit = js.native
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
  @scala.inline
  implicit class IExportContentJobOps[Self <: IExportContentJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClone(value: () => IExportContentJob): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setExportContent(value: Boolean): Self = this.set("ExportContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportStructureItems(value: Boolean): Self = this.set("ExportStructureItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: MFExportContentFlag): Self = this.set("Flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreChangesBefore(value: ITimestamp): Self = this.set("IgnoreChangesBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setImpersonation(value: IImpersonation): Self = this.set("Impersonation", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludePrivateUISettingsWithStructure(value: Boolean): Self = this.set("IncludePrivateUISettingsWithStructure", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeValueListItemsWithStructure(value: Boolean): Self = this.set("IncludeValueListItemsWithStructure", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchConditions(value: ISearchConditions): Self = this.set("SearchConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetExportAllStructureItems(value: Boolean => Unit): Self = this.set("SetExportAllStructureItems", js.Any.fromFunction1(value))
    @scala.inline
    def setStructureItems(value: IExportStructureItems): Self = this.set("StructureItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetLocation(value: String): Self = this.set("TargetLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseIgnoreChangesBefore(value: Boolean): Self = this.set("UseIgnoreChangesBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseSearchConditions(value: Boolean): Self = this.set("UseSearchConditions", value.asInstanceOf[js.Any])
  }
  
}

