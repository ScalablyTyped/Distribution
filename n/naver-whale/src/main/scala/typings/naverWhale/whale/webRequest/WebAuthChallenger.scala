package typings.naverWhale.whale.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthChallenger extends js.Object {
  var host: String
  var port: Double
}

object WebAuthChallenger {
  @scala.inline
  def apply(host: String, port: Double): WebAuthChallenger = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebAuthChallenger]
  }
}

