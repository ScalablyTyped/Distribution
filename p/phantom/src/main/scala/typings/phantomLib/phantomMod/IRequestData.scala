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
    val __obj = js.Dynamic.literal(headers = headers, id = id, method = method, time = time, url = url)
  
    __obj.asInstanceOf[IRequestData]
  }
}

