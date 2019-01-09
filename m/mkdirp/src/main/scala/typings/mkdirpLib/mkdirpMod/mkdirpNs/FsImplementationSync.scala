package typings
package mkdirpLib.mkdirpMod.mkdirpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsImplementationSync extends js.Object {
  @JSName("mkdirSync")
  var mkdirSync_Original: mkdirpLib.Anon_Options = js.native
  @JSName("statSync")
  var statSync_Original: js.Function1[/* path */ nodeLib.fsMod.PathLike, nodeLib.fsMod.Stats] = js.native
  def mkdirSync(path: nodeLib.fsMod.PathLike): scala.Unit = js.native
  def mkdirSync(path: nodeLib.fsMod.PathLike, options: java.lang.String): scala.Unit = js.native
  def mkdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.fsMod.MakeDirectoryOptions): scala.Unit = js.native
  def mkdirSync(path: nodeLib.fsMod.PathLike, options: scala.Double): scala.Unit = js.native
  def statSync(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.Stats = js.native
}

