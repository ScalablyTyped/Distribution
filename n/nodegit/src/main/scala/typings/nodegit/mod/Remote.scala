package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Remote")
@js.native
class Remote ()
  extends typings.nodegit.remoteMod.Remote
/* static members */
object Remote {
  
  @JSImport("nodegit", "Remote")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addFetch(repo: typings.nodegit.repositoryMod.Repository, remote: String, refspec: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addFetch")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], refspec.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def addPush(repo: typings.nodegit.repositoryMod.Repository, remote: String, refspec: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addPush")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], refspec.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def create(repo: typings.nodegit.repositoryMod.Repository, name: String, url: String): js.Promise[typings.nodegit.remoteMod.Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.remoteMod.Remote]]
  
  @scala.inline
  def createAnonymous(repo: typings.nodegit.repositoryMod.Repository, url: String): js.Promise[typings.nodegit.remoteMod.Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnonymous")(repo.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.remoteMod.Remote]]
  
  @scala.inline
  def createDetached(url: String): js.Promise[typings.nodegit.remoteMod.Remote] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDetached")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.remoteMod.Remote]]
  
  @scala.inline
  def createWithFetchspec(repo: typings.nodegit.repositoryMod.Repository, name: String, url: String, fetch: String): js.Promise[typings.nodegit.remoteMod.Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithFetchspec")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], fetch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.remoteMod.Remote]]
  
  @scala.inline
  def delete(repo: typings.nodegit.repositoryMod.Repository, name: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def initCallbacks(opts: typings.nodegit.remoteCallbacksMod.RemoteCallbacks, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initCallbacks")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isValidName(remoteName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidName")(remoteName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def list(repo: typings.nodegit.repositoryMod.Repository): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
  
  @scala.inline
  def lookup(repo: typings.nodegit.repositoryMod.Repository, name: String): js.Promise[typings.nodegit.remoteMod.Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.remoteMod.Remote]]
  @scala.inline
  def lookup(repo: typings.nodegit.repositoryMod.Repository, name: String, callback: js.Function): js.Promise[typings.nodegit.remoteMod.Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.remoteMod.Remote]]
  @scala.inline
  def lookup(repo: typings.nodegit.repositoryMod.Repository, name: typings.nodegit.remoteMod.Remote): js.Promise[typings.nodegit.remoteMod.Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.remoteMod.Remote]]
  @scala.inline
  def lookup(
    repo: typings.nodegit.repositoryMod.Repository,
    name: typings.nodegit.remoteMod.Remote,
    callback: js.Function
  ): js.Promise[typings.nodegit.remoteMod.Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.remoteMod.Remote]]
  
  @scala.inline
  def setAutotag(repo: typings.nodegit.repositoryMod.Repository, remote: String, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setAutotag")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def setPushurl(repo: typings.nodegit.repositoryMod.Repository, remote: String, url: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setPushurl")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def setUrl(repo: typings.nodegit.repositoryMod.Repository, remote: String, url: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setUrl")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Double]
}
