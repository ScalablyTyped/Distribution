package typings.next.documentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextScriptProps
  extends /* key */ StringDictionary[js.Any] {
  var nonce: js.UndefOr[String] = js.undefined
}

object NextScriptProps {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, nonce: String = null): NextScriptProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[NextScriptProps]
  }
}

