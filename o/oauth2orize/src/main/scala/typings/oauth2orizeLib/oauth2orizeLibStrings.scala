package typings
package oauth2orizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object oauth2orizeLibStrings {
  @js.native
  sealed trait access_denied
    extends oauth2orizeLib.oauth2orizeMod.AuthorizationErrorCode
  
  @js.native
  sealed trait invalid_client
    extends oauth2orizeLib.oauth2orizeMod.TokenErrorCode
  
  @js.native
  sealed trait invalid_grant
    extends oauth2orizeLib.oauth2orizeMod.TokenErrorCode
  
  @js.native
  sealed trait invalid_request
    extends oauth2orizeLib.oauth2orizeMod.AuthorizationErrorCode
       with oauth2orizeLib.oauth2orizeMod.TokenErrorCode
  
  @js.native
  sealed trait invalid_scope
    extends oauth2orizeLib.oauth2orizeMod.AuthorizationErrorCode
       with oauth2orizeLib.oauth2orizeMod.TokenErrorCode
  
  @js.native
  sealed trait temporarily_unavailable
    extends oauth2orizeLib.oauth2orizeMod.AuthorizationErrorCode
  
  @js.native
  sealed trait unauthorized_client
    extends oauth2orizeLib.oauth2orizeMod.AuthorizationErrorCode
       with oauth2orizeLib.oauth2orizeMod.TokenErrorCode
  
  @js.native
  sealed trait unsupported_grant_type
    extends oauth2orizeLib.oauth2orizeMod.TokenErrorCode
  
  @js.native
  sealed trait unsupported_response_type
    extends oauth2orizeLib.oauth2orizeMod.AuthorizationErrorCode
  
  @scala.inline
  def access_denied: access_denied = "access_denied".asInstanceOf[access_denied]
  @scala.inline
  def invalid_client: invalid_client = "invalid_client".asInstanceOf[invalid_client]
  @scala.inline
  def invalid_grant: invalid_grant = "invalid_grant".asInstanceOf[invalid_grant]
  @scala.inline
  def invalid_request: invalid_request = "invalid_request".asInstanceOf[invalid_request]
  @scala.inline
  def invalid_scope: invalid_scope = "invalid_scope".asInstanceOf[invalid_scope]
  @scala.inline
  def temporarily_unavailable: temporarily_unavailable = "temporarily_unavailable".asInstanceOf[temporarily_unavailable]
  @scala.inline
  def unauthorized_client: unauthorized_client = "unauthorized_client".asInstanceOf[unauthorized_client]
  @scala.inline
  def unsupported_grant_type: unsupported_grant_type = "unsupported_grant_type".asInstanceOf[unsupported_grant_type]
  @scala.inline
  def unsupported_response_type: unsupported_response_type = "unsupported_response_type".asInstanceOf[unsupported_response_type]
}

