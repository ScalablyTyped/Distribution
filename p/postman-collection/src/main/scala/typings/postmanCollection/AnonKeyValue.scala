package typings.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyValue extends js.Object {
  var key: String
  var value: String | Boolean
}

object AnonKeyValue {
  @scala.inline
  def apply(key: String, value: String | Boolean): AnonKeyValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyValue]
  }
}

