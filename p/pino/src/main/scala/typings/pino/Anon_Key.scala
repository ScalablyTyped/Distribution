package typings.pino

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var message: String
  var stack: String
  var `type`: String
}

object Anon_Key {
  @scala.inline
  def apply(
    message: String,
    stack: String,
    `type`: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal(message = message, stack = stack)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

