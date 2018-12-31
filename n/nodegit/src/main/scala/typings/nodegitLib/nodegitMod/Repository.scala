package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Repository")
@js.native
class Repository ()
  extends nodegitLib.repositoryMod.Repository

@JSImport("nodegit", "Repository")
@js.native
object Repository extends js.Object {
  /**
    * Creates a branch with the passed in name pointing to the commit
    */
  def discover(startPath: java.lang.String, acrossFs: scala.Double, ceilingDirs: java.lang.String): js.Promise[nodegitLib.bufMod.Buf] = js.native
  def init(path: java.lang.String, isBare: scala.Double): js.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def initExt(repoPath: java.lang.String): js.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def initExt(repoPath: java.lang.String, options: nodegitLib.repositoryMod.RepositoryInitOptions): js.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def open(path: java.lang.String): js.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def openBare(barePath: java.lang.String): js.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def openExt(path: java.lang.String): js.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def openExt(path: java.lang.String, flags: scala.Double): js.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def openExt(path: java.lang.String, flags: scala.Double, ceilingDirs: java.lang.String): js.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def wrapOdb(odb: nodegitLib.odbMod.Odb): js.Promise[nodegitLib.repositoryMod.Repository] = js.native
}

