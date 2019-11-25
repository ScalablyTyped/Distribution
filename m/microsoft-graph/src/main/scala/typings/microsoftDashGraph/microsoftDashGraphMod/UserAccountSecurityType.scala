package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.standard
  - typings.microsoftDashGraph.microsoftDashGraphStrings.power
  - typings.microsoftDashGraph.microsoftDashGraphStrings.administrator
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait UserAccountSecurityType extends js.Object

object UserAccountSecurityType {
  @scala.inline
  def administrator: typings.microsoftDashGraph.microsoftDashGraphStrings.administrator = this.cast("administrator")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def power: typings.microsoftDashGraph.microsoftDashGraphStrings.power = this.cast("power")
  @scala.inline
  def standard: typings.microsoftDashGraph.microsoftDashGraphStrings.standard = this.cast("standard")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

