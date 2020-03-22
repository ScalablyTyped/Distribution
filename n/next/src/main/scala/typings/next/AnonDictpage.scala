package typings.next

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictpage
  extends /* page */ StringDictionary[js.Array[String]] {
  @JSName("/_app")
  var Slash_app: js.Array[String]
}

object AnonDictpage {
  @scala.inline
  def apply(
    Slash_app: js.Array[String],
    StringDictionary: /* page */ StringDictionary[js.Array[String]] = null
  ): AnonDictpage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("/_app")(Slash_app.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictpage]
  }
}

