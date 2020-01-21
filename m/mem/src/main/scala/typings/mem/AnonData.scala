package typings.mem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData[ReturnType] extends js.Object {
  var data: ReturnType
  var maxAge: Double
}

object AnonData {
  @scala.inline
  def apply[ReturnType](data: ReturnType, maxAge: Double): AnonData[ReturnType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData[ReturnType]]
  }
}

