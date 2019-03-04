package typings
package mjmlDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenKeyName
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var name: java.lang.String
}

object Anon_ChildrenKeyName {
  @scala.inline
  def apply(
    name: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null
  ): Anon_ChildrenKeyName = {
    val __obj = js.Dynamic.literal(name = name)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenKeyName]
  }
}

