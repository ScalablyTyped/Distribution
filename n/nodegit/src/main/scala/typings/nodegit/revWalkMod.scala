package typings.nodegit

import typings.nodegit.commitMod.Commit
import typings.nodegit.diffMod.Diff.DELTA
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.revWalkMod.Revwalk.HistoryEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revWalkMod {
  
  @JSImport("nodegit/rev-walk", "Revwalk")
  @js.native
  open class Revwalk () extends StObject {
    
    def commitWalk(maxCount: Double): js.Promise[js.Array[Commit]] = js.native
    
    def fastWalk(maxCount: Double): js.Promise[js.Array[Oid]] = js.native
    
    def fileHistoryWalk(filePath: String, maxCount: Double): js.Promise[js.Array[HistoryEntry]] = js.native
    
    def getCommits(count: Double): js.Promise[js.Array[Commit]] = js.native
    
    /**
      * Walk the history grabbing commits until the checkFn called with the current commit returns false.
      */
    def getCommitsUntil(checkFn: js.Function): js.Promise[js.Array[Commit]] = js.native
    
    def hide(commitId: Oid): Double = js.native
    
    def hideGlob(glob: String): Double = js.native
    
    def hideHead(): Double = js.native
    
    def hideRef(refname: String): Double = js.native
    
    def next(): js.Promise[Oid] = js.native
    
    def push(id: Oid): Double = js.native
    
    def pushGlob(glob: String): Double = js.native
    
    def pushHead(): Double = js.native
    
    def pushRange(range: String): Double = js.native
    
    def pushRef(refname: String): Double = js.native
    
    def repository(): Repository = js.native
    
    def reset(): Unit = js.native
    
    def simplifyFirstParent(): Unit = js.native
    
    /**
      * Set the sort order for the revwalk. This function takes variable arguments like revwalk.sorting(NodeGit.RevWalk.Topological, NodeGit.RevWalk.Reverse).
      */
    def sorting(sort: Double*): Unit = js.native
    
    /**
      * Walk the history from the given oid. The callback is invoked for each commit; When the walk is over, the callback is invoked with (null, null).
      */
    def walk(oid: Oid): Commit = js.native
    def walk(oid: Oid, callback: js.Function): Commit = js.native
  }
  /* static members */
  object Revwalk {
    
    @JSImport("nodegit/rev-walk", "Revwalk")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(repo: Repository): Revwalk = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any]).asInstanceOf[Revwalk]
    
    trait HistoryEntry extends StObject {
      
      var commit: Commit
      
      var newName: String
      
      var oldName: String
      
      var status: DELTA
    }
    object HistoryEntry {
      
      inline def apply(commit: Commit, newName: String, oldName: String, status: DELTA): HistoryEntry = {
        val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[HistoryEntry]
      }
      
      extension [Self <: HistoryEntry](x: Self) {
        
        inline def setCommit(value: Commit): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
        
        inline def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
        
        inline def setOldName(value: String): Self = StObject.set(x, "oldName", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: DELTA): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
    */
    trait SORT extends StObject
    object SORT {
      
      inline def NONE: `0` = 0.asInstanceOf[`0`]
      
      inline def REVERSE: `4` = 4.asInstanceOf[`4`]
      
      inline def TIME: `2` = 2.asInstanceOf[`2`]
      
      inline def TOPOLOGICAL: `1` = 1.asInstanceOf[`1`]
    }
  }
}
