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

