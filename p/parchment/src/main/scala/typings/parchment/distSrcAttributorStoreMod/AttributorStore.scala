package typings.parchment.distSrcAttributorStoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.parchment.distSrcBlotAbstractBlotMod.Formattable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributorStore extends js.Object {
  var attributes: js.Any
  var domNode: js.Any
  def attribute(attribute: typings.parchment.distSrcAttributorAttributorMod.default, value: js.Any): Unit
  def build(): Unit
  def copy(target: Formattable): Unit
  def move(target: Formattable): Unit
  def values(): StringDictionary[js.Any]
}

object AttributorStore {
  @scala.inline
  def apply(
    attribute: (typings.parchment.distSrcAttributorAttributorMod.default, js.Any) => Unit,
    attributes: js.Any,
    build: () => Unit,
    copy: Formattable => Unit,
    domNode: js.Any,
    move: Formattable => Unit,
    values: () => StringDictionary[js.Any]
  ): AttributorStore = {
    val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction2(attribute), attributes = attributes.asInstanceOf[js.Any], build = js.Any.fromFunction0(build), copy = js.Any.fromFunction1(copy), domNode = domNode.asInstanceOf[js.Any], move = js.Any.fromFunction1(move), values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[AttributorStore]
  }
}

