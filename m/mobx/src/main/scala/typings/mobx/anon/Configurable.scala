package typings.mobx.anon

import typings.mobx.coreActionMod.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configurable extends js.Object {
  var configurable: Boolean
  var enumerable: Boolean
  var value: js.Function with IAction
  var writable: Boolean
}

object Configurable {
  @scala.inline
  def apply(configurable: Boolean, enumerable: Boolean, value: js.Function with IAction, writable: Boolean): Configurable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configurable]
  }
}

