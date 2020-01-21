package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.singleTenantApp
  - typings.microsoftGraph.microsoftGraphStrings.multiTenantApp
*/
trait DeviceManagementPartnerAppType extends js.Object

object DeviceManagementPartnerAppType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def multiTenantApp: typings.microsoftGraph.microsoftGraphStrings.multiTenantApp = this.cast("multiTenantApp")
  @scala.inline
  def singleTenantApp: typings.microsoftGraph.microsoftGraphStrings.singleTenantApp = this.cast("singleTenantApp")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

