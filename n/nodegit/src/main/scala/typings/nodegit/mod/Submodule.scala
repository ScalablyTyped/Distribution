package typings.nodegit.mod

import typings.nodegit.submoduleUpdateOptionsMod.SubmoduleUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Submodule")
@js.native
class Submodule ()
  extends typings.nodegit.submoduleMod.Submodule
/* static members */
@JSImport("nodegit", "Submodule")
@js.native
object Submodule extends js.Object {
  
  def addSetup(repo: typings.nodegit.repositoryMod.Repository, url: String, path: String, useGitLink: Double): js.Promise[typings.nodegit.submoduleMod.Submodule] = js.native
  
  def foreach(repo: typings.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  def foreach(repo: typings.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = js.native
  
  def lookup(repo: typings.nodegit.repositoryMod.Repository, name: String): js.Promise[typings.nodegit.submoduleMod.Submodule] = js.native
  
  def resolveUrl(repo: typings.nodegit.repositoryMod.Repository, url: String): js.Promise[typings.nodegit.bufMod.Buf] = js.native
  
  def setBranch(repo: typings.nodegit.repositoryMod.Repository, name: String, branch: String): Double = js.native
  
  def setFetchRecurseSubmodules(repo: typings.nodegit.repositoryMod.Repository, name: String, fetchRecurseSubmodules: Double): Double = js.native
  
  def setIgnore(repo: typings.nodegit.repositoryMod.Repository, name: String, ignore: Double): js.Promise[Double] = js.native
  
  def setUpdate(repo: typings.nodegit.repositoryMod.Repository, name: String, update: Double): js.Promise[Double] = js.native
  
  def setUrl(repo: typings.nodegit.repositoryMod.Repository, name: String, url: String): js.Promise[Double] = js.native
  
  def status(repo: typings.nodegit.repositoryMod.Repository, name: String, ignore: Double): js.Promise[Double] = js.native
  
  def updateInitOptions(opts: SubmoduleUpdateOptions, version: Double): Double = js.native
}
