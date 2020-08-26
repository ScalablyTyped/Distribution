package typings.nodegit.mod

import typings.nodegit.repositoryMod.RepositoryInitOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Repository")
@js.native
class Repository ()
  extends typings.nodegit.repositoryMod.Repository

/* static members */
@JSImport("nodegit", "Repository")
@js.native
object Repository extends js.Object {
  /**
    * Creates a branch with the passed in name pointing to the commit
    */
  def discover(startPath: String, acrossFs: Double, ceilingDirs: String): js.Promise[typings.nodegit.bufMod.Buf] = js.native
  def init(path: String, isBare: Double): js.Promise[typings.nodegit.repositoryMod.Repository] = js.native
  def initExt(repoPath: String): js.Promise[typings.nodegit.repositoryMod.Repository] = js.native
  def initExt(repoPath: String, options: RepositoryInitOptions): js.Promise[typings.nodegit.repositoryMod.Repository] = js.native
  def open(path: String): js.Promise[typings.nodegit.repositoryMod.Repository] = js.native
  def openBare(barePath: String): js.Promise[typings.nodegit.repositoryMod.Repository] = js.native
  def openExt(path: String): js.Promise[typings.nodegit.repositoryMod.Repository] = js.native
  def openExt(path: String, flags: js.UndefOr[scala.Nothing], ceilingDirs: String): js.Promise[typings.nodegit.repositoryMod.Repository] = js.native
  def openExt(path: String, flags: Double): js.Promise[typings.nodegit.repositoryMod.Repository] = js.native
  def openExt(path: String, flags: Double, ceilingDirs: String): js.Promise[typings.nodegit.repositoryMod.Repository] = js.native
  def wrapOdb(odb: typings.nodegit.odbMod.Odb): js.Promise[typings.nodegit.repositoryMod.Repository] = js.native
}

