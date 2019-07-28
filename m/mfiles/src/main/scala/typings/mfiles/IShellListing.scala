package typings.mfiles

import typings.mfiles.MFilesNs.MFFolderDefType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellListing extends js.Object {
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
  val SumOfResultCounts: Double
  def ActivateListing(): Unit
  def ActivateSelected(): Unit
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
  def UnselectAll(): Unit
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
    val __obj = js.Dynamic.literal(ActivateListing = js.Any.fromFunction0(ActivateListing), ActivateSelected = js.Any.fromFunction0(ActivateSelected), AutoFitAllColumns = AutoFitAllColumns, AutoFitFirstColumn = AutoFitFirstColumn, ColumnHeadersVisible = ColumnHeadersVisible, CurrentPath = CurrentPath, CurrentSelection = CurrentSelection, Events = Events, GroupObjectsByObjectType = GroupObjectsByObjectType, GroupViewsAndFolders = GroupViewsAndFolders, IsActive = IsActive, Items = Items, RefreshListing = js.Any.fromFunction3(RefreshListing), RefreshListingAsync = js.Any.fromFunction0(RefreshListingAsync), RefreshObject = js.Any.fromFunction3(RefreshObject), RefreshSelectedObjects = js.Any.fromFunction2(RefreshSelectedObjects), SelectFolder = js.Any.fromFunction1(SelectFolder), SelectNextFolder = js.Any.fromFunction1(SelectNextFolder), SelectNextObject = js.Any.fromFunction0(SelectNextObject), SelectNextObjectFile = js.Any.fromFunction1(SelectNextObjectFile), SelectObjectFile = js.Any.fromFunction2(SelectObjectFile), SelectObjectOrObjectFileVersion = js.Any.fromFunction1(SelectObjectOrObjectFileVersion), SelectObjectVersion = js.Any.fromFunction1(SelectObjectVersion), SelectPrevFolder = js.Any.fromFunction1(SelectPrevFolder), SelectPrevObject = js.Any.fromFunction0(SelectPrevObject), SelectPrevObjectFile = js.Any.fromFunction1(SelectPrevObjectFile), SetFolderSelectionStates = js.Any.fromFunction2(SetFolderSelectionStates), SetObjectOrObjectFileVersionSelectionStates = js.Any.fromFunction2(SetObjectOrObjectFileVersionSelectionStates), SetObjectVersionSelectionStates = js.Any.fromFunction2(SetObjectVersionSelectionStates), SetTheme = js.Any.fromFunction1(SetTheme), SetVirtualSelection = js.Any.fromFunction1(SetVirtualSelection), SumOfResultCounts = SumOfResultCounts, UnselectAll = js.Any.fromFunction0(UnselectAll))
  
    __obj.asInstanceOf[IShellListing]
  }
}

