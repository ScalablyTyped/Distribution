package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.deviceDefault
  - typings.microsoftDashGraph.microsoftDashGraphStrings.alphanumeric
  - typings.microsoftDashGraph.microsoftDashGraphStrings.numeric
*/
trait RequiredPasswordType extends js.Object

object RequiredPasswordType {
  @scala.inline
  def alphanumeric: typings.microsoftDashGraph.microsoftDashGraphStrings.alphanumeric = this.cast("alphanumeric")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typings.microsoftDashGraph.microsoftDashGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def numeric: typings.microsoftDashGraph.microsoftDashGraphStrings.numeric = this.cast("numeric")
}

