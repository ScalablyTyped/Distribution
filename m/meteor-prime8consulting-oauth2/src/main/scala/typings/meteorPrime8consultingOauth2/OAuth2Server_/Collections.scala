package typings.meteorPrime8consultingOauth2.OAuth2Server_

import typings.meteor.Mongo.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collections extends js.Object {
  /**
    * (server only) Collection of the access tokens.
    */
  var accessToken: Collection[AccessToken]
  /**
    * Collection of the authorization codes.
    */
  var authCode: Collection[AuthCode]
  /**
    * (server only) Collection of the clients authorized to use the oauth2 service.
    */
  var client: Collection[Client]
  /**
    * Collection of the refresh tokens.
    */
  var refreshToken: Collection[RefreshToken]
}

object Collections {
  @scala.inline
  def apply(
    accessToken: Collection[AccessToken],
    authCode: Collection[AuthCode],
    client: Collection[Client],
    refreshToken: Collection[RefreshToken]
  ): Collections = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], authCode = authCode.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collections]
  }
}

