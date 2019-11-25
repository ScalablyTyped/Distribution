package typings.mobx

import typings.mobx.libCoreActionMod.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Configurable extends js.Object {
  var configurable: Boolean
  var enumerable: Boolean
  var value: js.Function with IAction
  var writable: Boolean
}

object Anon_Configurable {
  @scala.inline
  def apply(configurable: Boolean, enumerable: Boolean, value: js.Function with IAction, writable: Boolean): Anon_Configurable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Configurable]
  }
}

