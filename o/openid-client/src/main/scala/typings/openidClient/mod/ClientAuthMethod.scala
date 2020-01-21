package typings.openidClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openidClient.openidClientStrings.client_secret_basic
  - typings.openidClient.openidClientStrings.client_secret_post
  - typings.openidClient.openidClientStrings.client_secret_jwt
  - typings.openidClient.openidClientStrings.private_key_jwt
  - typings.openidClient.openidClientStrings.tls_client_auth
  - typings.openidClient.openidClientStrings.self_signed_tls_client_auth
  - typings.openidClient.openidClientStrings.none
*/
trait ClientAuthMethod extends js.Object

object ClientAuthMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def client_secret_basic: typings.openidClient.openidClientStrings.client_secret_basic = this.cast("client_secret_basic")
  @scala.inline
  def client_secret_jwt: typings.openidClient.openidClientStrings.client_secret_jwt = this.cast("client_secret_jwt")
  @scala.inline
  def client_secret_post: typings.openidClient.openidClientStrings.client_secret_post = this.cast("client_secret_post")
  @scala.inline
  def none: typings.openidClient.openidClientStrings.none = this.cast("none")
  @scala.inline
  def private_key_jwt: typings.openidClient.openidClientStrings.private_key_jwt = this.cast("private_key_jwt")
  @scala.inline
  def self_signed_tls_client_auth: typings.openidClient.openidClientStrings.self_signed_tls_client_auth = this.cast("self_signed_tls_client_auth")
  @scala.inline
  def tls_client_auth: typings.openidClient.openidClientStrings.tls_client_auth = this.cast("tls_client_auth")
}

