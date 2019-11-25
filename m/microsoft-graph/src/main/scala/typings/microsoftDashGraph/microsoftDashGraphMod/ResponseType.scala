package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.organizer
  - typings.microsoftDashGraph.microsoftDashGraphStrings.tentativelyAccepted
  - typings.microsoftDashGraph.microsoftDashGraphStrings.accepted
  - typings.microsoftDashGraph.microsoftDashGraphStrings.declined
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notResponded
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def accepted: typings.microsoftDashGraph.microsoftDashGraphStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def declined: typings.microsoftDashGraph.microsoftDashGraphStrings.declined = this.cast("declined")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def notResponded: typings.microsoftDashGraph.microsoftDashGraphStrings.notResponded = this.cast("notResponded")
  @scala.inline
  def organizer: typings.microsoftDashGraph.microsoftDashGraphStrings.organizer = this.cast("organizer")
  @scala.inline
  def tentativelyAccepted: typings.microsoftDashGraph.microsoftDashGraphStrings.tentativelyAccepted = this.cast("tentativelyAccepted")
}

