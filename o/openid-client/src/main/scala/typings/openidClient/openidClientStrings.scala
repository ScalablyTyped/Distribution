package typings.openidClient

import typings.openidClient.mod.ClientAuthMethod
import typings.openidClient.mod.ResponseType
import typings.openidClient.mod._TokenTypeHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openidClientStrings {
  
  @js.native
  sealed trait DELETE extends StObject
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET extends StObject
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD extends StObject
  inline def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait OPTIONS extends StObject
  inline def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait POST extends StObject
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT extends StObject
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait TRACE extends StObject
  inline def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @js.native
  sealed trait access_token
    extends StObject
       with _TokenTypeHint
  inline def access_token: access_token = "access_token".asInstanceOf[access_token]
  
  @js.native
  sealed trait body extends StObject
  inline def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait client_secret_basic
    extends StObject
       with ClientAuthMethod
  inline def client_secret_basic: client_secret_basic = "client_secret_basic".asInstanceOf[client_secret_basic]
  
  @js.native
  sealed trait client_secret_jwt
    extends StObject
       with ClientAuthMethod
  inline def client_secret_jwt: client_secret_jwt = "client_secret_jwt".asInstanceOf[client_secret_jwt]
  
  @js.native
  sealed trait client_secret_post
    extends StObject
       with ClientAuthMethod
  inline def client_secret_post: client_secret_post = "client_secret_post".asInstanceOf[client_secret_post]
  
  @js.native
  sealed trait code
    extends StObject
       with ResponseType
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait `code id_token`
    extends StObject
       with ResponseType
  inline def `code id_token`: `code id_token` = ("code id_token").asInstanceOf[`code id_token`]
  
  @js.native
  sealed trait `code id_token token`
    extends StObject
       with ResponseType
  inline def `code id_token token`: `code id_token token` = ("code id_token token").asInstanceOf[`code id_token token`]
  
  @js.native
  sealed trait `code token`
    extends StObject
       with ResponseType
  inline def `code token`: `code token` = ("code token").asInstanceOf[`code token`]
  
  @js.native
  sealed trait header extends StObject
  inline def header: header = "header".asInstanceOf[header]
  
  @js.native
  sealed trait id_token
    extends StObject
       with ResponseType
  inline def id_token: id_token = "id_token".asInstanceOf[id_token]
  
  @js.native
  sealed trait `id_token token`
    extends StObject
       with ResponseType
  inline def `id_token token`: `id_token token` = ("id_token token").asInstanceOf[`id_token token`]
  
  @js.native
  sealed trait none
    extends StObject
       with ClientAuthMethod
       with ResponseType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait private_key_jwt
    extends StObject
       with ClientAuthMethod
  inline def private_key_jwt: private_key_jwt = "private_key_jwt".asInstanceOf[private_key_jwt]
  
  @js.native
  sealed trait query extends StObject
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait refresh_token
    extends StObject
       with _TokenTypeHint
  inline def refresh_token: refresh_token = "refresh_token".asInstanceOf[refresh_token]
  
  @js.native
  sealed trait self_signed_tls_client_auth
    extends StObject
       with ClientAuthMethod
  inline def self_signed_tls_client_auth: self_signed_tls_client_auth = "self_signed_tls_client_auth".asInstanceOf[self_signed_tls_client_auth]
  
  @js.native
  sealed trait tls_client_auth
    extends StObject
       with ClientAuthMethod
  inline def tls_client_auth: tls_client_auth = "tls_client_auth".asInstanceOf[tls_client_auth]
}
