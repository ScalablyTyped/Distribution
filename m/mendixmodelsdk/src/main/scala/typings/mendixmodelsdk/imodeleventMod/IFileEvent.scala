package typings.mendixmodelsdk.imodeleventMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.fileChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileEvent extends IModelEvent {
  var files: js.Array[String]
  var id: Double
  var `type`: fileChanges
}

object IFileEvent {
  @scala.inline
  def apply(files: js.Array[String], id: Double, `type`: fileChanges): IFileEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileEvent]
  }
}

