package typings.pAny.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<p-some.p-some.Options<ValueType>, 'count'> */
trait Options[ValueType] extends js.Object {
  var filter: js.UndefOr[js.Function1[/* value */ ValueType, Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply[ValueType](filter: /* value */ ValueType => Boolean = null): Options[ValueType] = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    __obj.asInstanceOf[Options[ValueType]]
  }
}

