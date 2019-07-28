package typings.nodegit.filterMod

import typings.node.fsMod.WriteStream
import typings.nodegit.blobMod.Blob
import typings.nodegit.bufMod.Buf
import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/filter", "Filter")
@js.native
class Filter () extends js.Object {
  var attributes: String = js.native
  var stream: js.Function = js.native
  var version: Double = js.native
  def lookup(name: String): Filter = js.native
  def register(name: String, priority: Double): Double = js.native
}

/* static members */
@JSImport("nodegit/filter", "Filter")
@js.native
object Filter extends js.Object {
  def listContains(filters: js.Any, name: String): Double = js.native
  def listLength(fl: js.Any): Double = js.native
  def listNew(repo: Repository, mode: Double, options: Double): js.Promise[_] = js.native
  def listStreamBlob(filters: js.Any, blob: Blob, target: WriteStream): Double = js.native
  def listStreamData(filters: js.Any, data: Buf, target: WriteStream): Double = js.native
  def listStreamFile(filters: js.Any, repo: Repository, path: String, target: WriteStream): Double = js.native
  def unregister(name: String): Double = js.native
}

