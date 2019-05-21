package typings
package parchmentLib.distSrcAttributorAttributorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributor extends js.Object {
  var attrName: java.lang.String
  var keyName: java.lang.String
  var scope: parchmentLib.distSrcRegistryMod.Scope
  var whitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  def add(node: stdLib.HTMLElement, value: java.lang.String): scala.Boolean
  def canAdd(node: stdLib.HTMLElement, value: js.Any): scala.Boolean
  def remove(node: stdLib.HTMLElement): scala.Unit
  def value(node: stdLib.HTMLElement): java.lang.String
}

object Attributor {
  @scala.inline
  def apply(
    add: (stdLib.HTMLElement, java.lang.String) => scala.Boolean,
    attrName: java.lang.String,
    canAdd: (stdLib.HTMLElement, js.Any) => scala.Boolean,
    keyName: java.lang.String,
    remove: stdLib.HTMLElement => scala.Unit,
    scope: parchmentLib.distSrcRegistryMod.Scope,
    value: stdLib.HTMLElement => java.lang.String,
    whitelist: js.Array[java.lang.String] = null
  ): Attributor = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), attrName = attrName, canAdd = js.Any.fromFunction2(canAdd), keyName = keyName, remove = js.Any.fromFunction1(remove), scope = scope, value = js.Any.fromFunction1(value))
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[Attributor]
  }
}

