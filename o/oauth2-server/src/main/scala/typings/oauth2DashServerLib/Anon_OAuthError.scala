package typings
package oauth2DashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_OAuthError extends js.Object {
  var AbstractGrantType: ScalablyTyped.runtime.Instantiable1[
    /* options */ oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.TokenOptions, 
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AbstractGrantType
  ]
  var AccessDeniedError: ScalablyTyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AccessDeniedError]
  var InsufficientScopeError: ScalablyTyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InsufficientScopeError]
  var InvalidArgumentError: ScalablyTyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidArgumentError]
  var InvalidClientError: ScalablyTyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidClientError]
  var InvalidGrantError: ScalablyTyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidGrantError]
  var InvalidRequestError: ScalablyTyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidRequestError]
  var InvalidScopeError: ScalablyTyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidScopeError]
  var InvalidTokenError: ScalablyTyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidTokenError]
  var OAuthError: ScalablyTyped.runtime.Instantiable2[
    /* messageOrError */ java.lang.String | nodeLib.Error, 
    /* properties */ js.UndefOr[/* properties */ js.Object], 
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.OAuthError
  ]
  /**
       * Represents an incoming HTTP request.
       */
  var Request: ScalablyTyped.runtime.Instantiable1[
    /* options */ js.UndefOr[
      /* options */ ScalablyTyped.runtime.StringDictionary[js.Any] | expressLib.expressMod.eNs.Request
    ], 
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Request
  ]
  /**
       * Represents an outgoing HTTP response.
       */
  var Response: ScalablyTyped.runtime.Instantiable1[
    /* options */ js.UndefOr[
      /* options */ ScalablyTyped.runtime.StringDictionary[js.Any] | expressLib.expressMod.eNs.Response
    ], 
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Response
  ]
  var ServerError: ScalablyTyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.ServerError]
  var UnauthorizedClientError: ScalablyTyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.UnauthorizedClientError]
  var UnauthorizedRequestError: ScalablyTyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.UnauthorizedRequestError]
  var UnsupportedGrantTypeError: ScalablyTyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.UnsupportedGrantTypeError]
  var UnsupportedResponseTypeError: ScalablyTyped.runtime.Instantiable0[
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.UnsupportedResponseTypeError
  ]
}

