package typings.nano.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/find.html#selector-syntax
trait MangoSelector
  extends /* key */ StringDictionary[MangoSelector | MangoValue | js.Array[MangoValue]]

object MangoSelector {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[MangoSelector | MangoValue | js.Array[MangoValue]] = null
  ): MangoSelector = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[MangoSelector]
  }
}

