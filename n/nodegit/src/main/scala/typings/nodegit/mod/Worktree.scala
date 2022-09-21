package typings.nodegit.mod

import typings.nodegit.worktreeAddOptionsMod.WorktreeAddOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Worktree")
@js.native
open class Worktree ()
  extends typings.nodegit.worktreeMod.Worktree
/* static members */
object Worktree {
  
  @JSImport("nodegit", "Worktree")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param repo - Repository to create working tree for
    * @param name - Name of the working tree
    * @param path - Path to create working tree at
    * @param opts - Options to modify default behavior. May be NULL
    */
  inline def add(repo: typings.nodegit.repositoryMod.Repository, name: String, path: String): js.Promise[typings.nodegit.worktreeMod.Worktree] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.worktreeMod.Worktree]]
  inline def add(
    repo: typings.nodegit.repositoryMod.Repository,
    name: String,
    path: String,
    opts: WorktreeAddOptions
  ): js.Promise[typings.nodegit.worktreeMod.Worktree] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.worktreeMod.Worktree]]
  
  /**
    * @param repo - the repo to use when listing working trees
    */
  inline def list(repo: typings.nodegit.repositoryMod.Repository): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  /**
    * @param repo - The repository containing worktrees
    * @param name - Name of the working tree to look up
    */
  inline def lookup(repo: typings.nodegit.repositoryMod.Repository, name: String): js.Promise[typings.nodegit.worktreeMod.Worktree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.worktreeMod.Worktree]]
  
  /**
    * @param repo - Repository to look up worktree for
    */
  inline def openFromRepository(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.worktreeMod.Worktree] = ^.asInstanceOf[js.Dynamic].applyDynamic("openFromRepository")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.worktreeMod.Worktree]]
}
