package typings.nivoLine.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serie
  extends /* key */ StringDictionary[js.Any] {
  var data: js.Array[Datum]
  var id: String | Double
}

object Serie {
  @scala.inline
  def apply(
    data: js.Array[Datum],
    id: String | Double,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Serie = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Serie]
  }
}

