package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.onPremises
  - typings.microsoftDashGraph.microsoftDashGraphStrings.hosted
  - typings.microsoftDashGraph.microsoftDashGraphStrings.serviceToService
  - typings.microsoftDashGraph.microsoftDashGraphStrings.dedicated
*/
trait DeviceManagementExchangeConnectorType extends js.Object

object DeviceManagementExchangeConnectorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dedicated: typings.microsoftDashGraph.microsoftDashGraphStrings.dedicated = this.cast("dedicated")
  @scala.inline
  def hosted: typings.microsoftDashGraph.microsoftDashGraphStrings.hosted = this.cast("hosted")
  @scala.inline
  def onPremises: typings.microsoftDashGraph.microsoftDashGraphStrings.onPremises = this.cast("onPremises")
  @scala.inline
  def serviceToService: typings.microsoftDashGraph.microsoftDashGraphStrings.serviceToService = this.cast("serviceToService")
}

