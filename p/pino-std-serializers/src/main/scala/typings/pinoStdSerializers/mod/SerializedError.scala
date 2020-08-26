package typings.pinoStdSerializers.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializedError
  extends /* key */ NumberDictionary[js.Any]
     with /**
  * Any other extra properties that have been attached to the object will also be present on the serialized object.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * The supplied error message.
    */
  var message: String = js.native
  /**
    * Non-enumerable. The original Error object. This will not be included in the logged output.
    * This is available for subsequent serializers to use.
    */
  var raw: Error = js.native
  /**
    * The stack when the error was generated.
    */
  var stack: String = js.native
  /**
    * The name of the object's constructor.
    */
  var `type`: String = js.native
}

object SerializedError {
  @scala.inline
  def apply(message: String, raw: Error, stack: String, `type`: String): SerializedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedError]
  }
  @scala.inline
  implicit class SerializedErrorOps[Self <: SerializedError] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: Error): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

