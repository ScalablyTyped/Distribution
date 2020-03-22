package typings.openfin.frameFrameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openfin.openfinStrings.window
  - typings.openfin.openfinStrings.iframe
  - typings.openfin.openfinStrings.`external connection`
  - typings.openfin.openfinStrings.view
  - typings.openfin.openfinStrings.unknown
*/
trait EntityType extends js.Object

object EntityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `external connection`: typings.openfin.openfinStrings.`external connection` = this.cast("external connection")
  @scala.inline
  def iframe: typings.openfin.openfinStrings.iframe = this.cast("iframe")
  @scala.inline
  def unknown: typings.openfin.openfinStrings.unknown = this.cast("unknown")
  @scala.inline
  def view: typings.openfin.openfinStrings.view = this.cast("view")
  @scala.inline
  def window: typings.openfin.openfinStrings.window = this.cast("window")
}

