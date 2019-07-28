package typings.nightmare.nightmareMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequest extends js.Object {
  var headers: js.Object
  var id: Double
  var method: String
  var time: Date
  var url: String
}

object IRequest {
  @scala.inline
  def apply(headers: js.Object, id: Double, method: String, time: Date, url: String): IRequest = {
    val __obj = js.Dynamic.literal(headers = headers, id = id, method = method, time = time, url = url)
  
    __obj.asInstanceOf[IRequest]
  }
}

