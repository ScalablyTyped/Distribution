package typings.nock.nockMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// essentially valid decoded JSON with the addition of possible RegExp
trait DataMatcher
  extends /* k */ StringDictionary[
      Boolean | Null | Double | String | RegExp | DataMatcher | (js.Array[Boolean | Null | Double | String | RegExp | DataMatcher])
    ]
     with _RequestBodyMatcher

object DataMatcher {
  @scala.inline
  def apply(
    StringDictionary: /* k */ StringDictionary[
      Boolean | Null | Double | String | RegExp | DataMatcher | (js.Array[Boolean | Null | Double | String | RegExp | DataMatcher])
    ] = null
  ): DataMatcher = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DataMatcher]
  }
}

