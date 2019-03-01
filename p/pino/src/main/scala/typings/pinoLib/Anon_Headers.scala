package typings
package pinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: nodeLib.httpMod.IncomingHttpHeaders
  var method: java.lang.String
  var remoteAddress: java.lang.String
  var remotePort: scala.Double
  var url: java.lang.String
}

object Anon_Headers {
  @scala.inline
  def apply(
    headers: nodeLib.httpMod.IncomingHttpHeaders,
    method: java.lang.String,
    remoteAddress: java.lang.String,
    remotePort: scala.Double,
    url: java.lang.String
  ): Anon_Headers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("remoteAddress")(remoteAddress)
    __obj.updateDynamic("remotePort")(remotePort)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Headers]
  }
}

