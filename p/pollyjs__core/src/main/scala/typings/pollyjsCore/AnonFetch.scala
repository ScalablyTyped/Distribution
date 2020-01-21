package typings.pollyjsCore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFetch
  extends /* key */ StringDictionary[js.Any] {
  var fetch: js.UndefOr[AnonContext] = js.undefined
  var puppeteer: js.UndefOr[AnonPage] = js.undefined
  var xhr: js.UndefOr[AnonContext] = js.undefined
}

object AnonFetch {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    fetch: AnonContext = null,
    puppeteer: AnonPage = null,
    xhr: AnonContext = null
  ): AnonFetch = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (puppeteer != null) __obj.updateDynamic("puppeteer")(puppeteer.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFetch]
  }
}

