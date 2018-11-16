package typings
package nodegitLib.filterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/filter", "Filter")
@js.native
class Filter () extends js.Object {
  var attributes: java.lang.String = js.native
  var stream: js.Function = js.native
  var version: scala.Double = js.native
  def lookup(name: java.lang.String): Filter = js.native
  def register(name: java.lang.String, priority: scala.Double): scala.Double = js.native
}

@JSImport("nodegit/filter", "Filter")
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

