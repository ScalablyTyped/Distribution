package typings.nodeEmoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-emoji", "replace")
@js.native
object replace extends js.Object {
  def apply(str: String, replacement: String): String = js.native
  def apply(str: String, replacement: String, cleanSpaces: Boolean): String = js.native
  def apply(str: String, replacement: js.Function1[/* emoji */ Emoji_, String]): String = js.native
  def apply(str: String, replacement: js.Function1[/* emoji */ Emoji_, String], cleanSpaces: Boolean): String = js.native
}

