package typings.openidClient

import typings.openidClient.mod.ClientAuthMethod
import typings.openidClient.mod.ResponseType
import typings.openidClient.mod._TokenTypeHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openidClientStrings {
  
  @js.native
  sealed trait DELETE extends StObject
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET extends StObject
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD extends StObject
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait OPTIONS extends StObject
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait POST extends StObject
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT extends StObject
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait TRACE extends StObject
  @scala.inline
  def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @js.native
  sealed trait access_token extends _TokenTypeHint
  @scala.inline
  def access_token: access_token = "access_token".asInstanceOf[access_token]
  
  @js.native
  sealed trait body extends StObject
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait client_secret_basic extends ClientAuthMethod
  @scala.inline
  def client_secret_basic: client_secret_basic = "client_secret_basic".asInstanceOf[client_secret_basic]
  
  @js.native
  sealed trait client_secret_jwt extends ClientAuthMethod
  @scala.inline
  def client_secret_jwt: client_secret_jwt = "client_secret_jwt".asInstanceOf[client_secret_jwt]
  
  @js.native
  sealed trait client_secret_post extends ClientAuthMethod
  @scala.inline
  def client_secret_post: client_secret_post = "client_secret_post".asInstanceOf[client_secret_post]
  
  @js.native
  sealed trait code extends ResponseType
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait `code id_token` extends ResponseType
  @scala.inline
  def `code id_token`: `code id_token` = ("code id_token").asInstanceOf[`code id_token`]
  
  @js.native
  sealed trait `code id_token token` extends ResponseType
  @scala.inline
  def `code id_token token`: `code id_token token` = ("code id_token token").asInstanceOf[`code id_token token`]
  
  @js.native
  sealed trait `code token` extends ResponseType
  @scala.inline
  def `code token`: `code token` = ("code token").asInstanceOf[`code token`]
  
  @js.native
  sealed trait header extends StObject
  @scala.inline
  def header: header = "header".asInstanceOf[header]
  
  @js.native
  sealed trait id_token extends ResponseType
  @scala.inline
  def id_token: id_token = "id_token".asInstanceOf[id_token]
  
  @js.native
  sealed trait `id_token token` extends ResponseType
  @scala.inline
  def `id_token token`: `id_token token` = ("id_token token").asInstanceOf[`id_token token`]
  
  @js.native
  sealed trait none
    extends ClientAuthMethod
       with ResponseType
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait private_key_jwt extends ClientAuthMethod
  @scala.inline
  def private_key_jwt: private_key_jwt = "private_key_jwt".asInstanceOf[private_key_jwt]
  
  @js.native
  sealed trait query extends StObject
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait refresh_token extends _TokenTypeHint
  @scala.inline
  def refresh_token: refresh_token = "refresh_token".asInstanceOf[refresh_token]
  
  @js.native
  sealed trait self_signed_tls_client_auth extends ClientAuthMethod
  @scala.inline
  def self_signed_tls_client_auth: self_signed_tls_client_auth = "self_signed_tls_client_auth".asInstanceOf[self_signed_tls_client_auth]
  
  @js.native
  sealed trait tls_client_auth extends ClientAuthMethod
  @scala.inline
  def tls_client_auth: tls_client_auth = "tls_client_auth".asInstanceOf[tls_client_auth]
}
