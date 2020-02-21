package typings.passportMicrosoft.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The passport-microsoft library provides defaults for these fields, so they become optional
// when calling the constructor. (No need to export this).
/* Rewritten from type alias, can be one of: 
  - typings.passportMicrosoft.passportMicrosoftStrings.authorizationURL
  - typings.passportMicrosoft.passportMicrosoftStrings.tokenURL
  - typings.passportMicrosoft.passportMicrosoftStrings.scopeSeparator
  - typings.passportMicrosoft.passportMicrosoftStrings.customHeaders
*/
trait OptionalOptionParameters extends js.Object

object OptionalOptionParameters {
  @scala.inline
  def authorizationURL: typings.passportMicrosoft.passportMicrosoftStrings.authorizationURL = this.cast("authorizationURL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def customHeaders: typings.passportMicrosoft.passportMicrosoftStrings.customHeaders = this.cast("customHeaders")
  @scala.inline
  def scopeSeparator: typings.passportMicrosoft.passportMicrosoftStrings.scopeSeparator = this.cast("scopeSeparator")
  @scala.inline
  def tokenURL: typings.passportMicrosoft.passportMicrosoftStrings.tokenURL = this.cast("tokenURL")
}

