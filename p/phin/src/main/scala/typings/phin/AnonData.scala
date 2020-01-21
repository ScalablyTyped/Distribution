package typings.phin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: AnonToString
}

object AnonData {
  @scala.inline
  def apply(data: AnonToString): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

