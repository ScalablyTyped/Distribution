package typings.mfiles

import typings.mfiles.MFiles.MFExportContentFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExportContentJob extends StObject {
  
  def Clone(): IExportContentJob
  
  var ExportContent: Boolean
  
  var ExportStructureItems: Boolean
  
  var Flags: MFExportContentFlag
  
  var IgnoreChangesBefore: ITimestamp
  
  var Impersonation: IImpersonation
  
  var IncludePrivateUISettingsWithStructure: Boolean
  
  var IncludeValueListItemsWithStructure: Boolean
  
  var SearchConditions: ISearchConditions
  
  def SetExportAllStructureItems(IncludeValueListItems: Boolean): Unit
  
  var StructureItems: IExportStructureItems
  
  var TargetLocation: String
  
  var UseIgnoreChangesBefore: Boolean
  
  var UseSearchConditions: Boolean
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
  implicit class IExportContentJobMutableBuilder[Self <: IExportContentJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IExportContentJob): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExportContent(value: Boolean): Self = StObject.set(x, "ExportContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportStructureItems(value: Boolean): Self = StObject.set(x, "ExportStructureItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: MFExportContentFlag): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreChangesBefore(value: ITimestamp): Self = StObject.set(x, "IgnoreChangesBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpersonation(value: IImpersonation): Self = StObject.set(x, "Impersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePrivateUISettingsWithStructure(value: Boolean): Self = StObject.set(x, "IncludePrivateUISettingsWithStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeValueListItemsWithStructure(value: Boolean): Self = StObject.set(x, "IncludeValueListItemsWithStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchConditions(value: ISearchConditions): Self = StObject.set(x, "SearchConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetExportAllStructureItems(value: Boolean => Unit): Self = StObject.set(x, "SetExportAllStructureItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStructureItems(value: IExportStructureItems): Self = StObject.set(x, "StructureItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLocation(value: String): Self = StObject.set(x, "TargetLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseIgnoreChangesBefore(value: Boolean): Self = StObject.set(x, "UseIgnoreChangesBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSearchConditions(value: Boolean): Self = StObject.set(x, "UseSearchConditions", value.asInstanceOf[js.Any])
  }
}
