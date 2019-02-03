package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Remote")
@js.native
class Remote ()
  extends nodegitLib.remoteMod.Remote

/* static members */
@JSImport("nodegit", "Remote")
@js.native
object Remote extends js.Object {
  def addFetch(repo: nodegitLib.repositoryMod.Repository, remote: java.lang.String, refspec: java.lang.String): scala.Double = js.native
  def addPush(repo: nodegitLib.repositoryMod.Repository, remote: java.lang.String, refspec: java.lang.String): scala.Double = js.native
  def create(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String, url: java.lang.String): nodegitLib.remoteMod.Remote = js.native
  def createAnonymous(repo: nodegitLib.repositoryMod.Repository, url: java.lang.String): js.Promise[nodegitLib.remoteMod.Remote] = js.native
  def createWithFetchspec(
    repo: nodegitLib.repositoryMod.Repository,
    name: java.lang.String,
    url: java.lang.String,
    fetch: java.lang.String
  ): js.Promise[nodegitLib.remoteMod.Remote] = js.native
  def delete(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String): js.Promise[scala.Double] = js.native
  def initCallbacks(opts: nodegitLib.remoteDashCallbacksMod.RemoteCallbacks, version: scala.Double): scala.Double = js.native
  def isValidName(remoteName: java.lang.String): scala.Boolean = js.native
  def list(repo: nodegitLib.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String): js.Promise[nodegitLib.remoteMod.Remote] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String, callback: js.Function): js.Promise[nodegitLib.remoteMod.Remote] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, name: nodegitLib.remoteMod.Remote): js.Promise[nodegitLib.remoteMod.Remote] = js.native
  def lookup(
    repo: nodegitLib.repositoryMod.Repository,
    name: nodegitLib.remoteMod.Remote,
    callback: js.Function
  ): js.Promise[nodegitLib.remoteMod.Remote] = js.native
  def setAutotag(repo: nodegitLib.repositoryMod.Repository, remote: java.lang.String, value: scala.Double): scala.Double = js.native
  def setPushurl(repo: nodegitLib.repositoryMod.Repository, remote: java.lang.String, url: java.lang.String): scala.Double = js.native
  def setUrl(repo: nodegitLib.repositoryMod.Repository, remote: java.lang.String, url: java.lang.String): scala.Double = js.native
}

