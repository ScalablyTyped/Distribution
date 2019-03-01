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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActivateListing")(ActivateListing)
    __obj.updateDynamic("ActivateSelected")(ActivateSelected)
    __obj.updateDynamic("AutoFitAllColumns")(AutoFitAllColumns)
    __obj.updateDynamic("AutoFitFirstColumn")(AutoFitFirstColumn)
    __obj.updateDynamic("ColumnHeadersVisible")(ColumnHeadersVisible)
    __obj.updateDynamic("CurrentPath")(CurrentPath)
    __obj.updateDynamic("CurrentSelection")(CurrentSelection)
    __obj.updateDynamic("Events")(Events)
    __obj.updateDynamic("GroupObjectsByObjectType")(GroupObjectsByObjectType)
    __obj.updateDynamic("GroupViewsAndFolders")(GroupViewsAndFolders)
    __obj.updateDynamic("IsActive")(IsActive)
    __obj.updateDynamic("Items")(Items)
    __obj.updateDynamic("RefreshListing")(RefreshListing)
    __obj.updateDynamic("RefreshListingAsync")(RefreshListingAsync)
    __obj.updateDynamic("RefreshObject")(RefreshObject)
    __obj.updateDynamic("RefreshSelectedObjects")(RefreshSelectedObjects)
    __obj.updateDynamic("SelectFolder")(SelectFolder)
    __obj.updateDynamic("SelectNextFolder")(SelectNextFolder)
    __obj.updateDynamic("SelectNextObject")(SelectNextObject)
    __obj.updateDynamic("SelectNextObjectFile")(SelectNextObjectFile)
    __obj.updateDynamic("SelectObjectFile")(SelectObjectFile)
    __obj.updateDynamic("SelectObjectOrObjectFileVersion")(SelectObjectOrObjectFileVersion)
    __obj.updateDynamic("SelectObjectVersion")(SelectObjectVersion)
    __obj.updateDynamic("SelectPrevFolder")(SelectPrevFolder)
    __obj.updateDynamic("SelectPrevObject")(SelectPrevObject)
    __obj.updateDynamic("SelectPrevObjectFile")(SelectPrevObjectFile)
    __obj.updateDynamic("SetFolderSelectionStates")(SetFolderSelectionStates)
    __obj.updateDynamic("SetObjectOrObjectFileVersionSelectionStates")(SetObjectOrObjectFileVersionSelectionStates)
    __obj.updateDynamic("SetObjectVersionSelectionStates")(SetObjectVersionSelectionStates)
    __obj.updateDynamic("SetTheme")(SetTheme)
    __obj.updateDynamic("SetVirtualSelection")(SetVirtualSelection)
    __obj.updateDynamic("SumOfResultCounts")(SumOfResultCounts)
    __obj.updateDynamic("UnselectAll")(UnselectAll)
    __obj.asInstanceOf[IShellListing]
  }
}

