package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.truePositive
  - typings.microsoftDashGraph.microsoftDashGraphStrings.falsePositive
  - typings.microsoftDashGraph.microsoftDashGraphStrings.benignPositive
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait AlertFeedback extends js.Object

object AlertFeedback {
  @scala.inline
  def benignPositive: typings.microsoftDashGraph.microsoftDashGraphStrings.benignPositive = this.cast("benignPositive")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def falsePositive: typings.microsoftDashGraph.microsoftDashGraphStrings.falsePositive = this.cast("falsePositive")
  @scala.inline
  def truePositive: typings.microsoftDashGraph.microsoftDashGraphStrings.truePositive = this.cast("truePositive")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

