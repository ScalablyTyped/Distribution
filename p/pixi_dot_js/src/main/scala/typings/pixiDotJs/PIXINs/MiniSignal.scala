package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.pixiDotJsNumbers.`false`
import typings.pixiDotJs.pixiDotJsNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.MiniSignal")
@js.native
class MiniSignal[CbType /* <: js.Function1[/* repeated */ js.Any, _] */] () extends js.Object {
  var dispatch: CbType = js.native
  def add(fn: CbType): MiniSignalBinding = js.native
  def add(fn: CbType, thisArg: js.Any): MiniSignalBinding = js.native
  def add(fn: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def add(fn: js.Function1[/* repeated */ js.Any, _], thisArg: js.Any): js.Any = js.native
  def detach(node: MiniSignalBinding): MiniSignal[CbType] = js.native
  def detachAll(): MiniSignal[CbType] = js.native
  def handlers(): js.Array[MiniSignalBinding] = js.native
  @JSName("handlers")
  def handlers_false(exists: `false`): js.Array[MiniSignalBinding] = js.native
  @JSName("handlers")
  def handlers_true(exists: `true`): Boolean = js.native
  def has(node: MiniSignalBinding): Boolean = js.native
  def once(fn: CbType): MiniSignalBinding = js.native
  def once(fn: CbType, thisArg: js.Any): MiniSignalBinding = js.native
  def once(fn: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def once(fn: js.Function1[/* repeated */ js.Any, _], thisArg: js.Any): js.Any = js.native
}

