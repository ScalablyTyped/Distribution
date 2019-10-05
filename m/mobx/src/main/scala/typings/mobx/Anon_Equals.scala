package typings.mobx

import typings.mobx.libUtilsComparerMod.IEqualsComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Equals extends js.Object {
  @JSName("equals")
  var equals_FAnon_Equals: js.UndefOr[IEqualsComparer[_]] = js.undefined
  var fireImmediately: js.UndefOr[Boolean] = js.undefined
}

object Anon_Equals {
  @scala.inline
  def apply(equals: (_, _) => Boolean = null, fireImmediately: js.UndefOr[Boolean] = js.undefined): Anon_Equals = {
    val __obj = js.Dynamic.literal()
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction2(equals))
    if (!js.isUndefined(fireImmediately)) __obj.updateDynamic("fireImmediately")(fireImmediately)
    __obj.asInstanceOf[Anon_Equals]
  }
}

