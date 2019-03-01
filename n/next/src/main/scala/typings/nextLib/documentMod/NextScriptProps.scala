package typings
package nextLib.documentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextScriptProps
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var nonce: js.UndefOr[java.lang.String] = js.undefined
}

object NextScriptProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    nonce: java.lang.String = null
  ): NextScriptProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[NextScriptProps]
  }
}

