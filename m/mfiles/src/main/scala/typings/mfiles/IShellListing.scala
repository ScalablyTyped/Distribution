package typings.mfiles

import typings.mfiles.MFiles.MFFolderDefType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellListing extends StObject {
  
  def ActivateListing(): Unit
  
  def ActivateSelected(): Unit
  
  var AutoFitAllColumns: Boolean
  
  var AutoFitFirstColumn: Boolean
  
  var ColumnHeadersVisible: Boolean
  
  val CurrentPath: String
  
  val CurrentSelection: IShellItems
  
  val Events: IShellListingEvents
  
  var GroupObjectsByObjectType: Boolean
  
  var GroupViewsAndFolders: Boolean
  
  val IsActive: Boolean
  
  val Items: IShellItems
  
  def RefreshListing(smartUpdate: Boolean, refreshFromServer: Boolean, forceFullRefreshFromServer: Boolean): Unit
  
  def RefreshListingAsync(): Unit
  
  def RefreshObject(objID: IObjID, refreshFromServer: Boolean, updateRelatedObjects: Boolean): Unit
  
  def RefreshSelectedObjects(refreshFromServer: Boolean, updateRelatedObjects: Boolean): Unit
  
  def SelectFolder(folderDef: IFolderDef): Unit
  
  def SelectNextFolder(folderDefType: MFFolderDefType): Boolean
  
  def SelectNextObject(): Boolean
  
  def SelectNextObjectFile(allowMoveToNextObject: Boolean): Boolean
  
  def SelectObjectFile(objVer: IObjVer, fileVer: IFileVer): Unit
  
  def SelectObjectOrObjectFileVersion(objOrFileVer: IObjOrFileVer): Unit
  
  def SelectObjectVersion(objVer: IObjVer): Unit
  
  def SelectPrevFolder(folderDefType: MFFolderDefType): Boolean
  
  def SelectPrevObject(): Boolean
  
  def SelectPrevObjectFile(allowMoveToPrevObject: Boolean): Boolean
  
  def SetFolderSelectionStates(folderDefs: IFolderDefs, select: Boolean): Unit
  
  def SetObjectOrObjectFileVersionSelectionStates(objOrFileVers: IObjOrFileVers, select: Boolean): Unit
  
  def SetObjectVersionSelectionStates(objVers: IObjVers, select: Boolean): Unit
  
  def SetTheme(theme: ITheme): Unit
  
  def SetVirtualSelection(objOrFileVers: IObjOrFileVers): Unit
  
  val SumOfResultCounts: Double
  
  def UnselectAll(): Unit
}
object IShellListing {
  
