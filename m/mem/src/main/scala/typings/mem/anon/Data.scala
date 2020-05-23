package typings.mem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[ReturnType] extends js.Object {
  var data: ReturnType
  var maxAge: Double
}

object Data {
  @scala.inline
  def apply[ReturnType](data: ReturnType, maxAge: Double): Data[ReturnType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[ReturnType]]
  }
}

