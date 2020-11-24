package typings.passportMicrosoft.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def authorizationURL: typings.passportMicrosoft.passportMicrosoftStrings.authorizationURL = "authorizationURL".asInstanceOf[typings.passportMicrosoft.passportMicrosoftStrings.authorizationURL]
  
  @scala.inline
  def customHeaders: typings.passportMicrosoft.passportMicrosoftStrings.customHeaders = "customHeaders".asInstanceOf[typings.passportMicrosoft.passportMicrosoftStrings.customHeaders]
  
  @scala.inline
  def scopeSeparator: typings.passportMicrosoft.passportMicrosoftStrings.scopeSeparator = "scopeSeparator".asInstanceOf[typings.passportMicrosoft.passportMicrosoftStrings.scopeSeparator]
  
  @scala.inline
  def tokenURL: typings.passportMicrosoft.passportMicrosoftStrings.tokenURL = "tokenURL".asInstanceOf[typings.passportMicrosoft.passportMicrosoftStrings.tokenURL]
}
