package typings.nodeEmoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emoji_ extends js.Object {
  var emoji: String
  var key: String
}

object Emoji_ {
  @scala.inline
  def apply(emoji: String, key: String): Emoji_ = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emoji_]
  }
}

