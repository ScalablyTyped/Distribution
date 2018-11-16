package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseModel extends js.Object {
  /**
           * Invoked to generate a new access token.
           *
           */
  var generateAccessToken: js.UndefOr[
    js.Function4[
      /* client */ Client, 
      /* user */ User, 
      /* scope */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ js.UndefOr[Callback[java.lang.String]], 
      stdLib.Promise[java.lang.String]
    ]
  ] = js.native
  /**
           * Invoked to retrieve a client using a client id or a client id/client secret combination, depending on the grant type.
           *
           */
  def getClient(clientId: java.lang.String, clientSecret: java.lang.String): stdLib.Promise[Client | Falsey] = js.native
  /**
           * Invoked to retrieve a client using a client id or a client id/client secret combination, depending on the grant type.
           *
           */
  def getClient(clientId: java.lang.String, clientSecret: java.lang.String, callback: Callback[Client | Falsey]): stdLib.Promise[Client | Falsey] = js.native
  /**
           * Invoked to save an access token and optionally a refresh token, depending on the grant type.
           *
           */
  def saveToken(token: Token, client: Client, user: User): stdLib.Promise[Token | Falsey] = js.native
  /**
           * Invoked to save an access token and optionally a refresh token, depending on the grant type.
           *
           */
  def saveToken(token: Token, client: Client, user: User, callback: Callback[Token]): stdLib.Promise[Token | Falsey] = js.native
}

