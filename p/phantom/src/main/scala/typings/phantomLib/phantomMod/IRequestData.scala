package typings
package phantomLib.phantomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestData extends js.Object {
  var headers: js.Array[phantomLib.Anon_Name]
  var id: scala.Double
  var method: java.lang.String
  var time: stdLib.Date
  var url: java.lang.String
}

object IRequestData {
  @scala.inline
  def apply(
    headers: js.Array[phantomLib.Anon_Name],
    id: scala.Double,
    method: java.lang.String,
    time: stdLib.Date,
    url: java.lang.String
  ): IRequestData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IRequestData]
  }
}

