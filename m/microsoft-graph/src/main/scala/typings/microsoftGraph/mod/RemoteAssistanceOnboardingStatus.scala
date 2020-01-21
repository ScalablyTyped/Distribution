package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notOnboarded
  - typings.microsoftGraph.microsoftGraphStrings.onboarding
  - typings.microsoftGraph.microsoftGraphStrings.onboarded
*/
trait RemoteAssistanceOnboardingStatus extends js.Object

object RemoteAssistanceOnboardingStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notOnboarded: typings.microsoftGraph.microsoftGraphStrings.notOnboarded = this.cast("notOnboarded")
  @scala.inline
  def onboarded: typings.microsoftGraph.microsoftGraphStrings.onboarded = this.cast("onboarded")
  @scala.inline
  def onboarding: typings.microsoftGraph.microsoftGraphStrings.onboarding = this.cast("onboarding")
}

