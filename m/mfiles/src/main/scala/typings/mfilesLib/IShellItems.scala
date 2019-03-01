package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellItems extends js.Object {
  val Count: scala.Double
  val Folders: IFolderDefs
  val ObjectFiles: IObjectFileAndObjVerOfMultipleFiles
  val ObjectVersions: IObjectVersions
  val ObjectVersionsAndProperties: IObjectVersionAndPropertiesOfMultipleObjects
  def GetObjectVersionsCount(): scala.Double
}

object IShellItems {
  @scala.inline
  def apply(
    Count: scala.Double,
    Folders: IFolderDefs,
    GetObjectVersionsCount: js.Function0[scala.Double],
    ObjectFiles: IObjectFileAndObjVerOfMultipleFiles,
    ObjectVersions: IObjectVersions,
    ObjectVersionsAndProperties: IObjectVersionAndPropertiesOfMultipleObjects
  ): IShellItems = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Folders")(Folders)
    __obj.updateDynamic("GetObjectVersionsCount")(GetObjectVersionsCount)
    __obj.updateDynamic("ObjectFiles")(ObjectFiles)
    __obj.updateDynamic("ObjectVersions")(ObjectVersions)
    __obj.updateDynamic("ObjectVersionsAndProperties")(ObjectVersionsAndProperties)
    __obj.asInstanceOf[IShellItems]
  }
}

