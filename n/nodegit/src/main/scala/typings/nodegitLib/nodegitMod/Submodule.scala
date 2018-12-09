package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Submodule")
@js.native
class Submodule ()
  extends nodegitLib.submoduleMod.Submodule

@JSImport("nodegit", "Submodule")
@js.native
object Submodule extends js.Object {
  def addSetup(
    repo: nodegitLib.repositoryMod.Repository,
    url: java.lang.String,
    path: java.lang.String,
    useGitLink: scala.Double
  ): js.Promise[nodegitLib.submoduleMod.Submodule] = js.native
  def foreach(repo: nodegitLib.repositoryMod.Repository): js.Promise[scala.Double] = js.native
  def foreach(repo: nodegitLib.repositoryMod.Repository, callback: js.Function): js.Promise[scala.Double] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String): js.Promise[nodegitLib.submoduleMod.Submodule] = js.native
  def resolveUrl(repo: nodegitLib.repositoryMod.Repository, url: java.lang.String): js.Promise[nodegitLib.bufMod.Buf] = js.native
  def setBranch(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String, branch: java.lang.String): scala.Double = js.native
  def setFetchRecurseSubmodules(
    repo: nodegitLib.repositoryMod.Repository,
    name: java.lang.String,
    fetchRecurseSubmodules: scala.Double
  ): scala.Double = js.native
  def setIgnore(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String, ignore: scala.Double): js.Promise[scala.Double] = js.native
  def setUpdate(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String, update: scala.Double): js.Promise[scala.Double] = js.native
  def setUrl(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String, url: java.lang.String): js.Promise[scala.Double] = js.native
  def status(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String, ignore: scala.Double): js.Promise[scala.Double] = js.native
  def updateInitOptions(opts: nodegitLib.submoduleDashUpdateDashOptionsMod.SubmoduleUpdateOptions, version: scala.Double): scala.Double = js.native
}

