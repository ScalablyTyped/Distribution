package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowEndLoadEvent extends WindowEvent {
  var documentName: String = js.native
  var isMain: Boolean = js.native
}

object WindowEndLoadEvent {
  @scala.inline
  def apply(
    documentName: String,
    isMain: Boolean,
    name: String,
    topic: String,
    `type`: OpenFinApplicationEventType,
    uuid: String
  ): WindowEndLoadEvent = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEndLoadEvent]
  }
  @scala.inline
  implicit class WindowEndLoadEventOps[Self <: WindowEndLoadEvent] (val x: Self) extends AnyVal {
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
    def setDocumentName(value: String): Self = this.set("documentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMain(value: Boolean): Self = this.set("isMain", value.asInstanceOf[js.Any])
  }
  
}

