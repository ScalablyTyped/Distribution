package typings
package nodeDashEmojiLib.nodeDashEmojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emoji extends js.Object {
  var emoji: java.lang.String
  var key: java.lang.String
}

object Emoji {
  @scala.inline
  def apply(emoji: java.lang.String, key: java.lang.String): Emoji = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emoji")(emoji)
    __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Emoji]
  }
}

