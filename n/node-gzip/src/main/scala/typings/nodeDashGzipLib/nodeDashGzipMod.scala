package typings
package nodeDashGzipLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-gzip", JSImport.Namespace)
@js.native
object nodeDashGzipMod extends js.Object {
  def gzip(input: nodeLib.zlibMod.InputType): js.Promise[nodeLib.Buffer] = js.native
  def gzip(input: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): js.Promise[nodeLib.Buffer] = js.native
  def ungzip(input: nodeLib.zlibMod.InputType): js.Promise[nodeLib.Buffer] = js.native
  def ungzip(input: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): js.Promise[nodeLib.Buffer] = js.native
}

