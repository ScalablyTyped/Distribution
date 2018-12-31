package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.MiniSignal")
@js.native
class MiniSignal () extends js.Object {
  var _head: MiniSignalBinding = js.native
  var _tail: MiniSignalBinding = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def add(fn: js.Function): js.Any = js.native
  def add(fn: js.Function, thisArg: js.Any): js.Any = js.native
  def detach(node: MiniSignalBinding): MiniSignal = js.native
  def detachAll(): MiniSignal = js.native
  def dispatch(): scala.Boolean = js.native
  def handlers(): js.Array[MiniSignalBinding] = js.native
  def handlers(exists: pixiDotJsLib.pixiDotJsLibNumbers.`false`): js.Array[MiniSignalBinding] = js.native
  def handlers(exists: pixiDotJsLib.pixiDotJsLibNumbers.`true`): scala.Boolean = js.native
  def handlers(exists: scala.Boolean): js.Array[MiniSignalBinding] | scala.Boolean = js.native
  @JSName("handlers")
  def `handlers_<union>`(): js.Array[MiniSignalBinding] | scala.Boolean = js.native
  @JSName("handlers")
  def handlers_Boolean(): scala.Boolean = js.native
  def has(node: MiniSignalBinding): scala.Boolean = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def once(fn: js.Function): js.Any = js.native
  def once(fn: js.Function, thisArg: js.Any): js.Any = js.native
}

