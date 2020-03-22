package typings.mongoose

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictother
  extends /* other */ StringDictionary[js.Any] {
  var expires: js.UndefOr[String] = js.undefined
}

object AnonDictother {
  @scala.inline
  def apply(StringDictionary: /* other */ StringDictionary[js.Any] = null, expires: String = null): AnonDictother = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictother]
  }
}

