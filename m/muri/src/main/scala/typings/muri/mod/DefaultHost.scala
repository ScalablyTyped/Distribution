package typings.muri.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultHost extends Host {
  var host: String
  var port: Double
}

object DefaultHost {
  @scala.inline
  def apply(host: String, port: Double): DefaultHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultHost]
  }
}

