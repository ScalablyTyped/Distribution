package typings
package atNodelibFsDotStatLib.outProvidersStatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat/out/providers/stat", JSImport.Namespace)
@js.native
object outProvidersStatModMembers extends js.Object {
  def async(
    path: nodeLib.fsMod.PathLike,
    options: atNodelibFsDotStatLib.outManagersOptionsMod.StrictOptions,
    callback: AsyncCallback
  ): scala.Unit = js.native
  def isFollowedSymlink(stat: nodeLib.fsMod.Stats, options: atNodelibFsDotStatLib.outManagersOptionsMod.StrictOptions): scala.Boolean = js.native
  def sync(path: nodeLib.fsMod.PathLike, options: atNodelibFsDotStatLib.outManagersOptionsMod.StrictOptions): nodeLib.fsMod.Stats = js.native
}

