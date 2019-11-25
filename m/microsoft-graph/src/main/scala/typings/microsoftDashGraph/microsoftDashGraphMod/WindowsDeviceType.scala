package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.desktop
  - typings.microsoftDashGraph.microsoftDashGraphStrings.mobile
  - typings.microsoftDashGraph.microsoftDashGraphStrings.holographic
  - typings.microsoftDashGraph.microsoftDashGraphStrings.team
*/
trait WindowsDeviceType extends js.Object

object WindowsDeviceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desktop: typings.microsoftDashGraph.microsoftDashGraphStrings.desktop = this.cast("desktop")
  @scala.inline
  def holographic: typings.microsoftDashGraph.microsoftDashGraphStrings.holographic = this.cast("holographic")
  @scala.inline
  def mobile: typings.microsoftDashGraph.microsoftDashGraphStrings.mobile = this.cast("mobile")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def team: typings.microsoftDashGraph.microsoftDashGraphStrings.team = this.cast("team")
}

