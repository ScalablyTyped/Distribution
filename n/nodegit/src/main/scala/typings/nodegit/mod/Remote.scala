package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Remote")
@js.native
class Remote ()
  extends typings.nodegit.remoteMod.Remote

/* static members */
@JSImport("nodegit", "Remote")
@js.native
object Remote extends js.Object {
  def addFetch(repo: typings.nodegit.repositoryMod.Repository, remote: String, refspec: String): Double = js.native
  def addPush(repo: typings.nodegit.repositoryMod.Repository, remote: String, refspec: String): Double = js.native
  def create(repo: typings.nodegit.repositoryMod.Repository, name: String, url: String): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  def createAnonymous(repo: typings.nodegit.repositoryMod.Repository, url: String): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  def createDetached(url: String): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  def createWithFetchspec(repo: typings.nodegit.repositoryMod.Repository, name: String, url: String, fetch: String): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  def delete(repo: typings.nodegit.repositoryMod.Repository, name: String): js.Promise[Double] = js.native
  def initCallbacks(opts: typings.nodegit.remoteCallbacksMod.RemoteCallbacks, version: Double): Double = js.native
  def isValidName(remoteName: String): Boolean = js.native
  def list(repo: typings.nodegit.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, name: String): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, name: String, callback: js.Function): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, name: typings.nodegit.remoteMod.Remote): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  def lookup(
    repo: typings.nodegit.repositoryMod.Repository,
    name: typings.nodegit.remoteMod.Remote,
    callback: js.Function
  ): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  def setAutotag(repo: typings.nodegit.repositoryMod.Repository, remote: String, value: Double): Double = js.native
  def setPushurl(repo: typings.nodegit.repositoryMod.Repository, remote: String, url: String): Double = js.native
  def setUrl(repo: typings.nodegit.repositoryMod.Repository, remote: String, url: String): Double = js.native
}

