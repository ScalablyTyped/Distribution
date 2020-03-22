package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactInstance
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey extends /* key */ StringDictionary[ReactInstance] {
  var navigatedMonth: HTMLElement
}

object AnonDictkey {
  @scala.inline
  def apply(navigatedMonth: HTMLElement, StringDictionary: /* key */ StringDictionary[ReactInstance] = null): AnonDictkey = {
    val __obj = js.Dynamic.literal(navigatedMonth = navigatedMonth.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictkey]
  }
}