  inline def apply(
    ActivateListing: () => Unit,
    ActivateSelected: () => Unit,
    AutoFitAllColumns: Boolean,
    AutoFitFirstColumn: Boolean,
    ColumnHeadersVisible: Boolean,
    CurrentPath: String,
    CurrentSelection: IShellItems,
    Events: IShellListingEvents,
    GroupObjectsByObjectType: Boolean,
    GroupViewsAndFolders: Boolean,
    IsActive: Boolean,
    Items: IShellItems,
    RefreshListing: (Boolean, Boolean, Boolean) => Unit,
    RefreshListingAsync: () => Unit,
    RefreshObject: (IObjID, Boolean, Boolean) => Unit,
    RefreshSelectedObjects: (Boolean, Boolean) => Unit,
    SelectFolder: IFolderDef => Unit,
    SelectNextFolder: MFFolderDefType => Boolean,
    SelectNextObject: () => Boolean,
    SelectNextObjectFile: Boolean => Boolean,
    SelectObjectFile: (IObjVer, IFileVer) => Unit,
    SelectObjectOrObjectFileVersion: IObjOrFileVer => Unit,
    SelectObjectVersion: IObjVer => Unit,
    SelectPrevFolder: MFFolderDefType => Boolean,
    SelectPrevObject: () => Boolean,
    SelectPrevObjectFile: Boolean => Boolean,
    SetFolderSelectionStates: (IFolderDefs, Boolean) => Unit,
    SetObjectOrObjectFileVersionSelectionStates: (IObjOrFileVers, Boolean) => Unit,
    SetObjectVersionSelectionStates: (IObjVers, Boolean) => Unit,
    SetTheme: ITheme => Unit,
    SetVirtualSelection: IObjOrFileVers => Unit,
    SumOfResultCounts: Double,
    UnselectAll: () => Unit
  ): IShellListing = {
    val __obj = js.Dynamic.literal(ActivateListing = js.Any.fromFunction0(ActivateListing), ActivateSelected = js.Any.fromFunction0(ActivateSelected), AutoFitAllColumns = AutoFitAllColumns.asInstanceOf[js.Any], AutoFitFirstColumn = AutoFitFirstColumn.asInstanceOf[js.Any], ColumnHeadersVisible = ColumnHeadersVisible.asInstanceOf[js.Any], CurrentPath = CurrentPath.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], GroupObjectsByObjectType = GroupObjectsByObjectType.asInstanceOf[js.Any], GroupViewsAndFolders = GroupViewsAndFolders.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], RefreshListing = js.Any.fromFunction3(RefreshListing), RefreshListingAsync = js.Any.fromFunction0(RefreshListingAsync), RefreshObject = js.Any.fromFunction3(RefreshObject), RefreshSelectedObjects = js.Any.fromFunction2(RefreshSelectedObjects), SelectFolder = js.Any.fromFunction1(SelectFolder), SelectNextFolder = js.Any.fromFunction1(SelectNextFolder), SelectNextObject = js.Any.fromFunction0(SelectNextObject), SelectNextObjectFile = js.Any.fromFunction1(SelectNextObjectFile), SelectObjectFile = js.Any.fromFunction2(SelectObjectFile), SelectObjectOrObjectFileVersion = js.Any.fromFunction1(SelectObjectOrObjectFileVersion), SelectObjectVersion = js.Any.fromFunction1(SelectObjectVersion), SelectPrevFolder = js.Any.fromFunction1(SelectPrevFolder), SelectPrevObject = js.Any.fromFunction0(SelectPrevObject), SelectPrevObjectFile = js.Any.fromFunction1(SelectPrevObjectFile), SetFolderSelectionStates = js.Any.fromFunction2(SetFolderSelectionStates), SetObjectOrObjectFileVersionSelectionStates = js.Any.fromFunction2(SetObjectOrObjectFileVersionSelectionStates), SetObjectVersionSelectionStates = js.Any.fromFunction2(SetObjectVersionSelectionStates), SetTheme = js.Any.fromFunction1(SetTheme), SetVirtualSelection = js.Any.fromFunction1(SetVirtualSelection), SumOfResultCounts = SumOfResultCounts.asInstanceOf[js.Any], UnselectAll = js.Any.fromFunction0(UnselectAll))
    __obj.asInstanceOf[IShellListing]
  }
  
  extension [Self <: IShellListing](x: Self) {
    
    inline def setActivateListing(value: () => Unit): Self = StObject.set(x, "ActivateListing", js.Any.fromFunction0(value))
    
    inline def setActivateSelected(value: () => Unit): Self = StObject.set(x, "ActivateSelected", js.Any.fromFunction0(value))
    
    inline def setAutoFitAllColumns(value: Boolean): Self = StObject.set(x, "AutoFitAllColumns", value.asInstanceOf[js.Any])
    
    inline def setAutoFitFirstColumn(value: Boolean): Self = StObject.set(x, "AutoFitFirstColumn", value.asInstanceOf[js.Any])
    
    inline def setColumnHeadersVisible(value: Boolean): Self = StObject.set(x, "ColumnHeadersVisible", value.asInstanceOf[js.Any])
    
    inline def setCurrentPath(value: String): Self = StObject.set(x, "CurrentPath", value.asInstanceOf[js.Any])
    
    inline def setCurrentSelection(value: IShellItems): Self = StObject.set(x, "CurrentSelection", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: IShellListingEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setGroupObjectsByObjectType(value: Boolean): Self = StObject.set(x, "GroupObjectsByObjectType", value.asInstanceOf[js.Any])
    
    inline def setGroupViewsAndFolders(value: Boolean): Self = StObject.set(x, "GroupViewsAndFolders", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "IsActive", value.asInstanceOf[js.Any])
    
    inline def setItems(value: IShellItems): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setRefreshListing(value: (Boolean, Boolean, Boolean) => Unit): Self = StObject.set(x, "RefreshListing", js.Any.fromFunction3(value))
    
    inline def setRefreshListingAsync(value: () => Unit): Self = StObject.set(x, "RefreshListingAsync", js.Any.fromFunction0(value))
    
    inline def setRefreshObject(value: (IObjID, Boolean, Boolean) => Unit): Self = StObject.set(x, "RefreshObject", js.Any.fromFunction3(value))
    
    inline def setRefreshSelectedObjects(value: (Boolean, Boolean) => Unit): Self = StObject.set(x, "RefreshSelectedObjects", js.Any.fromFunction2(value))
    
    inline def setSelectFolder(value: IFolderDef => Unit): Self = StObject.set(x, "SelectFolder", js.Any.fromFunction1(value))
    
    inline def setSelectNextFolder(value: MFFolderDefType => Boolean): Self = StObject.set(x, "SelectNextFolder", js.Any.fromFunction1(value))
    
    inline def setSelectNextObject(value: () => Boolean): Self = StObject.set(x, "SelectNextObject", js.Any.fromFunction0(value))
    
    inline def setSelectNextObjectFile(value: Boolean => Boolean): Self = StObject.set(x, "SelectNextObjectFile", js.Any.fromFunction1(value))
    
    inline def setSelectObjectFile(value: (IObjVer, IFileVer) => Unit): Self = StObject.set(x, "SelectObjectFile", js.Any.fromFunction2(value))
    
    inline def setSelectObjectOrObjectFileVersion(value: IObjOrFileVer => Unit): Self = StObject.set(x, "SelectObjectOrObjectFileVersion", js.Any.fromFunction1(value))
    
    inline def setSelectObjectVersion(value: IObjVer => Unit): Self = StObject.set(x, "SelectObjectVersion", js.Any.fromFunction1(value))
    
    inline def setSelectPrevFolder(value: MFFolderDefType => Boolean): Self = StObject.set(x, "SelectPrevFolder", js.Any.fromFunction1(value))
    
    inline def setSelectPrevObject(value: () => Boolean): Self = StObject.set(x, "SelectPrevObject", js.Any.fromFunction0(value))
    
    inline def setSelectPrevObjectFile(value: Boolean => Boolean): Self = StObject.set(x, "SelectPrevObjectFile", js.Any.fromFunction1(value))
    
    inline def setSetFolderSelectionStates(value: (IFolderDefs, Boolean) => Unit): Self = StObject.set(x, "SetFolderSelectionStates", js.Any.fromFunction2(value))
    
    inline def setSetObjectOrObjectFileVersionSelectionStates(value: (IObjOrFileVers, Boolean) => Unit): Self = StObject.set(x, "SetObjectOrObjectFileVersionSelectionStates", js.Any.fromFunction2(value))
    
    inline def setSetObjectVersionSelectionStates(value: (IObjVers, Boolean) => Unit): Self = StObject.set(x, "SetObjectVersionSelectionStates", js.Any.fromFunction2(value))
    
    inline def setSetTheme(value: ITheme => Unit): Self = StObject.set(x, "SetTheme", js.Any.fromFunction1(value))
    
    inline def setSetVirtualSelection(value: IObjOrFileVers => Unit): Self = StObject.set(x, "SetVirtualSelection", js.Any.fromFunction1(value))
    
    inline def setSumOfResultCounts(value: Double): Self = StObject.set(x, "SumOfResultCounts", value.asInstanceOf[js.Any])
    
    inline def setUnselectAll(value: () => Unit): Self = StObject.set(x, "UnselectAll", js.Any.fromFunction0(value))
  }
}
