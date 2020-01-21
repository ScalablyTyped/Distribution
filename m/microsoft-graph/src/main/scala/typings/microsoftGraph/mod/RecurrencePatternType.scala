package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.daily
  - typings.microsoftGraph.microsoftGraphStrings.weekly
  - typings.microsoftGraph.microsoftGraphStrings.absoluteMonthly
  - typings.microsoftGraph.microsoftGraphStrings.relativeMonthly
  - typings.microsoftGraph.microsoftGraphStrings.absoluteYearly
  - typings.microsoftGraph.microsoftGraphStrings.relativeYearly
*/
trait RecurrencePatternType extends js.Object

object RecurrencePatternType {
  @scala.inline
  def absoluteMonthly: typings.microsoftGraph.microsoftGraphStrings.absoluteMonthly = this.cast("absoluteMonthly")
  @scala.inline
  def absoluteYearly: typings.microsoftGraph.microsoftGraphStrings.absoluteYearly = this.cast("absoluteYearly")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def daily: typings.microsoftGraph.microsoftGraphStrings.daily = this.cast("daily")
  @scala.inline
  def relativeMonthly: typings.microsoftGraph.microsoftGraphStrings.relativeMonthly = this.cast("relativeMonthly")
  @scala.inline
  def relativeYearly: typings.microsoftGraph.microsoftGraphStrings.relativeYearly = this.cast("relativeYearly")
  @scala.inline
  def weekly: typings.microsoftGraph.microsoftGraphStrings.weekly = this.cast("weekly")
}

