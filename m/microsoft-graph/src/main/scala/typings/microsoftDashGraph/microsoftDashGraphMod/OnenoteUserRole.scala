package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.Owner
  - typings.microsoftDashGraph.microsoftDashGraphStrings.Contributor
  - typings.microsoftDashGraph.microsoftDashGraphStrings.Reader
  - typings.microsoftDashGraph.microsoftDashGraphStrings.None
*/
trait OnenoteUserRole extends js.Object

object OnenoteUserRole {
  @scala.inline
  def Contributor: typings.microsoftDashGraph.microsoftDashGraphStrings.Contributor = this.cast("Contributor")
  @scala.inline
  def None: typings.microsoftDashGraph.microsoftDashGraphStrings.None = this.cast("None")
  @scala.inline
  def Owner: typings.microsoftDashGraph.microsoftDashGraphStrings.Owner = this.cast("Owner")
  @scala.inline
  def Reader: typings.microsoftDashGraph.microsoftDashGraphStrings.Reader = this.cast("Reader")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

