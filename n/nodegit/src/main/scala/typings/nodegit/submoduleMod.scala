package typings.nodegit

import typings.nodegit.bufMod.Buf
import typings.nodegit.nodegitInts.`-1`
import typings.nodegit.nodegitInts.`0`
import typings.nodegit.nodegitInts.`1024`
import typings.nodegit.nodegitInts.`128`
import typings.nodegit.nodegitInts.`16`
import typings.nodegit.nodegitInts.`1`
import typings.nodegit.nodegitInts.`2048`
import typings.nodegit.nodegitInts.`256`
import typings.nodegit.nodegitInts.`2`
import typings.nodegit.nodegitInts.`32`
import typings.nodegit.nodegitInts.`3`
import typings.nodegit.nodegitInts.`4096`
import typings.nodegit.nodegitInts.`4`
import typings.nodegit.nodegitInts.`512`
import typings.nodegit.nodegitInts.`64`
import typings.nodegit.nodegitInts.`8192`
import typings.nodegit.nodegitInts.`8`
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.submoduleUpdateOptionsMod.SubmoduleUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object submoduleMod {
  
  @JSImport("nodegit/submodule", "Submodule")
  @js.native
  open class Submodule () extends StObject {
    
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
    
    @JSImport("nodegit/submodule", "Submodule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addSetup(repo: Repository, url: String, path: String, useGitLink: Double): js.Promise[Submodule] = (^.asInstanceOf[js.Dynamic].applyDynamic("addSetup")(repo.asInstanceOf[js.Any], url.asInstanceOf[js.Any], path.asInstanceOf[js.Any], useGitLink.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Submodule]]
    
    inline def foreach(repo: Repository): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    inline def foreach(repo: Repository, callback: js.Function): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def lookup(repo: Repository, name: String): js.Promise[Submodule] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Submodule]]
    
    inline def resolveUrl(repo: Repository, url: String): js.Promise[Buf] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveUrl")(repo.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buf]]
    
    inline def setBranch(repo: Repository, name: String, branch: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setBranch")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], branch.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def setFetchRecurseSubmodules(repo: Repository, name: String, fetchRecurseSubmodules: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setFetchRecurseSubmodules")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fetchRecurseSubmodules.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def setIgnore(repo: Repository, name: String, ignore: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIgnore")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def setUpdate(repo: Repository, name: String, update: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpdate")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def setUrl(repo: Repository, name: String, url: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUrl")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def status(repo: Repository, name: String, ignore: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("status")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def updateInitOptions(opts: SubmoduleUpdateOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("updateInitOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`-1`
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`3`
      - typings.nodegit.nodegitInts.`4`
    */
    trait IGNORE extends StObject
    object IGNORE {
      
      inline def ALL: `4` = 4.asInstanceOf[`4`]
      
      inline def DIRTY: `3` = 3.asInstanceOf[`3`]
      
      inline def NONE: `1` = 1.asInstanceOf[`1`]
      
      inline def UNSPECIFIED: `-1` = -1.asInstanceOf[`-1`]
      
      inline def UNTRACKED: `2` = 2.asInstanceOf[`2`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`0`
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
    */
    trait RECURSE extends StObject
    object RECURSE {
      
      inline def NO: `0` = 0.asInstanceOf[`0`]
      
      inline def ONDEMAND: `2` = 2.asInstanceOf[`2`]
      
      inline def YES: `1` = 1.asInstanceOf[`1`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`4`
      - typings.nodegit.nodegitInts.`8`
      - typings.nodegit.nodegitInts.`16`
      - typings.nodegit.nodegitInts.`32`
      - typings.nodegit.nodegitInts.`64`
      - typings.nodegit.nodegitInts.`128`
      - typings.nodegit.nodegitInts.`256`
      - typings.nodegit.nodegitInts.`512`
      - typings.nodegit.nodegitInts.`1024`
      - typings.nodegit.nodegitInts.`2048`
      - typings.nodegit.nodegitInts.`4096`
      - typings.nodegit.nodegitInts.`8192`
    */
    trait STATUS extends StObject
    object STATUS {
      
      inline def INDEX_ADDED: `16` = 16.asInstanceOf[`16`]
      
      inline def INDEX_DELETED: `32` = 32.asInstanceOf[`32`]
      
      inline def INDEX_MODIFIED: `64` = 64.asInstanceOf[`64`]
      
      inline def IN_CONFIG: `4` = 4.asInstanceOf[`4`]
      
      inline def IN_HEAD: `1` = 1.asInstanceOf[`1`]
      
      inline def IN_INDEX: `2` = 2.asInstanceOf[`2`]
      
      inline def IN_WD: `8` = 8.asInstanceOf[`8`]
      
      inline def WD_ADDED: `256` = 256.asInstanceOf[`256`]
      
      inline def WD_DELETED: `512` = 512.asInstanceOf[`512`]
      
      inline def WD_INDEX_MODIFIED: `2048` = 2048.asInstanceOf[`2048`]
      
      inline def WD_MODIFIED: `1024` = 1024.asInstanceOf[`1024`]
      
      inline def WD_UNINITIALIZED: `128` = 128.asInstanceOf[`128`]
      
      inline def WD_UNTRACKED: `8192` = 8192.asInstanceOf[`8192`]
      
      inline def WD_WD_MODIFIED: `4096` = 4096.asInstanceOf[`4096`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`3`
      - typings.nodegit.nodegitInts.`4`
      - typings.nodegit.nodegitInts.`0`
    */
    trait UPDATE extends StObject
    object UPDATE {
      
      inline def CHECKOUT: `1` = 1.asInstanceOf[`1`]
      
      inline def DEFAULT: `0` = 0.asInstanceOf[`0`]
      
      inline def MERGE: `3` = 3.asInstanceOf[`3`]
      
      inline def NONE: `4` = 4.asInstanceOf[`4`]
      
      inline def REBASE: `2` = 2.asInstanceOf[`2`]
    }
  }
}
