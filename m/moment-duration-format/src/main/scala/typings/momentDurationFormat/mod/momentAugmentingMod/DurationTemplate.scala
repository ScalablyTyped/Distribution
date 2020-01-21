package typings.momentDurationFormat.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.momentDurationFormat.momentDurationFormatStrings.HMS
  - typings.momentDurationFormat.momentDurationFormatStrings.HM
  - typings.momentDurationFormat.momentDurationFormatStrings.MS
*/
trait DurationTemplate extends js.Object

object DurationTemplate {
  @scala.inline
  def HM: typings.momentDurationFormat.momentDurationFormatStrings.HM = this.cast("HM")
  @scala.inline
  def HMS: typings.momentDurationFormat.momentDurationFormatStrings.HMS = this.cast("HMS")
  @scala.inline
  def MS: typings.momentDurationFormat.momentDurationFormatStrings.MS = this.cast("MS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

