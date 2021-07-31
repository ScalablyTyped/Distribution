package typings.nodegit.mod

import typings.nodegit.submoduleUpdateOptionsMod.SubmoduleUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Submodule")
@js.native
class Submodule ()
  extends typings.nodegit.submoduleMod.Submodule
/* static members */
object Submodule {
  
  @JSImport("nodegit", "Submodule")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addSetup(repo: typings.nodegit.repositoryMod.Repository, url: String, path: String, useGitLink: Double): js.Promise[typings.nodegit.submoduleMod.Submodule] = (^.asInstanceOf[js.Dynamic].applyDynamic("addSetup")(repo.asInstanceOf[js.Any], url.asInstanceOf[js.Any], path.asInstanceOf[js.Any], useGitLink.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.submoduleMod.Submodule]]
  
  @scala.inline
  def foreach(repo: typings.nodegit.repositoryMod.Repository): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  @scala.inline
  def foreach(repo: typings.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def lookup(repo: typings.nodegit.repositoryMod.Repository, name: String): js.Promise[typings.nodegit.submoduleMod.Submodule] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.submoduleMod.Submodule]]
  
  @scala.inline
  def resolveUrl(repo: typings.nodegit.repositoryMod.Repository, url: String): js.Promise[typings.nodegit.bufMod.Buf] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveUrl")(repo.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.bufMod.Buf]]
  
  @scala.inline
  def setBranch(repo: typings.nodegit.repositoryMod.Repository, name: String, branch: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setBranch")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], branch.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def setFetchRecurseSubmodules(repo: typings.nodegit.repositoryMod.Repository, name: String, fetchRecurseSubmodules: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setFetchRecurseSubmodules")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fetchRecurseSubmodules.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def setIgnore(repo: typings.nodegit.repositoryMod.Repository, name: String, ignore: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIgnore")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def setUpdate(repo: typings.nodegit.repositoryMod.Repository, name: String, update: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpdate")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def setUrl(repo: typings.nodegit.repositoryMod.Repository, name: String, url: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUrl")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def status(repo: typings.nodegit.repositoryMod.Repository, name: String, ignore: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("status")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def updateInitOptions(opts: SubmoduleUpdateOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("updateInitOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
}
