package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.home
  - typings.microsoftDashGraph.microsoftDashGraphStrings.business
  - typings.microsoftDashGraph.microsoftDashGraphStrings.other
*/
trait PhysicalAddressType extends js.Object

object PhysicalAddressType {
  @scala.inline
  def business: typings.microsoftDashGraph.microsoftDashGraphStrings.business = this.cast("business")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def home: typings.microsoftDashGraph.microsoftDashGraphStrings.home = this.cast("home")
  @scala.inline
  def other: typings.microsoftDashGraph.microsoftDashGraphStrings.other = this.cast("other")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

