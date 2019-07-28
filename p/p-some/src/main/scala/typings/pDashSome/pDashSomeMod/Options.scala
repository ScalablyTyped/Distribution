package typings.pDashSome.pDashSomeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  /**
  		Number of promises from `input` that have to be fulfilled until the returned promise is fulfilled. Minimum: `1`.
  		*/
  val count: Double
  /**
  		Used to filter out values that don't satisfy a condition.
  		@param value - The value resolved by the promise.
  		*/
  val filter: js.UndefOr[js.Function1[/* value */ T, Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](count: Double, filter: /* value */ T => Boolean = null): Options[T] = {
    val __obj = js.Dynamic.literal(count = count)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    __obj.asInstanceOf[Options[T]]
  }
}

