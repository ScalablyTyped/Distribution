package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Filter")
@js.native
class Filter ()
  extends nodegitLib.filterMod.Filter

@JSImport("nodegit", "Filter")
@js.native
object Filter extends js.Object {
  def listContains(filters: js.Any, name: java.lang.String): scala.Double = js.native
  def listLength(fl: js.Any): scala.Double = js.native
  def listNew(repo: nodegitLib.repositoryMod.Repository, mode: scala.Double, options: scala.Double): stdLib.Promise[_] = js.native
  def listStreamBlob(filters: js.Any, blob: nodegitLib.blobMod.Blob, target: nodeLib.fsMod.WriteStream): scala.Double = js.native
  def listStreamData(filters: js.Any, data: nodegitLib.bufMod.Buf, target: nodeLib.fsMod.WriteStream): scala.Double = js.native
  def listStreamFile(
    filters: js.Any,
    repo: nodegitLib.repositoryMod.Repository,
    path: java.lang.String,
    target: nodeLib.fsMod.WriteStream
  ): scala.Double = js.native
  def unregister(name: java.lang.String): scala.Double = js.native
}

