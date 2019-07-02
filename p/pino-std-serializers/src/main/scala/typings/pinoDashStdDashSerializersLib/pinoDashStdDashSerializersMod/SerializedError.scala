package typings
package pinoDashStdDashSerializersLib.pinoDashStdDashSerializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedError
  extends /**
  * Any other extra properties that have been attached to the object will also be present on the serialized object.
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any]
     with /* key */ org.scalablytyped.runtime.NumberDictionary[js.Any] {
  /**
    * The supplied error message.
    */
  var message: java.lang.String
  /**
    * Non-enumerable. The original Error object. This will not be included in the logged output.
    * This is available for subsequent serializers to use.
    */
  var raw: stdLib.Error
  /**
    * The stack when the error was generated.
    */
  var stack: java.lang.String
  /**
    * The name of the object's constructor.
    */
  var `type`: java.lang.String
}

object SerializedError {
  @scala.inline
  def apply(
    message: java.lang.String,
    raw: stdLib.Error,
    stack: java.lang.String,
    `type`: java.lang.String,
    NumberDictionary: /* key */ org.scalablytyped.runtime.NumberDictionary[js.Any] = null,
    StringDictionary: /**
    * Any other extra properties that have been attached to the object will also be present on the serialized object.
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): SerializedError = {
    val __obj = js.Dynamic.literal(message = message, raw = raw, stack = stack)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SerializedError]
  }
}

