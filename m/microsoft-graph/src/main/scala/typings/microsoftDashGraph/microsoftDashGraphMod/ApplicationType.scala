package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.universal
  - typings.microsoftDashGraph.microsoftDashGraphStrings.desktop
*/
trait ApplicationType extends js.Object

object ApplicationType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desktop: typings.microsoftDashGraph.microsoftDashGraphStrings.desktop = this.cast("desktop")
  @scala.inline
  def universal: typings.microsoftDashGraph.microsoftDashGraphStrings.universal = this.cast("universal")
}

