package typings.oauth2orize

import typings.oauth2orize.mod.AuthorizationErrorCode
import typings.oauth2orize.mod.TokenErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauth2orizeStrings {
  
  @js.native
  sealed trait access_denied extends AuthorizationErrorCode
  @scala.inline
  def access_denied: access_denied = "access_denied".asInstanceOf[access_denied]
  
  @js.native
  sealed trait invalid_client extends TokenErrorCode
  @scala.inline
  def invalid_client: invalid_client = "invalid_client".asInstanceOf[invalid_client]
  
  @js.native
  sealed trait invalid_grant extends TokenErrorCode
  @scala.inline
  def invalid_grant: invalid_grant = "invalid_grant".asInstanceOf[invalid_grant]
  
  @js.native
  sealed trait invalid_request
    extends AuthorizationErrorCode
       with TokenErrorCode
  @scala.inline
  def invalid_request: invalid_request = "invalid_request".asInstanceOf[invalid_request]
  
  @js.native
  sealed trait invalid_scope
    extends AuthorizationErrorCode
       with TokenErrorCode
  @scala.inline
  def invalid_scope: invalid_scope = "invalid_scope".asInstanceOf[invalid_scope]
  
  @js.native
  sealed trait temporarily_unavailable extends AuthorizationErrorCode
  @scala.inline
  def temporarily_unavailable: temporarily_unavailable = "temporarily_unavailable".asInstanceOf[temporarily_unavailable]
  
  @js.native
  sealed trait unauthorized_client
    extends AuthorizationErrorCode
       with TokenErrorCode
  @scala.inline
  def unauthorized_client: unauthorized_client = "unauthorized_client".asInstanceOf[unauthorized_client]
  
  @js.native
  sealed trait unsupported_grant_type extends TokenErrorCode
  @scala.inline
  def unsupported_grant_type: unsupported_grant_type = "unsupported_grant_type".asInstanceOf[unsupported_grant_type]
  
  @js.native
  sealed trait unsupported_response_type extends AuthorizationErrorCode
  @scala.inline
  def unsupported_response_type: unsupported_response_type = "unsupported_response_type".asInstanceOf[unsupported_response_type]
}
