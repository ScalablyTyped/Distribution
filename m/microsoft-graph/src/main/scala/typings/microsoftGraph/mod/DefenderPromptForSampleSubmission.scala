package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.alwaysPrompt
  - typings.microsoftGraph.microsoftGraphStrings.promptBeforeSendingPersonalData
  - typings.microsoftGraph.microsoftGraphStrings.neverSendData
  - typings.microsoftGraph.microsoftGraphStrings.sendAllDataWithoutPrompting
*/
trait DefenderPromptForSampleSubmission extends js.Object

object DefenderPromptForSampleSubmission {
  @scala.inline
  def alwaysPrompt: typings.microsoftGraph.microsoftGraphStrings.alwaysPrompt = this.cast("alwaysPrompt")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def neverSendData: typings.microsoftGraph.microsoftGraphStrings.neverSendData = this.cast("neverSendData")
  @scala.inline
  def promptBeforeSendingPersonalData: typings.microsoftGraph.microsoftGraphStrings.promptBeforeSendingPersonalData = this.cast("promptBeforeSendingPersonalData")
  @scala.inline
  def sendAllDataWithoutPrompting: typings.microsoftGraph.microsoftGraphStrings.sendAllDataWithoutPrompting = this.cast("sendAllDataWithoutPrompting")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

