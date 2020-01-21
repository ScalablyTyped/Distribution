package typings.nock.mod

import typings.nock.AnonHeaders
import typings.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplyFnContext extends Interceptor {
  var req: ClientRequest with AnonHeaders = js.native
}

