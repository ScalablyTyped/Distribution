package typings.passportAzureAd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIv extends js.Object {
  var iv: String
  var key: String
}

object AnonIv {
  @scala.inline
  def apply(iv: String, key: String): AnonIv = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIv]
  }
}

