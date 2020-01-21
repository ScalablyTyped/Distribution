package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.work
  - typings.microsoftGraph.microsoftGraphStrings.personal
  - typings.microsoftGraph.microsoftGraphStrings.unrestricted
*/
trait ActivityDomain extends js.Object

object ActivityDomain {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def personal: typings.microsoftGraph.microsoftGraphStrings.personal = this.cast("personal")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unrestricted: typings.microsoftGraph.microsoftGraphStrings.unrestricted = this.cast("unrestricted")
  @scala.inline
  def work: typings.microsoftGraph.microsoftGraphStrings.work = this.cast("work")
}

