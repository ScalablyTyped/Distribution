package typings
package nodemailerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: java.lang.String
  var port: scala.Double
  var secure: scala.Boolean
}

object Anon_Host {
  @scala.inline
  def apply(host: java.lang.String, port: scala.Double, secure: scala.Boolean): Anon_Host = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[Anon_Host]
  }
}

