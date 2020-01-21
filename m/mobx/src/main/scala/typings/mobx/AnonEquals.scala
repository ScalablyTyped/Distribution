package typings.mobx

import typings.mobx.comparerMod.IEqualsComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEquals extends js.Object {
  @JSName("equals")
  var equals_FAnonEquals: js.UndefOr[IEqualsComparer[_]] = js.undefined
  var fireImmediately: js.UndefOr[Boolean] = js.undefined
}

object AnonEquals {
  @scala.inline
  def apply(equals: (_, _) => Boolean = null, fireImmediately: js.UndefOr[Boolean] = js.undefined): AnonEquals = {
    val __obj = js.Dynamic.literal()
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction2(equals))
    if (!js.isUndefined(fireImmediately)) __obj.updateDynamic("fireImmediately")(fireImmediately.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEquals]
  }
}

