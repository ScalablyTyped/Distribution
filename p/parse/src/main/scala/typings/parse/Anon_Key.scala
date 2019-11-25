package typings.parse

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var objectId: js.UndefOr[String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, objectId: String = null): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

