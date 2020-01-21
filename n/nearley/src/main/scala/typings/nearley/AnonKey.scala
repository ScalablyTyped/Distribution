package typings.nearley

import org.scalablytyped.runtime.StringDictionary
import typings.nearley.mod.LexerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey
  extends /* key */ StringDictionary[js.Any] {
  var lexerState: LexerState
}

object AnonKey {
  @scala.inline
  def apply(lexerState: LexerState, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonKey = {
    val __obj = js.Dynamic.literal(lexerState = lexerState.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonKey]
  }
}

