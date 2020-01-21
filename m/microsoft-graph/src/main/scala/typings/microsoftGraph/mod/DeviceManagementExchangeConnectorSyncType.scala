package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.fullSync
  - typings.microsoftGraph.microsoftGraphStrings.deltaSync
*/
trait DeviceManagementExchangeConnectorSyncType extends js.Object

object DeviceManagementExchangeConnectorSyncType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deltaSync: typings.microsoftGraph.microsoftGraphStrings.deltaSync = this.cast("deltaSync")
  @scala.inline
  def fullSync: typings.microsoftGraph.microsoftGraphStrings.fullSync = this.cast("fullSync")
}

