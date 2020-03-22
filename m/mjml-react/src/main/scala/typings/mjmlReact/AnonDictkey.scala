package typings.mjmlReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[ReactNode] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, children: ReactNode = null): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

