package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfigurableEnumerableGetSet extends js.Object {
  var configurable: scala.Boolean
  var enumerable: scala.Boolean
  def get(): js.UndefOr[scala.Nothing]
  def set(v: js.Any): scala.Unit
}

object Anon_ConfigurableEnumerableGetSet {
  @scala.inline
  def apply(
    configurable: scala.Boolean,
    enumerable: scala.Boolean,
    get: () => js.UndefOr[scala.Nothing],
    set: js.Any => scala.Unit
  ): Anon_ConfigurableEnumerableGetSet = {
    val __obj = js.Dynamic.literal(configurable = configurable, enumerable = enumerable, get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[Anon_ConfigurableEnumerableGetSet]
  }
}

