package typings
package oauth2orizeLib.oauth2orizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewareRequest
  extends nodeLib.httpMod.IncomingMessage {
  var oauth2: js.UndefOr[OAuth2] = js.native
  var user: js.UndefOr[js.Any] = js.native
}

