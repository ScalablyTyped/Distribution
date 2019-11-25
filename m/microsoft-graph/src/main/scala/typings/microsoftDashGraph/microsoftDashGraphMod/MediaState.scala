package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.active
  - typings.microsoftDashGraph.microsoftDashGraphStrings.inactive
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait MediaState extends js.Object

object MediaState {
  @scala.inline
  def active: typings.microsoftDashGraph.microsoftDashGraphStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typings.microsoftDashGraph.microsoftDashGraphStrings.inactive = this.cast("inactive")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

