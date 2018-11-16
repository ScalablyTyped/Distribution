package typings
package npmLib.npmMod.NPMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static
  extends nodeLib.NodeJSNs.EventEmitter {
  var abbrevs: Dictionary[java.lang.String] = js.native
  var bin: java.lang.String = js.native
  var cache: java.lang.String = js.native
  var commands: Commands = js.native
  var config: Config = js.native
  var dir: java.lang.String = js.native
  var fullList: js.Array[java.lang.String] = js.native
  var globalBin: java.lang.String = js.native
  var globalDir: java.lang.String = js.native
  var prefix: java.lang.String = js.native
  var rollbacks: js.Array[_] = js.native
  var root: java.lang.String = js.native
  var spinner: Spinner = js.native
  var tmp: java.lang.String = js.native
  def deref(command: java.lang.String): java.lang.String = js.native
  def load(callback: SimpleCallback[Config]): scala.Unit = js.native
  def load(cli: ConfigOptions): scala.Unit = js.native
  def load(cli: ConfigOptions, callback: SimpleCallback[Config]): scala.Unit = js.native
}

