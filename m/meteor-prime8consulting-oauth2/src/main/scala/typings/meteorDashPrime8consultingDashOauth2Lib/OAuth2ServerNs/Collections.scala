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

