package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.standard
  - typings.microsoftGraph.microsoftGraphStrings.power
  - typings.microsoftGraph.microsoftGraphStrings.administrator
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait UserAccountSecurityType extends js.Object

object UserAccountSecurityType {
  @scala.inline
  def administrator: typings.microsoftGraph.microsoftGraphStrings.administrator = this.cast("administrator")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def power: typings.microsoftGraph.microsoftGraphStrings.power = this.cast("power")
  @scala.inline
  def standard: typings.microsoftGraph.microsoftGraphStrings.standard = this.cast("standard")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

