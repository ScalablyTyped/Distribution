package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.normal
  - typings.microsoftDashGraph.microsoftDashGraphStrings.personal
  - typings.microsoftDashGraph.microsoftDashGraphStrings.`private`
  - typings.microsoftDashGraph.microsoftDashGraphStrings.confidential
*/
trait Sensitivity extends js.Object

object Sensitivity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confidential: typings.microsoftDashGraph.microsoftDashGraphStrings.confidential = this.cast("confidential")
  @scala.inline
  def normal: typings.microsoftDashGraph.microsoftDashGraphStrings.normal = this.cast("normal")
  @scala.inline
  def personal: typings.microsoftDashGraph.microsoftDashGraphStrings.personal = this.cast("personal")
  @scala.inline
  def `private`: typings.microsoftDashGraph.microsoftDashGraphStrings.`private` = this.cast("private")
}

