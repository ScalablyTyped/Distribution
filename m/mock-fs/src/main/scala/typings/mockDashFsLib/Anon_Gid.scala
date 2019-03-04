package typings
package mockDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gid extends js.Object {
  /**
    * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit]
}

object Anon_Gid {
  @scala.inline
  def apply(
    __promisify__ : js.Function3[nodeLib.fsMod.PathLike, scala.Double, scala.Double, js.Promise[scala.Unit]]
  ): Anon_Gid = {
    val __obj = js.Dynamic.literal(__promisify__ = __promisify__)
  
    __obj.asInstanceOf[Anon_Gid]
  }
}

