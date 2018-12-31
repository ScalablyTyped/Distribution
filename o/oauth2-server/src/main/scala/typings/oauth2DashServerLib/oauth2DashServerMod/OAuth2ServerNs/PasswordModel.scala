package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordModel
  extends BaseModel
     with RequestAuthenticationModel {
  /**
    * Invoked to generate a new refresh token.
    *
    */
  var generateRefreshToken: js.UndefOr[
    js.Function4[
      /* client */ Client, 
      /* user */ User, 
      /* scope */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ js.UndefOr[Callback[java.lang.String]], 
      js.Promise[java.lang.String]
    ]
  ] = js.native
  /**
    * Invoked to check if the requested scope is valid for a particular client/user combination.
    *
    */
  var validateScope: js.UndefOr[
    js.Function4[
      /* user */ User, 
      /* client */ Client, 
      /* scope */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ js.UndefOr[Callback[java.lang.String | Falsey]], 
      js.Promise[java.lang.String | js.Array[java.lang.String] | Falsey]
    ]
  ] = js.native
  /**
    * Invoked to retrieve a user using a username/password combination.
    *
    */
  def getUser(username: java.lang.String, password: java.lang.String): js.Promise[User | Falsey] = js.native
  def getUser(username: java.lang.String, password: java.lang.String, callback: Callback[User | Falsey]): js.Promise[User | Falsey] = js.native
}

