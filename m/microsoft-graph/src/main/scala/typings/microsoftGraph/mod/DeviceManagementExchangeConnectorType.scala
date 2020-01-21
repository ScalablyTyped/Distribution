package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.onPremises
  - typings.microsoftGraph.microsoftGraphStrings.hosted
  - typings.microsoftGraph.microsoftGraphStrings.serviceToService
  - typings.microsoftGraph.microsoftGraphStrings.dedicated
*/
trait DeviceManagementExchangeConnectorType extends js.Object

object DeviceManagementExchangeConnectorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dedicated: typings.microsoftGraph.microsoftGraphStrings.dedicated = this.cast("dedicated")
  @scala.inline
  def hosted: typings.microsoftGraph.microsoftGraphStrings.hosted = this.cast("hosted")
  @scala.inline
  def onPremises: typings.microsoftGraph.microsoftGraphStrings.onPremises = this.cast("onPremises")
  @scala.inline
  def serviceToService: typings.microsoftGraph.microsoftGraphStrings.serviceToService = this.cast("serviceToService")
}

