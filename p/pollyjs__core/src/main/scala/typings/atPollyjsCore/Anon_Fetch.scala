package typings.atPollyjsCore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fetch
  extends /* key */ StringDictionary[js.Any] {
  var fetch: js.UndefOr[Anon_Context] = js.undefined
  var puppeteer: js.UndefOr[Anon_Page] = js.undefined
  var xhr: js.UndefOr[Anon_Context] = js.undefined
}

object Anon_Fetch {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    fetch: Anon_Context = null,
    puppeteer: Anon_Page = null,
    xhr: Anon_Context = null
  ): Anon_Fetch = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (puppeteer != null) __obj.updateDynamic("puppeteer")(puppeteer.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fetch]
  }
}

