package typings.mosca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertPath extends js.Object {
  var certPath: String
  var keyPath: String
  var port: Double
}

object CertPath {
  @scala.inline
  def apply(certPath: String, keyPath: String, port: Double): CertPath = {
    val __obj = js.Dynamic.literal(certPath = certPath.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertPath]
  }
}

