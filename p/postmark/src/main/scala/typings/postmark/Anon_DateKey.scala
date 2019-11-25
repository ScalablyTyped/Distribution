package typings.postmark

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateKey
  extends /* key */ StringDictionary[js.Any] {
  var Date: String
}

object Anon_DateKey {
  @scala.inline
  def apply(Date: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): Anon_DateKey = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_DateKey]
  }
}

