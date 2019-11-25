package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.incoming
  - typings.microsoftDashGraph.microsoftDashGraphStrings.outgoing
*/
trait CallDirection extends js.Object

object CallDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incoming: typings.microsoftDashGraph.microsoftDashGraphStrings.incoming = this.cast("incoming")
  @scala.inline
  def outgoing: typings.microsoftDashGraph.microsoftDashGraphStrings.outgoing = this.cast("outgoing")
}

