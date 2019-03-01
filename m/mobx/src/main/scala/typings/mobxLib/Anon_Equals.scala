package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Equals extends js.Object {
  @JSName("equals")
  var equals_FAnon_Equals: js.UndefOr[mobxLib.libUtilsComparerMod.IEqualsComparer[_]] = js.undefined
  var fireImmediately: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Equals {
  @scala.inline
  def apply(
    equals: mobxLib.libUtilsComparerMod.IEqualsComparer[_] = null,
    fireImmediately: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Equals = {
    val __obj = js.Dynamic.literal()
    if (equals != null) __obj.updateDynamic("equals")(equals)
    if (!js.isUndefined(fireImmediately)) __obj.updateDynamic("fireImmediately")(fireImmediately)
    __obj.asInstanceOf[Anon_Equals]
  }
}

