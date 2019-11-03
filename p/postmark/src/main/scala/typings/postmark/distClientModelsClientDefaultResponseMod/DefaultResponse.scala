package typings.postmark.distClientModelsClientDefaultResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultResponse extends js.Object {
  var ErrorCode: Double
  var Message: String
}

object DefaultResponse {
  @scala.inline
  def apply(ErrorCode: Double, Message: String): DefaultResponse = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode, Message = Message)
  
    __obj.asInstanceOf[DefaultResponse]
  }
}

