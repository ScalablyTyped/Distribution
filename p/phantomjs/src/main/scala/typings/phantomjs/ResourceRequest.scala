package typings.phantomjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRequest extends js.Object {
  var headers: StringDictionary[String]
  var id: Double
  var method: String
  var time: Date
  var url: String
}

object ResourceRequest {
  @scala.inline
  def apply(headers: StringDictionary[String], id: Double, method: String, time: Date, url: String): ResourceRequest = {
    val __obj = js.Dynamic.literal(headers = headers, id = id, method = method, time = time, url = url)
  
    __obj.asInstanceOf[ResourceRequest]
  }
}

