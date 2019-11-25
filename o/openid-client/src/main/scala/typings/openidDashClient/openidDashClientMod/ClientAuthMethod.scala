package typings.openidDashClient.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openidDashClient.openidDashClientStrings.client_secret_basic
  - typings.openidDashClient.openidDashClientStrings.client_secret_post
  - typings.openidDashClient.openidDashClientStrings.client_secret_jwt
  - typings.openidDashClient.openidDashClientStrings.private_key_jwt
  - typings.openidDashClient.openidDashClientStrings.tls_client_auth
  - typings.openidDashClient.openidDashClientStrings.self_signed_tls_client_auth
  - typings.openidDashClient.openidDashClientStrings.none
*/
trait ClientAuthMethod extends js.Object

object ClientAuthMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def client_secret_basic: typings.openidDashClient.openidDashClientStrings.client_secret_basic = this.cast("client_secret_basic")
  @scala.inline
  def client_secret_jwt: typings.openidDashClient.openidDashClientStrings.client_secret_jwt = this.cast("client_secret_jwt")
  @scala.inline
  def client_secret_post: typings.openidDashClient.openidDashClientStrings.client_secret_post = this.cast("client_secret_post")
  @scala.inline
  def none: typings.openidDashClient.openidDashClientStrings.none = this.cast("none")
  @scala.inline
  def private_key_jwt: typings.openidDashClient.openidDashClientStrings.private_key_jwt = this.cast("private_key_jwt")
  @scala.inline
  def self_signed_tls_client_auth: typings.openidDashClient.openidDashClientStrings.self_signed_tls_client_auth = this.cast("self_signed_tls_client_auth")
  @scala.inline
  def tls_client_auth: typings.openidDashClient.openidDashClientStrings.tls_client_auth = this.cast("tls_client_auth")
}

