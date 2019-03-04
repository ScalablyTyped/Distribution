package typings
package muriLib.muriMod.MuriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultHost extends Host {
  var host: java.lang.String
  var port: scala.Double
}

object DefaultHost {
  @scala.inline
  def apply(host: java.lang.String, port: scala.Double): DefaultHost = {
    val __obj = js.Dynamic.literal(host = host, port = port)
  
    __obj.asInstanceOf[DefaultHost]
  }
}

