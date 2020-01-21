package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.Owner
  - typings.microsoftGraph.microsoftGraphStrings.Contributor
  - typings.microsoftGraph.microsoftGraphStrings.Reader
  - typings.microsoftGraph.microsoftGraphStrings.None
*/
trait OnenoteUserRole extends js.Object

object OnenoteUserRole {
  @scala.inline
  def Contributor: typings.microsoftGraph.microsoftGraphStrings.Contributor = this.cast("Contributor")
  @scala.inline
  def None: typings.microsoftGraph.microsoftGraphStrings.None = this.cast("None")
  @scala.inline
  def Owner: typings.microsoftGraph.microsoftGraphStrings.Owner = this.cast("Owner")
  @scala.inline
  def Reader: typings.microsoftGraph.microsoftGraphStrings.Reader = this.cast("Reader")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

