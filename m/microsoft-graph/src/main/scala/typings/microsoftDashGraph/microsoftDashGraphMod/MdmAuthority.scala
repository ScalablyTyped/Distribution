package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.intune
  - typings.microsoftDashGraph.microsoftDashGraphStrings.sccm
  - typings.microsoftDashGraph.microsoftDashGraphStrings.office365
*/
trait MdmAuthority extends js.Object

object MdmAuthority {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def intune: typings.microsoftDashGraph.microsoftDashGraphStrings.intune = this.cast("intune")
  @scala.inline
  def office365: typings.microsoftDashGraph.microsoftDashGraphStrings.office365 = this.cast("office365")
  @scala.inline
  def sccm: typings.microsoftDashGraph.microsoftDashGraphStrings.sccm = this.cast("sccm")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

