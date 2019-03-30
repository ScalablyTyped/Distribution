package typings
package atNivoLineLib.atNivoLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineSerieData
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var data: js.Array[LineDatum]
  var id: java.lang.String | scala.Double
}

object LineSerieData {
  @scala.inline
  def apply(
    data: js.Array[LineDatum],
    id: java.lang.String | scala.Double,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): LineSerieData = {
    val __obj = js.Dynamic.literal(data = data, id = id.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LineSerieData]
  }
}

