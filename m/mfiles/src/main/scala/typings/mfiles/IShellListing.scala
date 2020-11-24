package typings.mfiles

import typings.mfiles.MFiles.MFFolderDefType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShellListing extends js.Object {
  
  def ActivateListing(): Unit = js.native
  
  def ActivateSelected(): Unit = js.native
  
  var AutoFitAllColumns: Boolean = js.native
  
  var AutoFitFirstColumn: Boolean = js.native
  
  var ColumnHeadersVisible: Boolean = js.native
  
  val CurrentPath: String = js.native
  
  val CurrentSelection: IShellItems = js.native
  
  val Events: IShellListingEvents = js.native
  
  var GroupObjectsByObjectType: Boolean = js.native
  
  var GroupViewsAndFolders: Boolean = js.native
  
  val IsActive: Boolean = js.native
  
  val Items: IShellItems = js.native
  
  def RefreshListing(smartUpdate: Boolean, refreshFromServer: Boolean, forceFullRefreshFromServer: Boolean): Unit = js.native
  
  def RefreshListingAsync(): Unit = js.native
  
  def RefreshObject(objID: IObjID, refreshFromServer: Boolean, updateRelatedObjects: Boolean): Unit = js.native
  
  def RefreshSelectedObjects(refreshFromServer: Boolean, updateRelatedObjects: Boolean): Unit = js.native
  
  def SelectFolder(folderDef: IFolderDef): Unit = js.native
  
  def SelectNextFolder(folderDefType: MFFolderDefType): Boolean = js.native
  
  def SelectNextObject(): Boolean = js.native
  
  def SelectNextObjectFile(allowMoveToNextObject: Boolean): Boolean = js.native
  
  def SelectObjectFile(objVer: IObjVer, fileVer: IFileVer): Unit = js.native
  
  def SelectObjectOrObjectFileVersion(objOrFileVer: IObjOrFileVer): Unit = js.native
  
  def SelectObjectVersion(objVer: IObjVer): Unit = js.native
  
  def SelectPrevFolder(folderDefType: MFFolderDefType): Boolean = js.native
  
  def SelectPrevObject(): Boolean = js.native
  
  def SelectPrevObjectFile(allowMoveToPrevObject: Boolean): Boolean = js.native
  
  def SetFolderSelectionStates(folderDefs: IFolderDefs, select: Boolean): Unit = js.native
  
  def SetObjectOrObjectFileVersionSelectionStates(objOrFileVers: IObjOrFileVers, select: Boolean): Unit = js.native
  
  def SetObjectVersionSelectionStates(objVers: IObjVers, select: Boolean): Unit = js.native
  
  def SetTheme(theme: ITheme): Unit = js.native
  
  def SetVirtualSelection(objOrFileVers: IObjOrFileVers): Unit = js.native
  
  val SumOfResultCounts: Double = js.native
  
  def UnselectAll(): Unit = js.native
}
object IShellListing {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IShellListingOps[Self <: IShellListing] (val x: Self) extends AnyVal {
    
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
    def setActivateListing(value: () => Unit): Self = this.set("ActivateListing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setActivateSelected(value: () => Unit): Self = this.set("ActivateSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAutoFitAllColumns(value: Boolean): Self = this.set("AutoFitAllColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFitFirstColumn(value: Boolean): Self = this.set("AutoFitFirstColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHeadersVisible(value: Boolean): Self = this.set("ColumnHeadersVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPath(value: String): Self = this.set("CurrentPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSelection(value: IShellItems): Self = this.set("CurrentSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: IShellListingEvents): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupObjectsByObjectType(value: Boolean): Self = this.set("GroupObjectsByObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupViewsAndFolders(value: Boolean): Self = this.set("GroupViewsAndFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("IsActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: IShellItems): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshListing(value: (Boolean, Boolean, Boolean) => Unit): Self = this.set("RefreshListing", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRefreshListingAsync(value: () => Unit): Self = this.set("RefreshListingAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefreshObject(value: (IObjID, Boolean, Boolean) => Unit): Self = this.set("RefreshObject", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRefreshSelectedObjects(value: (Boolean, Boolean) => Unit): Self = this.set("RefreshSelectedObjects", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectFolder(value: IFolderDef => Unit): Self = this.set("SelectFolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectNextFolder(value: MFFolderDefType => Boolean): Self = this.set("SelectNextFolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectNextObject(value: () => Boolean): Self = this.set("SelectNextObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectNextObjectFile(value: Boolean => Boolean): Self = this.set("SelectNextObjectFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectObjectFile(value: (IObjVer, IFileVer) => Unit): Self = this.set("SelectObjectFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectObjectOrObjectFileVersion(value: IObjOrFileVer => Unit): Self = this.set("SelectObjectOrObjectFileVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectObjectVersion(value: IObjVer => Unit): Self = this.set("SelectObjectVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectPrevFolder(value: MFFolderDefType => Boolean): Self = this.set("SelectPrevFolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectPrevObject(value: () => Boolean): Self = this.set("SelectPrevObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectPrevObjectFile(value: Boolean => Boolean): Self = this.set("SelectPrevObjectFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFolderSelectionStates(value: (IFolderDefs, Boolean) => Unit): Self = this.set("SetFolderSelectionStates", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetObjectOrObjectFileVersionSelectionStates(value: (IObjOrFileVers, Boolean) => Unit): Self = this.set("SetObjectOrObjectFileVersionSelectionStates", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetObjectVersionSelectionStates(value: (IObjVers, Boolean) => Unit): Self = this.set("SetObjectVersionSelectionStates", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetTheme(value: ITheme => Unit): Self = this.set("SetTheme", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVirtualSelection(value: IObjOrFileVers => Unit): Self = this.set("SetVirtualSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSumOfResultCounts(value: Double): Self = this.set("SumOfResultCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectAll(value: () => Unit): Self = this.set("UnselectAll", js.Any.fromFunction0(value))
  }
}
