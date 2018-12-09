package typings
package nodegitLib.submoduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/submodule", "Submodule")
@js.native
class Submodule () extends js.Object {
  def addFinalize(): js.Promise[scala.Double] = js.native
  def addToIndex(writeIndex: scala.Double): js.Promise[scala.Double] = js.native
  def branch(): java.lang.String = js.native
  def fetchRecurseSubmodules(): scala.Double = js.native
  def free(): scala.Unit = js.native
  def headId(): nodegitLib.oidMod.Oid = js.native
  def ignore(): scala.Double = js.native
  def indexId(): nodegitLib.oidMod.Oid = js.native
  def init(overwrite: scala.Double): js.Promise[scala.Double] = js.native
  def location(): js.Promise[scala.Double] = js.native
  def name(): java.lang.String = js.native
  def open(): js.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def owner(): nodegitLib.repositoryMod.Repository = js.native
  def path(): java.lang.String = js.native
  def reload(force: scala.Double): scala.Double = js.native
  def repoInit(useGitLink: scala.Double): js.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def sync(): js.Promise[scala.Double] = js.native
  /**
       * Updates a submodule
       *
       *
       */
  def update(init: scala.Double): js.Promise[scala.Double] = js.native
  /**
       * Updates a submodule
       *
       *
       */
  def update(init: scala.Double, options: nodegitLib.submoduleDashUpdateDashOptionsMod.SubmoduleUpdateOptions): js.Promise[scala.Double] = js.native
  def updateStrategy(): scala.Double = js.native
  def url(): java.lang.String = js.native
  def wdId(): nodegitLib.oidMod.Oid = js.native
}

@JSImport("nodegit/submodule", "Submodule")
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

