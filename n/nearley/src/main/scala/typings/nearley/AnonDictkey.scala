package typings.nearley

import org.scalablytyped.runtime.StringDictionary
import typings.nearley.mod.LexerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var lexerState: LexerState
}

object AnonDictkey {
  @scala.inline
  def apply(lexerState: LexerState, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonDictkey = {
    val __obj = js.Dynamic.literal(lexerState = lexerState.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictkey]
  }
}

