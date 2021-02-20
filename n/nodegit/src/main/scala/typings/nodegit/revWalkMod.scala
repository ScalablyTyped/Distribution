package typings.nodegit

import typings.nodegit.commitMod.Commit
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revWalkMod {
  
  @JSImport("nodegit/rev-walk", "Revwalk")
  @js.native
  class Revwalk () extends StObject {
    
    def fastWalk(maxCount: Double): js.Promise[_] = js.native
    
    def fileHistoryWalk(filePath: String, maxCount: Double): js.Promise[js.Array[_]] = js.native
    
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
    
    @JSImport("nodegit/rev-walk", "Revwalk.create")
    @js.native
    def create(repo: Repository): Revwalk = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
    */
    trait SORT extends StObject
    object SORT {
      
      @scala.inline
      def NONE: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def REVERSE: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def TIME: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def TOPOLOGICAL: `1` = 1.asInstanceOf[`1`]
    }
  }
}
