package typings
package parchmentLib.distSrcAttributorStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributorStore extends js.Object {
  var attributes: js.Any
  var domNode: js.Any
  def attribute(attribute: parchmentLib.distSrcAttributorAttributorMod.default, value: js.Any): scala.Unit
  def build(): scala.Unit
  def copy(target: parchmentLib.distSrcBlotAbstractBlotMod.Formattable): scala.Unit
  def move(target: parchmentLib.distSrcBlotAbstractBlotMod.Formattable): scala.Unit
  def values(): org.scalablytyped.runtime.StringDictionary[js.Any]
}

object AttributorStore {
  @scala.inline
  def apply(
    attribute: js.Function2[parchmentLib.distSrcAttributorAttributorMod.default, js.Any, scala.Unit],
    attributes: js.Any,
    build: js.Function0[scala.Unit],
    copy: js.Function1[parchmentLib.distSrcBlotAbstractBlotMod.Formattable, scala.Unit],
    domNode: js.Any,
    move: js.Function1[parchmentLib.distSrcBlotAbstractBlotMod.Formattable, scala.Unit],
    values: js.Function0[org.scalablytyped.runtime.StringDictionary[js.Any]]
  ): AttributorStore = {
    val __obj = js.Dynamic.literal(attribute = attribute, attributes = attributes, build = build, copy = copy, domNode = domNode, move = move, values = values)
  
    __obj.asInstanceOf[AttributorStore]
  }
}

