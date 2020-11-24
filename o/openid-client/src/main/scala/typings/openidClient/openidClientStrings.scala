package typings.openidClient

import typings.openidClient.mod.ClientAuthMethod
import typings.openidClient.mod.ResponseType
import typings.openidClient.mod._TokenTypeHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openidClientStrings {
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @scala.inline
  def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @scala.inline
  def access_token: access_token = "access_token".asInstanceOf[access_token]
  
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  
  @scala.inline
  def client_secret_basic: client_secret_basic = "client_secret_basic".asInstanceOf[client_secret_basic]
  
  @scala.inline
  def client_secret_jwt: client_secret_jwt = "client_secret_jwt".asInstanceOf[client_secret_jwt]
  
  @scala.inline
  def client_secret_post: client_secret_post = "client_secret_post".asInstanceOf[client_secret_post]
  
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  
  @scala.inline
  def `code id_token`: `code id_token` = ("code id_token").asInstanceOf[`code id_token`]
  
  @scala.inline
  def `code id_token token`: `code id_token token` = ("code id_token token").asInstanceOf[`code id_token token`]
  
  @scala.inline
  def `code token`: `code token` = ("code token").asInstanceOf[`code token`]
  
  @scala.inline
  def header: header = "header".asInstanceOf[header]
  
  @scala.inline
  def id_token: id_token = "id_token".asInstanceOf[id_token]
  
  @scala.inline
  def `id_token token`: `id_token token` = ("id_token token").asInstanceOf[`id_token token`]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def private_key_jwt: private_key_jwt = "private_key_jwt".asInstanceOf[private_key_jwt]
  
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  
  @scala.inline
  def refresh_token: refresh_token = "refresh_token".asInstanceOf[refresh_token]
  
  @scala.inline
  def self_signed_tls_client_auth: self_signed_tls_client_auth = "self_signed_tls_client_auth".asInstanceOf[self_signed_tls_client_auth]
  
  @scala.inline
  def tls_client_auth: tls_client_auth = "tls_client_auth".asInstanceOf[tls_client_auth]
  
  @js.native
  sealed trait DELETE extends js.Object
  
  @js.native
  sealed trait GET extends js.Object
  
  @js.native
  sealed trait HEAD extends js.Object
  
  @js.native
  sealed trait OPTIONS extends js.Object
  
  @js.native
  sealed trait POST extends js.Object
  
  @js.native
  sealed trait PUT extends js.Object
  
  @js.native
  sealed trait TRACE extends js.Object
  
  @js.native
  sealed trait access_token extends _TokenTypeHint
  
  @js.native
  sealed trait body extends js.Object
  
  @js.native
  sealed trait client_secret_basic extends ClientAuthMethod
  
  @js.native
  sealed trait client_secret_jwt extends ClientAuthMethod
  
  @js.native
  sealed trait client_secret_post extends ClientAuthMethod
  
  @js.native
  sealed trait code extends ResponseType
  
  @js.native
  sealed trait `code id_token` extends ResponseType
  
  @js.native
  sealed trait `code id_token token` extends ResponseType
  
  @js.native
  sealed trait `code token` extends ResponseType
  
  @js.native
  sealed trait header extends js.Object
  
  @js.native
  sealed trait id_token extends ResponseType
  
  @js.native
  sealed trait `id_token token` extends ResponseType
  
  @js.native
  sealed trait none
    extends ClientAuthMethod
       with ResponseType
  
  @js.native
  sealed trait private_key_jwt extends ClientAuthMethod
  
  @js.native
  sealed trait query extends js.Object
  
  @js.native
  sealed trait refresh_token extends _TokenTypeHint
  
  @js.native
  sealed trait self_signed_tls_client_auth extends ClientAuthMethod
  
  @js.native
  sealed trait tls_client_auth extends ClientAuthMethod
}
