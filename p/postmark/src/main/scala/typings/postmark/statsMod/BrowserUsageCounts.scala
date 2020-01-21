package typings.postmark.statsMod

import org.scalablytyped.runtime.StringDictionary
import typings.postmark.AnonDateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserUsageCounts
  extends /* key */ StringDictionary[js.Any] {
  var Days: js.Array[AnonDateKey]
}

object BrowserUsageCounts {
  @scala.inline
  def apply(Days: js.Array[AnonDateKey], StringDictionary: /* key */ StringDictionary[js.Any] = null): BrowserUsageCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[BrowserUsageCounts]
  }
}

