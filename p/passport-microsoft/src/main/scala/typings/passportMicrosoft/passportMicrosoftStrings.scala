package typings.passportMicrosoft

import typings.passportMicrosoft.mod.OptionalOptionParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object passportMicrosoftStrings {
  @js.native
  sealed trait authorizationURL extends OptionalOptionParameters
  
  @js.native
  sealed trait customHeaders extends OptionalOptionParameters
  
  @js.native
  sealed trait scopeSeparator extends OptionalOptionParameters
  
  @js.native
  sealed trait tokenURL extends OptionalOptionParameters
  
  @scala.inline
  def authorizationURL: authorizationURL = "authorizationURL".asInstanceOf[authorizationURL]
  @scala.inline
  def customHeaders: customHeaders = "customHeaders".asInstanceOf[customHeaders]
  @scala.inline
  def scopeSeparator: scopeSeparator = "scopeSeparator".asInstanceOf[scopeSeparator]
  @scala.inline
  def tokenURL: tokenURL = "tokenURL".asInstanceOf[tokenURL]
}

