package typings.pollyjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var fetch: js.UndefOr[Context] = js.undefined
  var puppeteer: js.UndefOr[Page] = js.undefined
  var xhr: js.UndefOr[Context] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    fetch: Context = null,
    puppeteer: Page = null,
    xhr: Context = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (puppeteer != null) __obj.updateDynamic("puppeteer")(puppeteer.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

