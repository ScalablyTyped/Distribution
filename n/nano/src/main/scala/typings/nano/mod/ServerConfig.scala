package typings.nano.mod

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
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerConfig]
  }
}

