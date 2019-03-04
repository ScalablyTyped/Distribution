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
    val __obj = js.Dynamic.literal(emoji = emoji, key = key)
  
    __obj.asInstanceOf[Emoji]
  }
}

