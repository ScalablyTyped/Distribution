package typings.nodemailer.libSmtpDashConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodemailer.nodemailerStrings.NEVER
  - typings.nodemailer.nodemailerStrings.SUCCESS
  - typings.nodemailer.nodemailerStrings.FAILURE
  - typings.nodemailer.nodemailerStrings.DELAY
*/
trait DSNOption extends js.Object

object DSNOption {
  @scala.inline
  def DELAY: typings.nodemailer.nodemailerStrings.DELAY = this.cast("DELAY")
  @scala.inline
  def FAILURE: typings.nodemailer.nodemailerStrings.FAILURE = this.cast("FAILURE")
  @scala.inline
  def NEVER: typings.nodemailer.nodemailerStrings.NEVER = this.cast("NEVER")
  @scala.inline
  def SUCCESS: typings.nodemailer.nodemailerStrings.SUCCESS = this.cast("SUCCESS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

