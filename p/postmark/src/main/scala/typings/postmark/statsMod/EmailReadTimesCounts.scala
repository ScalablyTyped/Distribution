package typings.postmark.statsMod

import org.scalablytyped.runtime.StringDictionary
import typings.postmark.AnonDictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailReadTimesCounts
  extends /* key */ StringDictionary[js.Any] {
  var Days: js.Array[AnonDictkey]
}

object EmailReadTimesCounts {
  @scala.inline
  def apply(Days: js.Array[AnonDictkey], StringDictionary: /* key */ StringDictionary[js.Any] = null): EmailReadTimesCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[EmailReadTimesCounts]
  }
}

