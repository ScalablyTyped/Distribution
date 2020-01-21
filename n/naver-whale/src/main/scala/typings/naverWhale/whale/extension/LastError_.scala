package typings.naverWhale.whale.extension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastError_ extends js.Object {
  /** Description of the error that has taken place. */
  var message: String
}

object LastError_ {
  @scala.inline
  def apply(message: String): LastError_ = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LastError_]
  }
}

