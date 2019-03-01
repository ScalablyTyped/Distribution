package typings
package meteorDashPrime8consultingDashOauth2Lib.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collections extends js.Object {
  /**
    * (server only) Collection of the access tokens.
    */
  var accessToken: meteorLib.MongoNs.Collection[AccessToken]
  /**
    * Collection of the authorization codes.
    */
  var authCode: meteorLib.MongoNs.Collection[AuthCode]
  /**
    * (server only) Collection of the clients authorized to use the oauth2 service.
    */
  var client: meteorLib.MongoNs.Collection[Client]
  /**
    * Collection of the refresh tokens.
    */
  var refreshToken: meteorLib.MongoNs.Collection[RefreshToken]
}

object Collections {
  @scala.inline
  def apply(
    accessToken: meteorLib.MongoNs.Collection[AccessToken],
    authCode: meteorLib.MongoNs.Collection[AuthCode],
    client: meteorLib.MongoNs.Collection[Client],
    refreshToken: meteorLib.MongoNs.Collection[RefreshToken]
  ): Collections = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessToken")(accessToken)
    __obj.updateDynamic("authCode")(authCode)
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("refreshToken")(refreshToken)
    __obj.asInstanceOf[Collections]
  }
}

