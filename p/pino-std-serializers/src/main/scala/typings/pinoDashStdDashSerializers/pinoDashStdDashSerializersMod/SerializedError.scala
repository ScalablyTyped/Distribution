package typings.pinoDashStdDashSerializers.pinoDashStdDashSerializersMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedError
  extends /**
  * Any other extra properties that have been attached to the object will also be present on the serialized object.
  */
/* key */ StringDictionary[js.Any]
     with /* key */ NumberDictionary[js.Any] {
  /**
    * The supplied error message.
    */
  var message: String
  /**
    * Non-enumerable. The original Error object. This will not be included in the logged output.
    * This is available for subsequent serializers to use.
    */
  var raw: Error
  /**
    * The stack when the error was generated.
    */
  var stack: String
  /**
    * The name of the object's constructor.
    */
  var `type`: String
}

object SerializedError {
  @scala.inline
  def apply(
    message: String,
    raw: Error,
    stack: String,
    `type`: String,
    NumberDictionary: /* key */ NumberDictionary[js.Any] = null,
    StringDictionary: /**
    * Any other extra properties that have been attached to the object will also be present on the serialized object.
    */
  /* key */ StringDictionary[js.Any] = null
  ): SerializedError = {
    val __obj = js.Dynamic.literal(message = message, raw = raw, stack = stack)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SerializedError]
  }
}

