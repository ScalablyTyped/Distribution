package typings.nock.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataMatcherMap
  extends /* key */ StringDictionary[DataMatcher]
     with _DataMatcher
     with _RequestBodyMatcher

object DataMatcherMap {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[DataMatcher] = null): DataMatcherMap = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DataMatcherMap]
  }
}

