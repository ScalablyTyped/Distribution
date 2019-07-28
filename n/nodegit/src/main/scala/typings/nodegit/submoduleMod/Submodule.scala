package typings.nodegit.submoduleMod

import typings.nodegit.bufMod.Buf
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.submoduleDashUpdateDashOptionsMod.SubmoduleUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/submodule", "Submodule")
@js.native
class Submodule () extends js.Object {
  def addFinalize(): js.Promise[Double] = js.native
  def addToIndex(writeIndex: Double): js.Promise[Double] = js.native
  def branch(): String = js.native
  def fetchRecurseSubmodules(): Double = js.native
  def free(): Unit = js.native
  def headId(): Oid = js.native
  def ignore(): Double = js.native
  def indexId(): Oid = js.native
  def init(overwrite: Double): js.Promise[Double] = js.native
  def location(): js.Promise[Double] = js.native
  def name(): String = js.native
  def open(): js.Promise[Repository] = js.native
  def owner(): Repository = js.native
  def path(): String = js.native
  def reload(force: Double): Double = js.native
  def repoInit(useGitLink: Double): js.Promise[Repository] = js.native
  def sync(): js.Promise[Double] = js.native
  /**
    * Updates a submodule
    *
    *
    */
  def update(init: Double): js.Promise[Double] = js.native
  def update(init: Double, options: SubmoduleUpdateOptions): js.Promise[Double] = js.native
  def updateStrategy(): Double = js.native
  def url(): String = js.native
  def wdId(): Oid = js.native
}

/* static members */
@JSImport("nodegit/submodule", "Submodule")
@js.native
object Submodule extends js.Object {
  def addSetup(repo: Repository, url: String, path: String, useGitLink: Double): js.Promise[Submodule] = js.native
  def foreach(repo: Repository): js.Promise[Double] = js.native
  def foreach(repo: Repository, callback: js.Function): js.Promise[Double] = js.native
  def lookup(repo: Repository, name: String): js.Promise[Submodule] = js.native
  def resolveUrl(repo: Repository, url: String): js.Promise[Buf] = js.native
  def setBranch(repo: Repository, name: String, branch: String): Double = js.native
  def setFetchRecurseSubmodules(repo: Repository, name: String, fetchRecurseSubmodules: Double): Double = js.native
  def setIgnore(repo: Repository, name: String, ignore: Double): js.Promise[Double] = js.native
  def setUpdate(repo: Repository, name: String, update: Double): js.Promise[Double] = js.native
  def setUrl(repo: Repository, name: String, url: String): js.Promise[Double] = js.native
  def status(repo: Repository, name: String, ignore: Double): js.Promise[Double] = js.native
  def updateInitOptions(opts: SubmoduleUpdateOptions, version: Double): Double = js.native
}

