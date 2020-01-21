package typings.postmark

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateKey
  extends /* key */ StringDictionary[js.Any] {
  var Date: String
}

object AnonDateKey {
  @scala.inline
  def apply(Date: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonDateKey = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDateKey]
  }
}

