package typings.paypalRestSdk.mod.invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QrResponse extends js.Object {
  var image: String
}

object QrResponse {
  @scala.inline
  def apply(image: String): QrResponse = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[QrResponse]
  }
}

