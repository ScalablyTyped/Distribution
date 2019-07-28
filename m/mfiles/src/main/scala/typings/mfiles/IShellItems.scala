package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellItems extends js.Object {
  val Count: Double
  val Folders: IFolderDefs
  val ObjectFiles: IObjectFileAndObjVerOfMultipleFiles
  val ObjectVersions: IObjectVersions
  val ObjectVersionsAndProperties: IObjectVersionAndPropertiesOfMultipleObjects
  def GetObjectVersionsCount(): Double
}

object IShellItems {
  @scala.inline
  def apply(
    Count: Double,
    Folders: IFolderDefs,
    GetObjectVersionsCount: () => Double,
    ObjectFiles: IObjectFileAndObjVerOfMultipleFiles,
    ObjectVersions: IObjectVersions,
    ObjectVersionsAndProperties: IObjectVersionAndPropertiesOfMultipleObjects
  ): IShellItems = {
    val __obj = js.Dynamic.literal(Count = Count, Folders = Folders, GetObjectVersionsCount = js.Any.fromFunction0(GetObjectVersionsCount), ObjectFiles = ObjectFiles, ObjectVersions = ObjectVersions, ObjectVersionsAndProperties = ObjectVersionsAndProperties)
  
    __obj.asInstanceOf[IShellItems]
  }
}

