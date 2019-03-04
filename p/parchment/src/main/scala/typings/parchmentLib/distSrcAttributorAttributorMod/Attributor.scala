package typings
package parchmentLib.distSrcAttributorAttributorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributor extends js.Object {
  var attrName: java.lang.String
  var keyName: java.lang.String
  var scope: parchmentLib.distSrcRegistryMod.Scope
  var whitelist: js.UndefOr[js.Array[java.lang.String]]
  def add(node: stdLib.HTMLElement, value: java.lang.String): scala.Boolean
  def canAdd(node: stdLib.HTMLElement, value: js.Any): scala.Boolean
  def remove(node: stdLib.HTMLElement): scala.Unit
  def value(node: stdLib.HTMLElement): java.lang.String
}

object Attributor {
  @scala.inline
  def apply(
    add: js.Function2[stdLib.HTMLElement, java.lang.String, scala.Boolean],
    attrName: java.lang.String,
    canAdd: js.Function2[stdLib.HTMLElement, js.Any, scala.Boolean],
    keyName: java.lang.String,
    remove: js.Function1[stdLib.HTMLElement, scala.Unit],
    scope: parchmentLib.distSrcRegistryMod.Scope,
    value: js.Function1[stdLib.HTMLElement, java.lang.String],
    whitelist: js.Array[java.lang.String] = null
  ): Attributor = {
    val __obj = js.Dynamic.literal(add = add, attrName = attrName, canAdd = canAdd, keyName = keyName, remove = remove, scope = scope, value = value)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[Attributor]
  }
}

