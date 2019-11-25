package typings.openidDashClient.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openidDashClient.openidDashClientStrings.code
  - typings.openidDashClient.openidDashClientStrings.id_token
  - typings.openidDashClient.openidDashClientStrings.`code id_token`
  - typings.openidDashClient.openidDashClientStrings.`code token`
  - typings.openidDashClient.openidDashClientStrings.`code id_token token`
  - typings.openidDashClient.openidDashClientStrings.none
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typings.openidDashClient.openidDashClientStrings.code = this.cast("code")
  @scala.inline
  def `code id_token`: typings.openidDashClient.openidDashClientStrings.`code id_token` = this.cast("code id_token")
  @scala.inline
  def `code id_token token`: typings.openidDashClient.openidDashClientStrings.`code id_token token` = this.cast("code id_token token")
  @scala.inline
  def `code token`: typings.openidDashClient.openidDashClientStrings.`code token` = this.cast("code token")
  @scala.inline
  def id_token: typings.openidDashClient.openidDashClientStrings.id_token = this.cast("id_token")
  @scala.inline
  def none: typings.openidDashClient.openidDashClientStrings.none = this.cast("none")
}

