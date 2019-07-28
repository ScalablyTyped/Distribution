package typings.nodeDashEmoji.nodeDashEmojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-emoji", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def emojify(str: String): String = js.native
  def emojify(str: String, on_missing: js.Function1[/* emoji_name */ String, String]): String = js.native
  def emojify(
    str: String,
    on_missing: js.Function1[/* emoji_name */ String, String],
    format: js.Function2[/* code */ String, /* name */ String, String]
  ): String = js.native
  def find(emoji: String): Emoji = js.native
  def get(emoji: String): String = js.native
  def hasEmoji(str: String): Boolean = js.native
  def random(): Emoji = js.native
  def replace(str: String, replacement: String): String = js.native
  def replace(str: String, replacement: String, cleanSpaces: Boolean): String = js.native
  def replace(str: String, replacement: js.Function1[/* emoji */ Emoji, String]): String = js.native
  def replace(str: String, replacement: js.Function1[/* emoji */ Emoji, String], cleanSpaces: Boolean): String = js.native
  def search(searchTerm: String): js.Array[Emoji] = js.native
  def strip(str: String): String = js.native
  def unemojify(str: String): String = js.native
  def which(emoji_code: String): String = js.native
}

