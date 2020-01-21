package typings.parchment.attributorMod

import typings.parchment.registryMod.Scope
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributor extends js.Object {
  var attrName: String
  var keyName: String
  var scope: Scope
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
  def add(node: HTMLElement, value: String): Boolean
  def canAdd(node: HTMLElement, value: js.Any): Boolean
  def remove(node: HTMLElement): Unit
  def value(node: HTMLElement): String
}

object Attributor {
  @scala.inline
  def apply(
    add: (HTMLElement, String) => Boolean,
    attrName: String,
    canAdd: (HTMLElement, js.Any) => Boolean,
    keyName: String,
    remove: HTMLElement => Unit,
    scope: Scope,
    value: HTMLElement => String,
    whitelist: js.Array[String] = null
  ): Attributor = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), attrName = attrName.asInstanceOf[js.Any], canAdd = js.Any.fromFunction2(canAdd), keyName = keyName.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), scope = scope.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributor]
  }
}

