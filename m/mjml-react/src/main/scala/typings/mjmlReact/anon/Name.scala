package typings.mjmlReact.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[ReactNode] = js.undefined
  var name: String
}

object Name {
  @scala.inline
  def apply(
    name: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    children: ReactNode = null
  ): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

