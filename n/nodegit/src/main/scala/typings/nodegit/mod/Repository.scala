package typings.nodegit.mod

import typings.nodegit.repositoryMod.RepositoryInitOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Repository")
@js.native
class Repository ()
  extends typings.nodegit.repositoryMod.Repository
/* static members */
object Repository {
  
  @JSImport("nodegit", "Repository")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a branch with the passed in name pointing to the commit
    */
  @scala.inline
  def discover(startPath: String, acrossFs: Double, ceilingDirs: String): js.Promise[typings.nodegit.bufMod.Buf] = (^.asInstanceOf[js.Dynamic].applyDynamic("discover")(startPath.asInstanceOf[js.Any], acrossFs.asInstanceOf[js.Any], ceilingDirs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.bufMod.Buf]]
  
  @scala.inline
  def init(path: String, isBare: Double): js.Promise[typings.nodegit.repositoryMod.Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(path.asInstanceOf[js.Any], isBare.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.repositoryMod.Repository]]
  
  @scala.inline
  def initExt(repoPath: String): js.Promise[typings.nodegit.repositoryMod.Repository] = ^.asInstanceOf[js.Dynamic].applyDynamic("initExt")(repoPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.repositoryMod.Repository]]
  @scala.inline
  def initExt(repoPath: String, options: RepositoryInitOptions): js.Promise[typings.nodegit.repositoryMod.Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("initExt")(repoPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.repositoryMod.Repository]]
  
  @scala.inline
  def open(path: String): js.Promise[typings.nodegit.repositoryMod.Repository] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.repositoryMod.Repository]]
  
  @scala.inline
  def openBare(barePath: String): js.Promise[typings.nodegit.repositoryMod.Repository] = ^.asInstanceOf[js.Dynamic].applyDynamic("openBare")(barePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.repositoryMod.Repository]]
  
  @scala.inline
  def openExt(path: String): js.Promise[typings.nodegit.repositoryMod.Repository] = ^.asInstanceOf[js.Dynamic].applyDynamic("openExt")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.repositoryMod.Repository]]
  @scala.inline
  def openExt(path: String, flags: Double): js.Promise[typings.nodegit.repositoryMod.Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("openExt")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.repositoryMod.Repository]]
  @scala.inline
  def openExt(path: String, flags: Double, ceilingDirs: String): js.Promise[typings.nodegit.repositoryMod.Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("openExt")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], ceilingDirs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.repositoryMod.Repository]]
  @scala.inline
  def openExt(path: String, flags: Unit, ceilingDirs: String): js.Promise[typings.nodegit.repositoryMod.Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("openExt")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], ceilingDirs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.repositoryMod.Repository]]
  
  @scala.inline
  def wrapOdb(odb: typings.nodegit.odbMod.Odb): js.Promise[typings.nodegit.repositoryMod.Repository] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapOdb")(odb.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.repositoryMod.Repository]]
}
