package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var message: atOracleOraclejetLib.ojmessageMod.ojMessageNs.Message
}

object Anon_Message {
  @scala.inline
  def apply(
    message: atOracleOraclejetLib.ojmessageMod.ojMessageNs.Message,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Message]
  }
}

