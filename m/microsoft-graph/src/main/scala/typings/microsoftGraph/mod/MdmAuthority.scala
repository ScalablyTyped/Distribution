package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.intune
  - typings.microsoftGraph.microsoftGraphStrings.sccm
  - typings.microsoftGraph.microsoftGraphStrings.office365
*/
trait MdmAuthority extends js.Object

object MdmAuthority {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def intune: typings.microsoftGraph.microsoftGraphStrings.intune = this.cast("intune")
  @scala.inline
  def office365: typings.microsoftGraph.microsoftGraphStrings.office365 = this.cast("office365")
  @scala.inline
  def sccm: typings.microsoftGraph.microsoftGraphStrings.sccm = this.cast("sccm")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

