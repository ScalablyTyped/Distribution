package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.desktop
  - typings.microsoftGraph.microsoftGraphStrings.mobile
  - typings.microsoftGraph.microsoftGraphStrings.holographic
  - typings.microsoftGraph.microsoftGraphStrings.team
*/
trait WindowsDeviceType extends js.Object

object WindowsDeviceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desktop: typings.microsoftGraph.microsoftGraphStrings.desktop = this.cast("desktop")
  @scala.inline
  def holographic: typings.microsoftGraph.microsoftGraphStrings.holographic = this.cast("holographic")
  @scala.inline
  def mobile: typings.microsoftGraph.microsoftGraphStrings.mobile = this.cast("mobile")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def team: typings.microsoftGraph.microsoftGraphStrings.team = this.cast("team")
}

