package typings.mjmlDashReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenKey
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[ReactNode] = js.undefined
}

object Anon_ChildrenKey {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, children: ReactNode = null): Anon_ChildrenKey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenKey]
  }
}

