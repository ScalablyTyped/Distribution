package typings.momentRange.mod.momentAugmentingMod

import typings.momentRange.mod.DateRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Moment extends js.Object {
  def isRange(range: js.Any): Boolean
  def within(range: DateRange): Boolean
}

object Moment {
  @scala.inline
  def apply(isRange: js.Any => Boolean, within: DateRange => Boolean): Moment = {
    val __obj = js.Dynamic.literal(isRange = js.Any.fromFunction1(isRange), within = js.Any.fromFunction1(within))
    __obj.asInstanceOf[Moment]
  }
}

