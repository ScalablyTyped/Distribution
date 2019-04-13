package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationErrorItem extends js.Object {
  var keyword: java.lang.String
  var message: java.lang.String
  var params: Pojo
}

object ValidationErrorItem {
  @scala.inline
  def apply(keyword: java.lang.String, message: java.lang.String, params: Pojo): ValidationErrorItem = {
    val __obj = js.Dynamic.literal(keyword = keyword, message = message, params = params)
  
    __obj.asInstanceOf[ValidationErrorItem]
  }
}

