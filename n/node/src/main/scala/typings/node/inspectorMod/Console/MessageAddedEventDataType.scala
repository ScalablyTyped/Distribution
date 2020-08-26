package typings.node.inspectorMod.Console

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageAddedEventDataType extends js.Object {
  /**
    * Console message that has been added.
    */
  var message: ConsoleMessage = js.native
}

object MessageAddedEventDataType {
  @scala.inline
  def apply(message: ConsoleMessage): MessageAddedEventDataType = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAddedEventDataType]
  }
  @scala.inline
  implicit class MessageAddedEventDataTypeOps[Self <: MessageAddedEventDataType] (val x: Self) extends AnyVal {
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
    def setMessage(value: ConsoleMessage): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

