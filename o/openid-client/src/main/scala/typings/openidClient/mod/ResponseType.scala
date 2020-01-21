package typings.openidClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openidClient.openidClientStrings.code
  - typings.openidClient.openidClientStrings.id_token
  - typings.openidClient.openidClientStrings.`code id_token`
  - typings.openidClient.openidClientStrings.`id_token token`
  - typings.openidClient.openidClientStrings.`code token`
  - typings.openidClient.openidClientStrings.`code id_token token`
  - typings.openidClient.openidClientStrings.none
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typings.openidClient.openidClientStrings.code = this.cast("code")
  @scala.inline
  def `code id_token`: typings.openidClient.openidClientStrings.`code id_token` = this.cast("code id_token")
  @scala.inline
  def `code id_token token`: typings.openidClient.openidClientStrings.`code id_token token` = this.cast("code id_token token")
  @scala.inline
  def `code token`: typings.openidClient.openidClientStrings.`code token` = this.cast("code token")
  @scala.inline
  def id_token: typings.openidClient.openidClientStrings.id_token = this.cast("id_token")
  @scala.inline
  def `id_token token`: typings.openidClient.openidClientStrings.`id_token token` = this.cast("id_token token")
  @scala.inline
  def none: typings.openidClient.openidClientStrings.none = this.cast("none")
}

