package typings.pinoDashHttp

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinoDashHttpMod {
  type GenReqId = js.Function1[/* req */ IncomingMessage, Double | String | js.Object]
  type HttpLogger = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Unit]
}
