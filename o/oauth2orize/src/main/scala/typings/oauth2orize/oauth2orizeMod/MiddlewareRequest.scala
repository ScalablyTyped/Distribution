package typings.oauth2orize.oauth2orizeMod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewareRequest extends IncomingMessage {
  var oauth2: js.UndefOr[OAuth2] = js.native
  var user: js.UndefOr[js.Any] = js.native
}

