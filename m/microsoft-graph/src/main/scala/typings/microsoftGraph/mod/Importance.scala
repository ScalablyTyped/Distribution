package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.low
  - typings.microsoftGraph.microsoftGraphStrings.normal
  - typings.microsoftGraph.microsoftGraphStrings.high
*/
trait Importance extends js.Object

object Importance {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typings.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def normal: typings.microsoftGraph.microsoftGraphStrings.normal = this.cast("normal")
}

