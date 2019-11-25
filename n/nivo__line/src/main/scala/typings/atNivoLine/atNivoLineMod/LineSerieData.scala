package typings.atNivoLine.atNivoLineMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineSerieData
  extends /* key */ StringDictionary[js.Any] {
  var data: js.Array[LineDatum]
  var id: String | Double
}

object LineSerieData {
  @scala.inline
  def apply(
    data: js.Array[LineDatum],
    id: String | Double,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): LineSerieData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LineSerieData]
  }
}

