package typings.nodecredstash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSecret extends js.Object {
  var secret: String
  var version: String
}

object AnonSecret {
  @scala.inline
  def apply(secret: String, version: String): AnonSecret = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSecret]
  }
}

