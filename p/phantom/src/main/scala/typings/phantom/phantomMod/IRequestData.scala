package typings.phantom.phantomMod

import typings.phantom.Anon_Name
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestData extends js.Object {
  var headers: js.Array[Anon_Name]
  var id: Double
  var method: String
  var time: Date
  var url: String
}

object IRequestData {
  @scala.inline
  def apply(headers: js.Array[Anon_Name], id: Double, method: String, time: Date, url: String): IRequestData = {
    val __obj = js.Dynamic.literal(headers = headers, id = id, method = method, time = time, url = url)
  
    __obj.asInstanceOf[IRequestData]
  }
}

