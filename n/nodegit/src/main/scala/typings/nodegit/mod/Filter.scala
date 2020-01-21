package typings.nodegit.mod

import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Filter")
@js.native
class Filter ()
  extends typings.nodegit.filterMod.Filter

/* static members */
@JSImport("nodegit", "Filter")
@js.native
object Filter extends js.Object {
  def listContains(filters: js.Any, name: String): Double = js.native
  def listLength(fl: js.Any): Double = js.native
  def listNew(repo: typings.nodegit.repositoryMod.Repository, mode: Double, options: Double): js.Promise[_] = js.native
  def listStreamBlob(filters: js.Any, blob: typings.nodegit.blobMod.Blob, target: WriteStream): Double = js.native
  def listStreamData(filters: js.Any, data: typings.nodegit.bufMod.Buf, target: WriteStream): Double = js.native
  def listStreamFile(filters: js.Any, repo: typings.nodegit.repositoryMod.Repository, path: String, target: WriteStream): Double = js.native
  def unregister(name: String): Double = js.native
}

