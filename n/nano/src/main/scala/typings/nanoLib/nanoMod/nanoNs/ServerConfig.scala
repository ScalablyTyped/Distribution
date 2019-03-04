package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfig extends js.Object {
  var db: java.lang.String
  var url: java.lang.String
}

object ServerConfig {
  @scala.inline
  def apply(db: java.lang.String, url: java.lang.String): ServerConfig = {
    val __obj = js.Dynamic.literal(db = db, url = url)
  
    __obj.asInstanceOf[ServerConfig]
  }
}

