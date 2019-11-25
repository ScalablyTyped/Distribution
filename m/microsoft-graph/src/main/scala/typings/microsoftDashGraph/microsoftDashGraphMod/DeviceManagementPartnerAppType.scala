package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.singleTenantApp
  - typings.microsoftDashGraph.microsoftDashGraphStrings.multiTenantApp
*/
trait DeviceManagementPartnerAppType extends js.Object

object DeviceManagementPartnerAppType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def multiTenantApp: typings.microsoftDashGraph.microsoftDashGraphStrings.multiTenantApp = this.cast("multiTenantApp")
  @scala.inline
  def singleTenantApp: typings.microsoftDashGraph.microsoftDashGraphStrings.singleTenantApp = this.cast("singleTenantApp")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

