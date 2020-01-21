package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.truePositive
  - typings.microsoftGraph.microsoftGraphStrings.falsePositive
  - typings.microsoftGraph.microsoftGraphStrings.benignPositive
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait AlertFeedback extends js.Object

object AlertFeedback {
  @scala.inline
  def benignPositive: typings.microsoftGraph.microsoftGraphStrings.benignPositive = this.cast("benignPositive")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def falsePositive: typings.microsoftGraph.microsoftGraphStrings.falsePositive = this.cast("falsePositive")
  @scala.inline
  def truePositive: typings.microsoftGraph.microsoftGraphStrings.truePositive = this.cast("truePositive")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

