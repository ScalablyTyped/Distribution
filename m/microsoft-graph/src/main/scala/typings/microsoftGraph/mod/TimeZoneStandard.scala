package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.windows
  - typings.microsoftGraph.microsoftGraphStrings.iana
*/
trait TimeZoneStandard extends js.Object

object TimeZoneStandard {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iana: typings.microsoftGraph.microsoftGraphStrings.iana = this.cast("iana")
  @scala.inline
  def windows: typings.microsoftGraph.microsoftGraphStrings.windows = this.cast("windows")
}

