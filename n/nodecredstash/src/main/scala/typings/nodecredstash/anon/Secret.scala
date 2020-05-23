package typings.nodecredstash.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Secret extends js.Object {
  var secret: String
  var version: String
}

object Secret {
  @scala.inline
  def apply(secret: String, version: String): Secret = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Secret]
  }
}

