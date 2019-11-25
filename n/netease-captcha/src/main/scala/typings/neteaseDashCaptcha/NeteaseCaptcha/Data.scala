package typings.neteaseDashCaptcha.NeteaseCaptcha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var validate: String
}

object Data {
  @scala.inline
  def apply(validate: String): Data = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Data]
  }
}

