package typings.nearley.anon

import org.scalablytyped.runtime.StringDictionary
import typings.nearley.mod.LexerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var lexerState: LexerState
}

object Dictkey {
  @scala.inline
  def apply(lexerState: LexerState, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictkey = {
    val __obj = js.Dynamic.literal(lexerState = lexerState.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

