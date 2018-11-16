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
  def values(): ScalablyTyped.runtime.StringDictionary[js.Any]
}

