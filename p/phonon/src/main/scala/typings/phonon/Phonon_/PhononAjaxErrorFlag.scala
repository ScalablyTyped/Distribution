package typings.phonon.Phonon_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Ajax ***/
/* Rewritten from type alias, can be one of: 
  - typings.phonon.phononStrings.NO_INTERNET_ACCESS
  - typings.phonon.phononStrings.TIMEOUT_EXCEEDED
  - typings.phonon.phononStrings.XMLHTTPREQUEST_UNAVAILABLE
  - typings.phonon.phononStrings.JSON_MALFORMED
  - typings.phonon.phononStrings.REQUEST_CANCELED
*/
trait PhononAjaxErrorFlag extends js.Object

object PhononAjaxErrorFlag {
  @scala.inline
  def JSON_MALFORMED: typings.phonon.phononStrings.JSON_MALFORMED = this.cast("JSON_MALFORMED")
  @scala.inline
  def NO_INTERNET_ACCESS: typings.phonon.phononStrings.NO_INTERNET_ACCESS = this.cast("NO_INTERNET_ACCESS")
  @scala.inline
  def REQUEST_CANCELED: typings.phonon.phononStrings.REQUEST_CANCELED = this.cast("REQUEST_CANCELED")
  @scala.inline
  def TIMEOUT_EXCEEDED: typings.phonon.phononStrings.TIMEOUT_EXCEEDED = this.cast("TIMEOUT_EXCEEDED")
  @scala.inline
  def XMLHTTPREQUEST_UNAVAILABLE: typings.phonon.phononStrings.XMLHTTPREQUEST_UNAVAILABLE = this.cast("XMLHTTPREQUEST_UNAVAILABLE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

