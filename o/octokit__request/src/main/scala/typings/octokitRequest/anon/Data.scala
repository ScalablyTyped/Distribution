package typings.octokitRequest.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Any
  var headers: StringDictionary[String]
  var status: Double
  var url: String
}

object Data {
  @scala.inline
  def apply(data: js.Any, headers: StringDictionary[String], status: Double, url: String): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

