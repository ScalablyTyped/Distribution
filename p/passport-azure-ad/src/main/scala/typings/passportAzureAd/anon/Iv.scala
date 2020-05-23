package typings.passportAzureAd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iv extends js.Object {
  var iv: String
  var key: String
}

object Iv {
  @scala.inline
  def apply(iv: String, key: String): Iv = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iv]
  }
}

