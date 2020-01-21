package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.eas
  - typings.microsoftGraph.microsoftGraphStrings.mdm
  - typings.microsoftGraph.microsoftGraphStrings.easMdm
  - typings.microsoftGraph.microsoftGraphStrings.intuneClient
  - typings.microsoftGraph.microsoftGraphStrings.easIntuneClient
  - typings.microsoftGraph.microsoftGraphStrings.configurationManagerClient
  - typings.microsoftGraph.microsoftGraphStrings.configurationManagerClientMdm
  - typings.microsoftGraph.microsoftGraphStrings.configurationManagerClientMdmEas
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.jamf
  - typings.microsoftGraph.microsoftGraphStrings.googleCloudDevicePolicyController
*/
trait ManagementAgentType extends js.Object

object ManagementAgentType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def configurationManagerClient: typings.microsoftGraph.microsoftGraphStrings.configurationManagerClient = this.cast("configurationManagerClient")
  @scala.inline
  def configurationManagerClientMdm: typings.microsoftGraph.microsoftGraphStrings.configurationManagerClientMdm = this.cast("configurationManagerClientMdm")
  @scala.inline
  def configurationManagerClientMdmEas: typings.microsoftGraph.microsoftGraphStrings.configurationManagerClientMdmEas = this.cast("configurationManagerClientMdmEas")
  @scala.inline
  def eas: typings.microsoftGraph.microsoftGraphStrings.eas = this.cast("eas")
  @scala.inline
  def easIntuneClient: typings.microsoftGraph.microsoftGraphStrings.easIntuneClient = this.cast("easIntuneClient")
  @scala.inline
  def easMdm: typings.microsoftGraph.microsoftGraphStrings.easMdm = this.cast("easMdm")
  @scala.inline
  def googleCloudDevicePolicyController: typings.microsoftGraph.microsoftGraphStrings.googleCloudDevicePolicyController = this.cast("googleCloudDevicePolicyController")
  @scala.inline
  def intuneClient: typings.microsoftGraph.microsoftGraphStrings.intuneClient = this.cast("intuneClient")
  @scala.inline
  def jamf: typings.microsoftGraph.microsoftGraphStrings.jamf = this.cast("jamf")
  @scala.inline
  def mdm: typings.microsoftGraph.microsoftGraphStrings.mdm = this.cast("mdm")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

