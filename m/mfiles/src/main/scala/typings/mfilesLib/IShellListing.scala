package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellListing extends js.Object {
  var AutoFitAllColumns: scala.Boolean
  var AutoFitFirstColumn: scala.Boolean
  var ColumnHeadersVisible: scala.Boolean
  val CurrentPath: java.lang.String
  val CurrentSelection: IShellItems
  val Events: IShellListingEvents
  var GroupObjectsByObjectType: scala.Boolean
  var GroupViewsAndFolders: scala.Boolean
  val IsActive: scala.Boolean
  val Items: IShellItems
  val SumOfResultCounts: scala.Double
  def ActivateListing(): scala.Unit
  def ActivateSelected(): scala.Unit
  def RefreshListing(
    smartUpdate: scala.Boolean,
    refreshFromServer: scala.Boolean,
    forceFullRefreshFromServer: scala.Boolean
  ): scala.Unit
  def RefreshListingAsync(): scala.Unit
  def RefreshObject(objID: IObjID, refreshFromServer: scala.Boolean, updateRelatedObjects: scala.Boolean): scala.Unit
  def RefreshSelectedObjects(refreshFromServer: scala.Boolean, updateRelatedObjects: scala.Boolean): scala.Unit
  def SelectFolder(folderDef: IFolderDef): scala.Unit
  def SelectNextFolder(folderDefType: mfilesLib.MFilesNs.MFFolderDefType): scala.Boolean
  def SelectNextObject(): scala.Boolean
  def SelectNextObjectFile(allowMoveToNextObject: scala.Boolean): scala.Boolean
  def SelectObjectFile(objVer: IObjVer, fileVer: IFileVer): scala.Unit
  def SelectObjectOrObjectFileVersion(objOrFileVer: IObjOrFileVer): scala.Unit
  def SelectObjectVersion(objVer: IObjVer): scala.Unit
  def SelectPrevFolder(folderDefType: mfilesLib.MFilesNs.MFFolderDefType): scala.Boolean
  def SelectPrevObject(): scala.Boolean
  def SelectPrevObjectFile(allowMoveToPrevObject: scala.Boolean): scala.Boolean
  def SetFolderSelectionStates(folderDefs: IFolderDefs, select: scala.Boolean): scala.Unit
  def SetObjectOrObjectFileVersionSelectionStates(objOrFileVers: IObjOrFileVers, select: scala.Boolean): scala.Unit
  def SetObjectVersionSelectionStates(objVers: IObjVers, select: scala.Boolean): scala.Unit
  def SetTheme(theme: ITheme): scala.Unit
  def SetVirtualSelection(objOrFileVers: IObjOrFileVers): scala.Unit
  def UnselectAll(): scala.Unit
}

object IShellListing {
  @scala.inline
  def apply(
    ActivateListing: () => scala.Unit,
    ActivateSelected: () => scala.Unit,
    AutoFitAllColumns: scala.Boolean,
    AutoFitFirstColumn: scala.Boolean,
    ColumnHeadersVisible: scala.Boolean,
    CurrentPath: java.lang.String,
    CurrentSelection: IShellItems,
    Events: IShellListingEvents,
    GroupObjectsByObjectType: scala.Boolean,
    GroupViewsAndFolders: scala.Boolean,
    IsActive: scala.Boolean,
    Items: IShellItems,
    RefreshListing: (scala.Boolean, scala.Boolean, scala.Boolean) => scala.Unit,
    RefreshListingAsync: () => scala.Unit,
    RefreshObject: (IObjID, scala.Boolean, scala.Boolean) => scala.Unit,
    RefreshSelectedObjects: (scala.Boolean, scala.Boolean) => scala.Unit,
    SelectFolder: IFolderDef => scala.Unit,
    SelectNextFolder: mfilesLib.MFilesNs.MFFolderDefType => scala.Boolean,
    SelectNextObject: () => scala.Boolean,
    SelectNextObjectFile: scala.Boolean => scala.Boolean,
    SelectObjectFile: (IObjVer, IFileVer) => scala.Unit,
    SelectObjectOrObjectFileVersion: IObjOrFileVer => scala.Unit,
    SelectObjectVersion: IObjVer => scala.Unit,
    SelectPrevFolder: mfilesLib.MFilesNs.MFFolderDefType => scala.Boolean,
    SelectPrevObject: () => scala.Boolean,
    SelectPrevObjectFile: scala.Boolean => scala.Boolean,
    SetFolderSelectionStates: (IFolderDefs, scala.Boolean) => scala.Unit,
    SetObjectOrObjectFileVersionSelectionStates: (IObjOrFileVers, scala.Boolean) => scala.Unit,
    SetObjectVersionSelectionStates: (IObjVers, scala.Boolean) => scala.Unit,
    SetTheme: ITheme => scala.Unit,
    SetVirtualSelection: IObjOrFileVers => scala.Unit,
    SumOfResultCounts: scala.Double,
    UnselectAll: () => scala.Unit
  ): IShellListing = {
    val __obj = js.Dynamic.literal(ActivateListing = js.Any.fromFunction0(ActivateListing), ActivateSelected = js.Any.fromFunction0(ActivateSelected), AutoFitAllColumns = AutoFitAllColumns, AutoFitFirstColumn = AutoFitFirstColumn, ColumnHeadersVisible = ColumnHeadersVisible, CurrentPath = CurrentPath, CurrentSelection = CurrentSelection, Events = Events, GroupObjectsByObjectType = GroupObjectsByObjectType, GroupViewsAndFolders = GroupViewsAndFolders, IsActive = IsActive, Items = Items, RefreshListing = js.Any.fromFunction3(RefreshListing), RefreshListingAsync = js.Any.fromFunction0(RefreshListingAsync), RefreshObject = js.Any.fromFunction3(RefreshObject), RefreshSelectedObjects = js.Any.fromFunction2(RefreshSelectedObjects), SelectFolder = js.Any.fromFunction1(SelectFolder), SelectNextFolder = js.Any.fromFunction1(SelectNextFolder), SelectNextObject = js.Any.fromFunction0(SelectNextObject), SelectNextObjectFile = js.Any.fromFunction1(SelectNextObjectFile), SelectObjectFile = js.Any.fromFunction2(SelectObjectFile), SelectObjectOrObjectFileVersion = js.Any.fromFunction1(SelectObjectOrObjectFileVersion), SelectObjectVersion = js.Any.fromFunction1(SelectObjectVersion), SelectPrevFolder = js.Any.fromFunction1(SelectPrevFolder), SelectPrevObject = js.Any.fromFunction0(SelectPrevObject), SelectPrevObjectFile = js.Any.fromFunction1(SelectPrevObjectFile), SetFolderSelectionStates = js.Any.fromFunction2(SetFolderSelectionStates), SetObjectOrObjectFileVersionSelectionStates = js.Any.fromFunction2(SetObjectOrObjectFileVersionSelectionStates), SetObjectVersionSelectionStates = js.Any.fromFunction2(SetObjectVersionSelectionStates), SetTheme = js.Any.fromFunction1(SetTheme), SetVirtualSelection = js.Any.fromFunction1(SetVirtualSelection), SumOfResultCounts = SumOfResultCounts, UnselectAll = js.Any.fromFunction0(UnselectAll))
  
    __obj.asInstanceOf[IShellListing]
  }
}

