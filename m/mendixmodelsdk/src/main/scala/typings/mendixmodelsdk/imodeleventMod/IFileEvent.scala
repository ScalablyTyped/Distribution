package typings.mendixmodelsdk.imodeleventMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.fileChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileEvent extends IModelEvent {
  var files: js.Array[String] = js.native
  var id: Double = js.native
  var `type`: fileChanges = js.native
}

object IFileEvent {
  @scala.inline
  def apply(files: js.Array[String], id: Double, `type`: fileChanges): IFileEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileEvent]
  }
  @scala.inline
  implicit class IFileEventOps[Self <: IFileEvent] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: fileChanges): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

