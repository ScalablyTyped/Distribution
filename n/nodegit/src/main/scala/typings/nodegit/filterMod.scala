package typings.nodegit

import typings.node.fsMod.WriteStream
import typings.nodegit.blobMod.Blob
import typings.nodegit.bufMod.Buf
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("nodegit/filter", "Filter")
  @js.native
  class Filter () extends StObject {
    
    var attributes: String = js.native
    
    def lookup(name: String): Filter = js.native
    
    def register(name: String, priority: Double): Double = js.native
    
    var stream: js.Function = js.native
    
    var version: Double = js.native
  }
  /* static members */
  object Filter {
    
    @JSImport("nodegit/filter", "Filter.listContains")
    @js.native
    def listContains(filters: js.Any, name: String): Double = js.native
    
    @JSImport("nodegit/filter", "Filter.listLength")
    @js.native
    def listLength(fl: js.Any): Double = js.native
    
    @JSImport("nodegit/filter", "Filter.listNew")
    @js.native
    def listNew(repo: Repository, mode: Double, options: Double): js.Promise[_] = js.native
    
    @JSImport("nodegit/filter", "Filter.listStreamBlob")
    @js.native
    def listStreamBlob(filters: js.Any, blob: Blob, target: WriteStream): Double = js.native
    
    @JSImport("nodegit/filter", "Filter.listStreamData")
    @js.native
    def listStreamData(filters: js.Any, data: Buf, target: WriteStream): Double = js.native
    
    @JSImport("nodegit/filter", "Filter.listStreamFile")
    @js.native
    def listStreamFile(filters: js.Any, repo: Repository, path: String, target: WriteStream): Double = js.native
    
    @JSImport("nodegit/filter", "Filter.unregister")
    @js.native
    def unregister(name: String): Double = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
    */
    trait FLAG extends StObject
    object FLAG {
      
      @scala.inline
      def ALLOW_UNSAFE: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def DEFAULT: `0` = 0.asInstanceOf[`0`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
    */
    trait MODE extends StObject
    object MODE {
      
      @scala.inline
      def CLEAN: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def SMUDGE: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def TO_ODB: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def TO_WORKTREE: `0` = 0.asInstanceOf[`0`]
    }
  }
}
