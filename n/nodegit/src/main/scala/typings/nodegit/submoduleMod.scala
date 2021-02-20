package typings.nodegit

import typings.nodegit.bufMod.Buf
import typings.nodegit.nodegitNumbers.`-1`
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1024`
import typings.nodegit.nodegitNumbers.`128`
import typings.nodegit.nodegitNumbers.`16`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2048`
import typings.nodegit.nodegitNumbers.`256`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`32`
import typings.nodegit.nodegitNumbers.`3`
import typings.nodegit.nodegitNumbers.`4096`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`512`
import typings.nodegit.nodegitNumbers.`64`
import typings.nodegit.nodegitNumbers.`8192`
import typings.nodegit.nodegitNumbers.`8`
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.submoduleUpdateOptionsMod.SubmoduleUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object submoduleMod {
  
  @JSImport("nodegit/submodule", "Submodule")
  @js.native
  class Submodule () extends StObject {
    
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
  object Submodule {
    
    @JSImport("nodegit/submodule", "Submodule.addSetup")
    @js.native
    def addSetup(repo: Repository, url: String, path: String, useGitLink: Double): js.Promise[Submodule] = js.native
    
    @JSImport("nodegit/submodule", "Submodule.foreach")
    @js.native
    def foreach(repo: Repository): js.Promise[Double] = js.native
    @JSImport("nodegit/submodule", "Submodule.foreach")
    @js.native
    def foreach(repo: Repository, callback: js.Function): js.Promise[Double] = js.native
    
    @JSImport("nodegit/submodule", "Submodule.lookup")
    @js.native
    def lookup(repo: Repository, name: String): js.Promise[Submodule] = js.native
    
    @JSImport("nodegit/submodule", "Submodule.resolveUrl")
    @js.native
    def resolveUrl(repo: Repository, url: String): js.Promise[Buf] = js.native
    
    @JSImport("nodegit/submodule", "Submodule.setBranch")
    @js.native
    def setBranch(repo: Repository, name: String, branch: String): Double = js.native
    
    @JSImport("nodegit/submodule", "Submodule.setFetchRecurseSubmodules")
    @js.native
    def setFetchRecurseSubmodules(repo: Repository, name: String, fetchRecurseSubmodules: Double): Double = js.native
    
    @JSImport("nodegit/submodule", "Submodule.setIgnore")
    @js.native
    def setIgnore(repo: Repository, name: String, ignore: Double): js.Promise[Double] = js.native
    
    @JSImport("nodegit/submodule", "Submodule.setUpdate")
    @js.native
    def setUpdate(repo: Repository, name: String, update: Double): js.Promise[Double] = js.native
    
    @JSImport("nodegit/submodule", "Submodule.setUrl")
    @js.native
    def setUrl(repo: Repository, name: String, url: String): js.Promise[Double] = js.native
    
    @JSImport("nodegit/submodule", "Submodule.status")
    @js.native
    def status(repo: Repository, name: String, ignore: Double): js.Promise[Double] = js.native
    
    @JSImport("nodegit/submodule", "Submodule.updateInitOptions")
    @js.native
    def updateInitOptions(opts: SubmoduleUpdateOptions, version: Double): Double = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`-1`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
      - typings.nodegit.nodegitNumbers.`4`
    */
    trait IGNORE extends StObject
    object IGNORE {
      
      @scala.inline
      def ALL: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def DIRTY: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def NONE: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def UNSPECIFIED: `-1` = -1.asInstanceOf[`-1`]
      
      @scala.inline
      def UNTRACKED: `2` = 2.asInstanceOf[`2`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
    */
    trait RECURSE extends StObject
    object RECURSE {
      
      @scala.inline
      def NO: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def ONDEMAND: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def YES: `1` = 1.asInstanceOf[`1`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`8`
      - typings.nodegit.nodegitNumbers.`16`
      - typings.nodegit.nodegitNumbers.`32`
      - typings.nodegit.nodegitNumbers.`64`
      - typings.nodegit.nodegitNumbers.`128`
      - typings.nodegit.nodegitNumbers.`256`
      - typings.nodegit.nodegitNumbers.`512`
      - typings.nodegit.nodegitNumbers.`1024`
      - typings.nodegit.nodegitNumbers.`2048`
      - typings.nodegit.nodegitNumbers.`4096`
      - typings.nodegit.nodegitNumbers.`8192`
    */
    trait STATUS extends StObject
    object STATUS {
      
      @scala.inline
      def INDEX_ADDED: `16` = 16.asInstanceOf[`16`]
      
      @scala.inline
      def INDEX_DELETED: `32` = 32.asInstanceOf[`32`]
      
      @scala.inline
      def INDEX_MODIFIED: `64` = 64.asInstanceOf[`64`]
      
      @scala.inline
      def IN_CONFIG: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def IN_HEAD: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def IN_INDEX: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def IN_WD: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def WD_ADDED: `256` = 256.asInstanceOf[`256`]
      
      @scala.inline
      def WD_DELETED: `512` = 512.asInstanceOf[`512`]
      
      @scala.inline
      def WD_INDEX_MODIFIED: `2048` = 2048.asInstanceOf[`2048`]
      
      @scala.inline
      def WD_MODIFIED: `1024` = 1024.asInstanceOf[`1024`]
      
      @scala.inline
      def WD_UNINITIALIZED: `128` = 128.asInstanceOf[`128`]
      
      @scala.inline
      def WD_UNTRACKED: `8192` = 8192.asInstanceOf[`8192`]
      
      @scala.inline
      def WD_WD_MODIFIED: `4096` = 4096.asInstanceOf[`4096`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`0`
    */
    trait UPDATE extends StObject
    object UPDATE {
      
      @scala.inline
      def CHECKOUT: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def DEFAULT: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def MERGE: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def NONE: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def REBASE: `2` = 2.asInstanceOf[`2`]
    }
  }
}
