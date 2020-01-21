package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.moderate
  - typings.microsoftGraph.microsoftGraphStrings.strict
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait GiphyRatingType extends js.Object

object GiphyRatingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def moderate: typings.microsoftGraph.microsoftGraphStrings.moderate = this.cast("moderate")
  @scala.inline
  def strict: typings.microsoftGraph.microsoftGraphStrings.strict = this.cast("strict")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

