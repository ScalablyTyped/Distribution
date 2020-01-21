package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.home
  - typings.microsoftGraph.microsoftGraphStrings.business
  - typings.microsoftGraph.microsoftGraphStrings.other
*/
trait PhysicalAddressType extends js.Object

object PhysicalAddressType {
  @scala.inline
  def business: typings.microsoftGraph.microsoftGraphStrings.business = this.cast("business")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def home: typings.microsoftGraph.microsoftGraphStrings.home = this.cast("home")
  @scala.inline
  def other: typings.microsoftGraph.microsoftGraphStrings.other = this.cast("other")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

