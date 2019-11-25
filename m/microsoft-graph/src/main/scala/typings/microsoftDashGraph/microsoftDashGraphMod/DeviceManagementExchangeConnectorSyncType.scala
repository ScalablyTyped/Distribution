package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.fullSync
  - typings.microsoftDashGraph.microsoftDashGraphStrings.deltaSync
*/
trait DeviceManagementExchangeConnectorSyncType extends js.Object

object DeviceManagementExchangeConnectorSyncType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deltaSync: typings.microsoftDashGraph.microsoftDashGraphStrings.deltaSync = this.cast("deltaSync")
  @scala.inline
  def fullSync: typings.microsoftDashGraph.microsoftDashGraphStrings.fullSync = this.cast("fullSync")
}

