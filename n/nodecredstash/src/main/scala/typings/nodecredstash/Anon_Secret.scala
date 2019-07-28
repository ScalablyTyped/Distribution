package typings.nodecredstash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Secret extends js.Object {
  var secret: String
  var version: String
}

object Anon_Secret {
  @scala.inline
  def apply(secret: String, version: String): Anon_Secret = {
    val __obj = js.Dynamic.literal(secret = secret, version = version)
  
    __obj.asInstanceOf[Anon_Secret]
  }
}

