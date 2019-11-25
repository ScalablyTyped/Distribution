package typings.mfiles

import org.scalablytyped.runtime.StringDictionary
import typings.mfiles.mfilesNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITheme extends /* key */ StringDictionary[String | Boolean | Double] {
  var last: `0`
}

object ITheme {
  @scala.inline
  def apply(last: `0`, StringDictionary: /* key */ StringDictionary[String | Boolean | Double] = null): ITheme = {
    val __obj = js.Dynamic.literal(last = last.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ITheme]
  }
}

