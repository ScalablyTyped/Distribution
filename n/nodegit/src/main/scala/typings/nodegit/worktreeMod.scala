package typings.nodegit

import typings.nodegit.bufMod.Buf
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.worktreeAddOptionsMod.WorktreeAddOptions
import typings.nodegit.worktreePruneOptionsMod.WorktreePruneOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object worktreeMod {
  
  @JSImport("nodegit/worktree", "Worktree")
  @js.native
  open class Worktree () extends StObject {
    
    /**
      * @param reason - Buffer to store reason in. If NULL no reason is stored.
      * @returns - 0 when the working tree not locked, a value greater than zero if it is locked, less than zero if there was an error
      */
    def isLocked(): Double = js.native
    def isLocked(reason: Buf): Double = js.native
    
    def isPrunable(opts: WorktreePruneOptions): Double = js.native
    
    /**
      * @param reason - Reason why the working tree is being locked
      * @returns - 0 on success, non-zero otherwise
      */
    def lock(reason: String): Double = js.native
    
    def name(): String = js.native
    
    def path(): String = js.native
    
    /**
      * @param opts - Specifies which checks to override. See isPrunable. May be NULL
      * @returns - 0 or an error code
      */
    def prune(): Double = js.native
    def prune(opts: WorktreePruneOptions): Double = js.native
    
    /**
      * @returns - 0 on success, 1 if worktree was not locked, error-code
      */
    def unlock(): Double = js.native
    
    /**
      * @returns - 0 when worktree is valid, error-code otherwise
      */
    def validate(): Double = js.native
  }
  /* static members */
  object Worktree {
    
    @JSImport("nodegit/worktree", "Worktree")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param repo - Repository to create working tree for
      * @param name - Name of the working tree
      * @param path - Path to create working tree at
      * @param opts - Options to modify default behavior. May be NULL
      */
    inline def add(repo: Repository, name: String, path: String): js.Promise[Worktree] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Worktree]]
    inline def add(repo: Repository, name: String, path: String, opts: WorktreeAddOptions): js.Promise[Worktree] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Worktree]]
    
    /**
      * @param repo - the repo to use when listing working trees
      */
    inline def list(repo: Repository): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    
    /**
      * @param repo - The repository containing worktrees
      * @param name - Name of the working tree to look up
      */
    inline def lookup(repo: Repository, name: String): js.Promise[Worktree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Worktree]]
    
    /**
      * @param repo - Repository to look up worktree for
      */
    inline def openFromRepository(repo: Repository): js.Promise[Worktree] = ^.asInstanceOf[js.Dynamic].applyDynamic("openFromRepository")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Worktree]]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
    */
    trait PRUNE extends StObject
    object PRUNE {
      
      inline def LOCKED: `2` = 2.asInstanceOf[`2`]
      
      inline def VALID: `1` = 1.asInstanceOf[`1`]
      
      inline def WORKING_TREE: `4` = 4.asInstanceOf[`4`]
    }
  }
}
