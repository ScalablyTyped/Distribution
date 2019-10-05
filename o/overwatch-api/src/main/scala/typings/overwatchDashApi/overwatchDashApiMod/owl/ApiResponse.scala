package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiResponse[T] extends js.Object {
  var data: T
}

object ApiResponse {
  @scala.inline
  def apply[T](data: T): ApiResponse[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApiResponse[T]]
  }
}

