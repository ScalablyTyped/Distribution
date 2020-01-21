package typings.octokitRequest

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.Any
  var headers: StringDictionary[String]
  var status: Double
  var url: String
}

object AnonData {
  @scala.inline
  def apply(data: js.Any, headers: StringDictionary[String], status: Double, url: String): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

