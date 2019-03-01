package typings
package nearleyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var lexerState: nearleyLib.nearleyMod.LexerState
}

object Anon_Key {
  @scala.inline
  def apply(
    lexerState: nearleyLib.nearleyMod.LexerState,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lexerState")(lexerState)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

