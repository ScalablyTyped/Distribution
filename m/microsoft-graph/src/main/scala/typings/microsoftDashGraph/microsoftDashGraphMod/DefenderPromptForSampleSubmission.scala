package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined
  - typings.microsoftDashGraph.microsoftDashGraphStrings.alwaysPrompt
  - typings.microsoftDashGraph.microsoftDashGraphStrings.promptBeforeSendingPersonalData
  - typings.microsoftDashGraph.microsoftDashGraphStrings.neverSendData
  - typings.microsoftDashGraph.microsoftDashGraphStrings.sendAllDataWithoutPrompting
*/
trait DefenderPromptForSampleSubmission extends js.Object

object DefenderPromptForSampleSubmission {
  @scala.inline
  def alwaysPrompt: typings.microsoftDashGraph.microsoftDashGraphStrings.alwaysPrompt = this.cast("alwaysPrompt")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def neverSendData: typings.microsoftDashGraph.microsoftDashGraphStrings.neverSendData = this.cast("neverSendData")
  @scala.inline
  def promptBeforeSendingPersonalData: typings.microsoftDashGraph.microsoftDashGraphStrings.promptBeforeSendingPersonalData = this.cast("promptBeforeSendingPersonalData")
  @scala.inline
  def sendAllDataWithoutPrompting: typings.microsoftDashGraph.microsoftDashGraphStrings.sendAllDataWithoutPrompting = this.cast("sendAllDataWithoutPrompting")
  @scala.inline
  def userDefined: typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined = this.cast("userDefined")
}

