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
    attribute: (parchmentLib.distSrcAttributorAttributorMod.default, js.Any) => scala.Unit,
    attributes: js.Any,
    build: () => scala.Unit,
    copy: parchmentLib.distSrcBlotAbstractBlotMod.Formattable => scala.Unit,
    domNode: js.Any,
    move: parchmentLib.distSrcBlotAbstractBlotMod.Formattable => scala.Unit,
    values: () => org.scalablytyped.runtime.StringDictionary[js.Any]
  ): AttributorStore = {
    val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction2(attribute), attributes = attributes, build = js.Any.fromFunction0(build), copy = js.Any.fromFunction1(copy), domNode = domNode, move = js.Any.fromFunction1(move), values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[AttributorStore]
  }
}

