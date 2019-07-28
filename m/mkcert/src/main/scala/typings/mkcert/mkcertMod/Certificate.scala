package typings.mkcert.mkcertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  var cert: String
  var key: String
}

object Certificate {
  @scala.inline
  def apply(cert: String, key: String): Certificate = {
    val __obj = js.Dynamic.literal(cert = cert, key = key)
  
    __obj.asInstanceOf[Certificate]
  }
}

