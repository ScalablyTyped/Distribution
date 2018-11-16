package typings
package atNodelibFsDotStatLib.outAdaptersFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemAdapter extends js.Object {
  var lstat: atNodelibFsDotStatLib.Anon_Promisify = js.native
  @JSName("lstatSync")
  var lstatSync_Original: js.Function1[/* path */ nodeLib.fsMod.PathLike, nodeLib.fsMod.Stats] = js.native
  var stat: atNodelibFsDotStatLib.Anon_Promisify = js.native
  @JSName("statSync")
  var statSync_Original: js.Function1[/* path */ nodeLib.fsMod.PathLike, nodeLib.fsMod.Stats] = js.native
  def lstatSync(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.Stats = js.native
  def statSync(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.Stats = js.native
}

