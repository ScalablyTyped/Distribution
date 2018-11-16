package typings
package plottableLib.buildSrcUtilsSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/set", "Set")
@js.native
class Set[T] () extends js.Object {
  var _es6Set: js.Any = js.native
  var _values: js.Any = js.native
  var size: scala.Double = js.native
  def add(value: T): this.type = js.native
  def delete(value: T): scala.Boolean = js.native
  def forEach(callback: js.Function3[/* value */ T, /* value2 */ T, /* set */ Set[T], scala.Unit]): scala.Unit = js.native
  def forEach(
    callback: js.Function3[/* value */ T, /* value2 */ T, /* set */ Set[T], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def has(value: T): scala.Boolean = js.native
}

