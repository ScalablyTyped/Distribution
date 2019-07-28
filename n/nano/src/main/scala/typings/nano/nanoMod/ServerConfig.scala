package typings.nano.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfig extends js.Object {
  var db: String
  var url: String
}

object ServerConfig {
  @scala.inline
  def apply(db: String, url: String): ServerConfig = {
    val __obj = js.Dynamic.literal(db = db, url = url)
  
    __obj.asInstanceOf[ServerConfig]
  }
}

