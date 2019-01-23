package typings
package nodeDashEmojiLib.nodeDashEmojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-emoji", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val emoji: nodeDashEmojiLib.Anon_1 = js.native
  def emojify(str: java.lang.String): java.lang.String = js.native
  def emojify(
    str: java.lang.String,
    on_missing: js.Function1[/* emoji_name */ java.lang.String, java.lang.String]
  ): java.lang.String = js.native
  def emojify(
    str: java.lang.String,
    on_missing: js.Function1[/* emoji_name */ java.lang.String, java.lang.String],
    format: js.Function2[/* code */ java.lang.String, /* name */ java.lang.String, java.lang.String]
  ): java.lang.String = js.native
  def find(emoji: java.lang.String): nodeDashEmojiLib.nodeDashEmojiMod.Emoji = js.native
  def get(emoji: java.lang.String): java.lang.String = js.native
  def hasEmoji(str: java.lang.String): scala.Boolean = js.native
  def random(): nodeDashEmojiLib.nodeDashEmojiMod.Emoji = js.native
  def replace(str: java.lang.String, replacement: java.lang.String): java.lang.String = js.native
  def replace(str: java.lang.String, replacement: java.lang.String, cleanSpaces: scala.Boolean): java.lang.String = js.native
  def replace(
    str: java.lang.String,
    replacement: js.Function1[/* emoji */ nodeDashEmojiLib.nodeDashEmojiMod.Emoji, java.lang.String]
  ): java.lang.String = js.native
  def replace(
    str: java.lang.String,
    replacement: js.Function1[/* emoji */ nodeDashEmojiLib.nodeDashEmojiMod.Emoji, java.lang.String],
    cleanSpaces: scala.Boolean
  ): java.lang.String = js.native
  def search(searchTerm: java.lang.String): js.Array[nodeDashEmojiLib.nodeDashEmojiMod.Emoji] = js.native
  def strip(str: java.lang.String): java.lang.String = js.native
  def unemojify(str: java.lang.String): java.lang.String = js.native
  def which(emoji_code: java.lang.String): java.lang.String = js.native
}

