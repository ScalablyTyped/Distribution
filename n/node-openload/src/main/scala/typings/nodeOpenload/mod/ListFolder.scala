package typings.nodeOpenload.mod

import typings.nodeOpenload.AnonCstatus
import typings.nodeOpenload.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFolder extends js.Object {
  var files: js.Array[AnonCstatus]
  var folders: js.Array[AnonId]
}

object ListFolder {
  @scala.inline
  def apply(files: js.Array[AnonCstatus], folders: js.Array[AnonId]): ListFolder = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFolder]
  }
}

