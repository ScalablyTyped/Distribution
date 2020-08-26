package typings.openfin.webcontentsMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowResourceLoadFailedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var errorCode: Double = js.native
  var errorDescription: String = js.native
  var isMainFrame: Boolean = js.native
  var validatedURL: String = js.native
}

object WindowResourceLoadFailedEvent {
  @scala.inline
  def apply[Topic, Type](
    errorCode: Double,
    errorDescription: String,
    isMainFrame: Boolean,
    name: String,
    topic: Topic,
    `type`: Type,
    uuid: String,
    validatedURL: String
  ): WindowResourceLoadFailedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorDescription = errorDescription.asInstanceOf[js.Any], isMainFrame = isMainFrame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], validatedURL = validatedURL.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowResourceLoadFailedEvent[Topic, Type]]
  }
  @scala.inline
  implicit class WindowResourceLoadFailedEventOps[Self <: WindowResourceLoadFailedEvent[_, _], Topic, Type] (val x: Self with (WindowResourceLoadFailedEvent[Topic, Type])) extends AnyVal {
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
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorDescription(value: String): Self = this.set("errorDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMainFrame(value: Boolean): Self = this.set("isMainFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidatedURL(value: String): Self = this.set("validatedURL", value.asInstanceOf[js.Any])
  }
  
}

