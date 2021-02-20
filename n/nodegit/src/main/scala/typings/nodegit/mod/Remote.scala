package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Remote")
@js.native
class Remote ()
  extends typings.nodegit.remoteMod.Remote
/* static members */
object Remote {
  
  @JSImport("nodegit", "Remote.addFetch")
  @js.native
  def addFetch(repo: typings.nodegit.repositoryMod.Repository, remote: String, refspec: String): Double = js.native
  
  @JSImport("nodegit", "Remote.addPush")
  @js.native
  def addPush(repo: typings.nodegit.repositoryMod.Repository, remote: String, refspec: String): Double = js.native
  
  @JSImport("nodegit", "Remote.create")
  @js.native
  def create(repo: typings.nodegit.repositoryMod.Repository, name: String, url: String): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  
  @JSImport("nodegit", "Remote.createAnonymous")
  @js.native
  def createAnonymous(repo: typings.nodegit.repositoryMod.Repository, url: String): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  
  @JSImport("nodegit", "Remote.createDetached")
  @js.native
  def createDetached(url: String): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  
  @JSImport("nodegit", "Remote.createWithFetchspec")
  @js.native
  def createWithFetchspec(repo: typings.nodegit.repositoryMod.Repository, name: String, url: String, fetch: String): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  
  @JSImport("nodegit", "Remote.delete")
  @js.native
  def delete(repo: typings.nodegit.repositoryMod.Repository, name: String): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Remote.initCallbacks")
  @js.native
  def initCallbacks(opts: typings.nodegit.remoteCallbacksMod.RemoteCallbacks, version: Double): Double = js.native
  
  @JSImport("nodegit", "Remote.isValidName")
  @js.native
  def isValidName(remoteName: String): Boolean = js.native
  
  @JSImport("nodegit", "Remote.list")
  @js.native
  def list(repo: typings.nodegit.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  
  @JSImport("nodegit", "Remote.lookup")
  @js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, name: String): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  @JSImport("nodegit", "Remote.lookup")
  @js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, name: String, callback: js.Function): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  @JSImport("nodegit", "Remote.lookup")
  @js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, name: typings.nodegit.remoteMod.Remote): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  @JSImport("nodegit", "Remote.lookup")
  @js.native
  def lookup(
    repo: typings.nodegit.repositoryMod.Repository,
    name: typings.nodegit.remoteMod.Remote,
    callback: js.Function
  ): js.Promise[typings.nodegit.remoteMod.Remote] = js.native
  
  @JSImport("nodegit", "Remote.setAutotag")
  @js.native
  def setAutotag(repo: typings.nodegit.repositoryMod.Repository, remote: String, value: Double): Double = js.native
  
  @JSImport("nodegit", "Remote.setPushurl")
  @js.native
  def setPushurl(repo: typings.nodegit.repositoryMod.Repository, remote: String, url: String): Double = js.native
  
  @JSImport("nodegit", "Remote.setUrl")
  @js.native
  def setUrl(repo: typings.nodegit.repositoryMod.Repository, remote: String, url: String): Double = js.native
}
