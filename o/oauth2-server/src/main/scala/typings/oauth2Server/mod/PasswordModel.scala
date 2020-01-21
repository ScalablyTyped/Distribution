package typings.oauth2Server.mod

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
      /* scope */ String | js.Array[String], 
      /* callback */ js.UndefOr[Callback[String]], 
      js.Promise[String]
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
      /* scope */ String | js.Array[String], 
      /* callback */ js.UndefOr[Callback[String | Falsey]], 
      js.Promise[String | js.Array[String] | Falsey]
    ]
  ] = js.native
  /**
    * Invoked to retrieve a user using a username/password combination.
    *
    */
  def getUser(username: String, password: String): js.Promise[User | Falsey] = js.native
  def getUser(username: String, password: String, callback: Callback[User | Falsey]): js.Promise[User | Falsey] = js.native
}

