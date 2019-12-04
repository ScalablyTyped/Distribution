package typings.nodemailer.libFetchMod

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableResponse extends Writable {
  var headers: IncomingHttpHeaders = js.native
  var statusCode: Double = js.native
}

