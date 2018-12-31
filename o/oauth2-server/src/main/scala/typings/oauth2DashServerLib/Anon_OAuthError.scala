package typings
package oauth2DashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OAuthError extends js.Object {
  var AbstractGrantType: org.scalablytyped.runtime.Instantiable1[
    /* options */ oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.TokenOptions, 
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AbstractGrantType
  ]
  var AccessDeniedError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AccessDeniedError]
  var InsufficientScopeError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InsufficientScopeError]
  var InvalidArgumentError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidArgumentError]
  var InvalidClientError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidClientError]
  var InvalidGrantError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidGrantError]
  var InvalidRequestError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidRequestError]
  var InvalidScopeError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidScopeError]
  var InvalidTokenError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidTokenError]
  var OAuthError: org.scalablytyped.runtime.Instantiable2[
    /* messageOrError */ java.lang.String | nodeLib.Error, 
    /* properties */ js.UndefOr[/* properties */ js.Object], 
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.OAuthError
  ]
  /**
    * Represents an incoming HTTP request.
    */
  var Request: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[
      /* options */ org.scalablytyped.runtime.StringDictionary[js.Any] | expressLib.expressMod.eNs.Request
    ], 
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Request
  ]
  /**
    * Represents an outgoing HTTP response.
    */
  var Response: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[
      /* options */ org.scalablytyped.runtime.StringDictionary[js.Any] | expressLib.expressMod.eNs.Response
    ], 
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Response
  ]
  var ServerError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.ServerError]
  var UnauthorizedClientError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.UnauthorizedClientError]
  var UnauthorizedRequestError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.UnauthorizedRequestError]
  var UnsupportedGrantTypeError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.UnsupportedGrantTypeError]
  var UnsupportedResponseTypeError: org.scalablytyped.runtime.Instantiable0[
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.UnsupportedResponseTypeError
  ]
}

