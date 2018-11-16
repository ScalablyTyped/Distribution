package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
///////////////////////////////LOADER/////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
// pixi loader extends
// https://github.com/englercj/resource-loader/
// 2.1.1
@JSGlobal("PIXI.MiniSignalBinding")
@js.native
class MiniSignalBinding protected () extends js.Object {
  //tslint:disable-next-line:ban-types forbidden-types
  def this(fn: js.Function) = this()
  //tslint:disable-next-line:ban-types forbidden-types
  def this(fn: js.Function, once: scala.Boolean) = this()
  //tslint:disable-next-line:ban-types forbidden-types
  def this(fn: js.Function, once: scala.Boolean, thisArg: js.Any) = this()
  //tslint:disable-next-line:ban-types forbidden-types
  var _fn: js.Function = js.native
  var _next: MiniSignalBinding = js.native
  var _once: scala.Boolean = js.native
  var _owner: MiniSignal = js.native
  var _prev: MiniSignalBinding = js.native
  var _thisArg: js.Any = js.native
  def detach(): scala.Boolean = js.native
}

