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
    ActivateListing: js.Function0[scala.Unit],
    ActivateSelected: js.Function0[scala.Unit],
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
    RefreshListing: js.Function3[scala.Boolean, scala.Boolean, scala.Boolean, scala.Unit],
    RefreshListingAsync: js.Function0[scala.Unit],
    RefreshObject: js.Function3[IObjID, scala.Boolean, scala.Boolean, scala.Unit],
    RefreshSelectedObjects: js.Function2[scala.Boolean, scala.Boolean, scala.Unit],
    SelectFolder: js.Function1[IFolderDef, scala.Unit],
    SelectNextFolder: js.Function1[mfilesLib.MFilesNs.MFFolderDefType, scala.Boolean],
    SelectNextObject: js.Function0[scala.Boolean],
    SelectNextObjectFile: js.Function1[scala.Boolean, scala.Boolean],
    SelectObjectFile: js.Function2[IObjVer, IFileVer, scala.Unit],
    SelectObjectOrObjectFileVersion: js.Function1[IObjOrFileVer, scala.Unit],
    SelectObjectVersion: js.Function1[IObjVer, scala.Unit],
    SelectPrevFolder: js.Function1[mfilesLib.MFilesNs.MFFolderDefType, scala.Boolean],
    SelectPrevObject: js.Function0[scala.Boolean],
    SelectPrevObjectFile: js.Function1[scala.Boolean, scala.Boolean],
    SetFolderSelectionStates: js.Function2[IFolderDefs, scala.Boolean, scala.Unit],
    SetObjectOrObjectFileVersionSelectionStates: js.Function2[IObjOrFileVers, scala.Boolean, scala.Unit],
    SetObjectVersionSelectionStates: js.Function2[IObjVers, scala.Boolean, scala.Unit],
    SetTheme: js.Function1[ITheme, scala.Unit],
    SetVirtualSelection: js.Function1[IObjOrFileVers, scala.Unit],
    SumOfResultCounts: scala.Double,
    UnselectAll: js.Function0[scala.Unit]
  ): IShellListing = {
    val __obj = js.Dynamic.literal(ActivateListing = ActivateListing, ActivateSelected = ActivateSelected, AutoFitAllColumns = AutoFitAllColumns, AutoFitFirstColumn = AutoFitFirstColumn, ColumnHeadersVisible = ColumnHeadersVisible, CurrentPath = CurrentPath, CurrentSelection = CurrentSelection, Events = Events, GroupObjectsByObjectType = GroupObjectsByObjectType, GroupViewsAndFolders = GroupViewsAndFolders, IsActive = IsActive, Items = Items, RefreshListing = RefreshListing, RefreshListingAsync = RefreshListingAsync, RefreshObject = RefreshObject, RefreshSelectedObjects = RefreshSelectedObjects, SelectFolder = SelectFolder, SelectNextFolder = SelectNextFolder, SelectNextObject = SelectNextObject, SelectNextObjectFile = SelectNextObjectFile, SelectObjectFile = SelectObjectFile, SelectObjectOrObjectFileVersion = SelectObjectOrObjectFileVersion, SelectObjectVersion = SelectObjectVersion, SelectPrevFolder = SelectPrevFolder, SelectPrevObject = SelectPrevObject, SelectPrevObjectFile = SelectPrevObjectFile, SetFolderSelectionStates = SetFolderSelectionStates, SetObjectOrObjectFileVersionSelectionStates = SetObjectOrObjectFileVersionSelectionStates, SetObjectVersionSelectionStates = SetObjectVersionSelectionStates, SetTheme = SetTheme, SetVirtualSelection = SetVirtualSelection, SumOfResultCounts = SumOfResultCounts, UnselectAll = UnselectAll)
  
    __obj.asInstanceOf[IShellListing]
  }
}

