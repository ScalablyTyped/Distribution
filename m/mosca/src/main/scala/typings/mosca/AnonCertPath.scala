package typings.mosca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCertPath extends js.Object {
  var certPath: String
  var keyPath: String
  var port: Double
}

object AnonCertPath {
  @scala.inline
  def apply(certPath: String, keyPath: String, port: Double): AnonCertPath = {
    val __obj = js.Dynamic.literal(certPath = certPath.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCertPath]
  }
}

