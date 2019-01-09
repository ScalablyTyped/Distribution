package typings
package oauth2DashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AbstractGrantType
  extends org.scalablytyped.runtime.Instantiable1[
      /* options */ oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.ServerOptions, 
      oauth2DashServerLib.oauth2DashServerMod.OAuth2Server
    ] {
  var AbstractGrantType: org.scalablytyped.runtime.Instantiable1[
    /* options */ oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.TokenOptions, 
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AbstractGrantType
  ] = js.native
  var AccessDeniedError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AccessDeniedError] = js.native
  var InsufficientScopeError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InsufficientScopeError] = js.native
  var InvalidArgumentError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidArgumentError] = js.native
  var InvalidClientError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidClientError] = js.native
  var InvalidGrantError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidGrantError] = js.native
  var InvalidRequestError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidRequestError] = js.native
  var InvalidScopeError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidScopeError] = js.native
  var InvalidTokenError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.InvalidTokenError] = js.native
  var OAuthError: org.scalablytyped.runtime.Instantiable2[
    /* messageOrError */ java.lang.String | nodeLib.Error, 
    /* properties */ js.UndefOr[/* properties */ js.Object], 
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.OAuthError
  ] = js.native
  /**
    * Represents an incoming HTTP request.
    */
  var Request: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[
      /* options */ org.scalablytyped.runtime.StringDictionary[js.Any] | expressLib.expressMod.eNs.Request
    ], 
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Request
  ] = js.native
  /**
    * Represents an outgoing HTTP response.
    */
  var Response: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[
      /* options */ org.scalablytyped.runtime.StringDictionary[js.Any] | expressLib.expressMod.eNs.Response
    ], 
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Response
  ] = js.native
  var ServerError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.ServerError] = js.native
  var UnauthorizedClientError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.UnauthorizedClientError] = js.native
  var UnauthorizedRequestError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.UnauthorizedRequestError] = js.native
  var UnsupportedGrantTypeError: org.scalablytyped.runtime.Instantiable0[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.UnsupportedGrantTypeError] = js.native
  var UnsupportedResponseTypeError: org.scalablytyped.runtime.Instantiable0[
    oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.UnsupportedResponseTypeError
  ] = js.native
}

