package typings.nodeDashEmoji.nodeDashEmojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-emoji", "emojify")
@js.native
object emojify extends js.Object {
  def apply(str: String): String = js.native
  def apply(str: String, on_missing: js.Function1[/* emoji_name */ String, String]): String = js.native
  def apply(
    str: String,
    on_missing: js.Function1[/* emoji_name */ String, String],
    format: js.Function2[/* code */ String, /* name */ String, String]
  ): String = js.native
}

