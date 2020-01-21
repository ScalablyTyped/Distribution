package typings.momentDurationFormat.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.momentDurationFormat.momentDurationFormatStrings.long
  - typings.momentDurationFormat.momentDurationFormatStrings.standard
  - typings.momentDurationFormat.momentDurationFormatStrings.short
*/
trait DurationLabelType extends js.Object

object DurationLabelType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def long: typings.momentDurationFormat.momentDurationFormatStrings.long = this.cast("long")
  @scala.inline
  def short: typings.momentDurationFormat.momentDurationFormatStrings.short = this.cast("short")
  @scala.inline
  def standard: typings.momentDurationFormat.momentDurationFormatStrings.standard = this.cast("standard")
}

