package typings
package atNodelibFsDotStatLib.fsDotStatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat", JSImport.Namespace)
@js.native
object fsDotStatModMembers extends js.Object {
  def stat(path: nodeLib.fsMod.PathLike): stdLib.Promise[nodeLib.fsMod.Stats] = js.native
  def stat(path: nodeLib.fsMod.PathLike, opts: Options): stdLib.Promise[nodeLib.fsMod.Stats] = js.native
  def statCallback(path: nodeLib.fsMod.PathLike, callback: atNodelibFsDotStatLib.outProvidersStatMod.AsyncCallback): scala.Unit = js.native
  def statCallback(
    path: nodeLib.fsMod.PathLike,
    opts: Options,
    callback: atNodelibFsDotStatLib.outProvidersStatMod.AsyncCallback
  ): scala.Unit = js.native
  def statSync(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.Stats = js.native
  def statSync(path: nodeLib.fsMod.PathLike, opts: Options): nodeLib.fsMod.Stats = js.native
}

