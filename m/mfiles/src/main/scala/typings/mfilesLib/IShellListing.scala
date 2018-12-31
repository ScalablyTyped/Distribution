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

