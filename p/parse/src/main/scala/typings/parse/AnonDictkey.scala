package typings.parse

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var objectId: js.UndefOr[String] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, objectId: String = null): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

