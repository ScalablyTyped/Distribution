package typings.postmark.statsMod

import org.scalablytyped.runtime.StringDictionary
import typings.postmark.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserUsageCounts
  extends /* key */ StringDictionary[js.Any] {
  var Days: js.Array[Dictkey]
}

object BrowserUsageCounts {
  @scala.inline
  def apply(Days: js.Array[Dictkey], StringDictionary: /* name */ StringDictionary[js.Any] = null): BrowserUsageCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[BrowserUsageCounts]
  }
}

