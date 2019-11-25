package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.low
  - typings.microsoftDashGraph.microsoftDashGraphStrings.normal
  - typings.microsoftDashGraph.microsoftDashGraphStrings.high
*/
trait Importance extends js.Object

object Importance {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.microsoftDashGraph.microsoftDashGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typings.microsoftDashGraph.microsoftDashGraphStrings.low = this.cast("low")
  @scala.inline
  def normal: typings.microsoftDashGraph.microsoftDashGraphStrings.normal = this.cast("normal")
}

