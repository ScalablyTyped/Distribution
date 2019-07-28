package typings.nock.nockMod

import typings.nock.Anon_Headers
import typings.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplyCallbackContext extends Interceptor {
  var req: ClientRequest with Anon_Headers = js.native
}

