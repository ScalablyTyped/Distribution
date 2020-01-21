package typings.nivoCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nivoCore.nivoCoreStrings.ascending
  - typings.nivoCore.nivoCoreStrings.descending
  - typings.nivoCore.nivoCoreStrings.insideOut
  - typings.nivoCore.nivoCoreStrings.none
  - typings.nivoCore.nivoCoreStrings.reverse
*/
trait StackOrder extends js.Object

object StackOrder {
  @scala.inline
  def ascending: typings.nivoCore.nivoCoreStrings.ascending = this.cast("ascending")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def descending: typings.nivoCore.nivoCoreStrings.descending = this.cast("descending")
  @scala.inline
  def insideOut: typings.nivoCore.nivoCoreStrings.insideOut = this.cast("insideOut")
  @scala.inline
  def none: typings.nivoCore.nivoCoreStrings.none = this.cast("none")
  @scala.inline
  def reverse: typings.nivoCore.nivoCoreStrings.reverse = this.cast("reverse")
}

