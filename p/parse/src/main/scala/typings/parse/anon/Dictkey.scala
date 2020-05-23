package typings.parse.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var objectId: js.UndefOr[String] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, objectId: String = null): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

