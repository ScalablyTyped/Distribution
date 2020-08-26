package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellItems extends js.Object {
  val Count: Double = js.native
  val Folders: IFolderDefs = js.native
  val ObjectFiles: IObjectFileAndObjVerOfMultipleFiles = js.native
  val ObjectVersions: IObjectVersions = js.native
  val ObjectVersionsAndProperties: IObjectVersionAndPropertiesOfMultipleObjects = js.native
  def GetObjectVersionsCount(): Double = js.native
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
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Folders = Folders.asInstanceOf[js.Any], GetObjectVersionsCount = js.Any.fromFunction0(GetObjectVersionsCount), ObjectFiles = ObjectFiles.asInstanceOf[js.Any], ObjectVersions = ObjectVersions.asInstanceOf[js.Any], ObjectVersionsAndProperties = ObjectVersionsAndProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellItems]
  }
  @scala.inline
  implicit class IShellItemsOps[Self <: IShellItems] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolders(value: IFolderDefs): Self = this.set("Folders", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetObjectVersionsCount(value: () => Double): Self = this.set("GetObjectVersionsCount", js.Any.fromFunction0(value))
    @scala.inline
    def setObjectFiles(value: IObjectFileAndObjVerOfMultipleFiles): Self = this.set("ObjectFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectVersions(value: IObjectVersions): Self = this.set("ObjectVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectVersionsAndProperties(value: IObjectVersionAndPropertiesOfMultipleObjects): Self = this.set("ObjectVersionsAndProperties", value.asInstanceOf[js.Any])
  }
  
}

