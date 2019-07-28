package typings.nearley

import org.scalablytyped.runtime.StringDictionary
import typings.nearley.nearleyMod.LexerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var lexerState: LexerState
}

object Anon_Key {
  @scala.inline
  def apply(lexerState: LexerState, StringDictionary: /* key */ StringDictionary[js.Any] = null): Anon_Key = {
    val __obj = js.Dynamic.literal(lexerState = lexerState)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

