package typings.mobx.anon

import typings.mobx.coreActionMod.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enumerable extends js.Object {
  var configurable: Boolean
  var enumerable: Boolean
  var value: js.UndefOr[scala.Nothing] = js.undefined
  var writable: Boolean
  def initializer(): js.Function with IAction
}

object Enumerable {
  @scala.inline
  def apply(
    configurable: Boolean,
    enumerable: Boolean,
    initializer: () => js.Function with IAction,
    writable: Boolean
  ): Enumerable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], initializer = js.Any.fromFunction0(initializer), writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enumerable]
  }
}

