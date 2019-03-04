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
    get: js.Function0[js.UndefOr[scala.Nothing]],
    set: js.Function1[js.Any, scala.Unit]
  ): Anon_ConfigurableEnumerableGetSet = {
    val __obj = js.Dynamic.literal(configurable = configurable, enumerable = enumerable, get = get, set = set)
  
    __obj.asInstanceOf[Anon_ConfigurableEnumerableGetSet]
  }
}

