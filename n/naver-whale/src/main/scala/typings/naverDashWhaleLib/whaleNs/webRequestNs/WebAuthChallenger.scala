package typings
package naverDashWhaleLib.whaleNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthChallenger extends js.Object {
  var host: java.lang.String
  var port: scala.Double
}

object WebAuthChallenger {
  @scala.inline
  def apply(host: java.lang.String, port: scala.Double): WebAuthChallenger = {
    val __obj = js.Dynamic.literal(host = host, port = port)
  
    __obj.asInstanceOf[WebAuthChallenger]
  }
}

