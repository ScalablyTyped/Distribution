package typings.node.childProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagingOptions extends js.Object {
  /**
    * Specify the kind of serialization used for sending messages between processes.
    * @default 'json'
    */
  var serialization: js.UndefOr[SerializationType] = js.undefined
}

object MessagingOptions {
  @scala.inline
  def apply(serialization: SerializationType = null): MessagingOptions = {
    val __obj = js.Dynamic.literal()
    if (serialization != null) __obj.updateDynamic("serialization")(serialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingOptions]
  }
}

