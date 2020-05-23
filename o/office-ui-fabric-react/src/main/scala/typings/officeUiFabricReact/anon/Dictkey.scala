package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactInstance
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey extends /* key */ StringDictionary[ReactInstance] {
  var navigatedMonth: HTMLElement
}

object Dictkey {
  @scala.inline
  def apply(navigatedMonth: HTMLElement, StringDictionary: /* key */ StringDictionary[ReactInstance] = null): Dictkey = {
    val __obj = js.Dynamic.literal(navigatedMonth = navigatedMonth.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

