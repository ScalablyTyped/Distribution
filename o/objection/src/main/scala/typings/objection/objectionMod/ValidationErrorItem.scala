package typings.objection.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationErrorItem extends js.Object {
  var keyword: String
  var message: String
  var params: Pojo
}

object ValidationErrorItem {
  @scala.inline
  def apply(keyword: String, message: String, params: Pojo): ValidationErrorItem = {
    val __obj = js.Dynamic.literal(keyword = keyword, message = message, params = params)
  
    __obj.asInstanceOf[ValidationErrorItem]
  }
}

