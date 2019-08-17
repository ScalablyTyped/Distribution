package typings.passportDashJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashJwtMod {
  import typings.express.expressMod.Request

  type JwtFromRequestFunction = js.Function1[/* req */ Request, String]
  type VerifiedCallback = js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit]
  type VerifyCallback = js.Function2[/* payload */ js.Any, /* done */ VerifiedCallback, Unit]
  type VerifyCallbackWithRequest = js.Function3[/* req */ Request, /* payload */ js.Any, /* done */ VerifiedCallback, Unit]
}
