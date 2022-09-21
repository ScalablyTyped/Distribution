package typings.nodegit

import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1024`
import typings.nodegit.nodegitNumbers.`128`
import typings.nodegit.nodegitNumbers.`16384`
import typings.nodegit.nodegitNumbers.`16`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2048`
import typings.nodegit.nodegitNumbers.`256`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`32768`
import typings.nodegit.nodegitNumbers.`32`
import typings.nodegit.nodegitNumbers.`4096`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`512`
import typings.nodegit.nodegitNumbers.`64`
import typings.nodegit.nodegitNumbers.`8192`
import typings.nodegit.nodegitNumbers.`8`
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.statusEntryMod.StatusEntry
import typings.nodegit.statusListMod.StatusList
import typings.nodegit.statusOptionsMod.StatusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusMod {
  
  @JSImport("nodegit/status", "Status")
  @js.native
  open class Status () extends StObject
  /* static members */
  object Status {
    
    @JSImport("nodegit/status", "Status")
    @js.native
    val ^ : js.Any = js.native
    
    inline def byIndex(statuslist: StatusList, idx: Double): StatusEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("byIndex")(statuslist.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[StatusEntry]
    
    inline def file(repo: Repository, path: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def foreach(repo: Repository): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    inline def foreach(repo: Repository, callback: js.Function): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def foreachExt(repo: Repository): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("foreachExt")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    inline def foreachExt(repo: Repository, opts: Unit, callback: js.Function): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreachExt")(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    inline def foreachExt(repo: Repository, opts: StatusOptions): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreachExt")(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    inline def foreachExt(repo: Repository, opts: StatusOptions, callback: js.Function): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreachExt")(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def shouldIgnore(ignored: Double, repo: Repository, path: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldIgnore")(ignored.asInstanceOf[js.Any], repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
      - typings.nodegit.nodegitNumbers.`16384`
      - typings.nodegit.nodegitNumbers.`32768`
    */
    trait OPT extends StObject
    object OPT {
      
      inline def DISABLE_PATHSPEC_MATCH: `32` = 32.asInstanceOf[`32`]
      
      inline def EXCLUDE_SUBMODULES: `8` = 8.asInstanceOf[`8`]
      
      inline def INCLUDE_IGNORED: `2` = 2.asInstanceOf[`2`]
      
      inline def INCLUDE_UNMODIFIED: `4` = 4.asInstanceOf[`4`]
      
      inline def INCLUDE_UNREADABLE: `16384` = 16384.asInstanceOf[`16384`]
      
      inline def INCLUDE_UNREADABLE_AS_UNTRACKED: `32768` = 32768.asInstanceOf[`32768`]
      
      inline def INCLUDE_UNTRACKED: `1` = 1.asInstanceOf[`1`]
      
      inline def NO_REFRESH: `4096` = 4096.asInstanceOf[`4096`]
      
      inline def RECURSE_IGNORED_DIRS: `64` = 64.asInstanceOf[`64`]
      
      inline def RECURSE_UNTRACKED_DIRS: `16` = 16.asInstanceOf[`16`]
      
      inline def RENAMES_FROM_REWRITES: `2048` = 2048.asInstanceOf[`2048`]
      
      inline def RENAMES_HEAD_TO_INDEX: `128` = 128.asInstanceOf[`128`]
      
      inline def RENAMES_INDEX_TO_WORKDIR: `256` = 256.asInstanceOf[`256`]
      
      inline def SORT_CASE_INSENSITIVELY: `1024` = 1024.asInstanceOf[`1024`]
      
      inline def SORT_CASE_SENSITIVELY: `512` = 512.asInstanceOf[`512`]
      
      inline def UPDATE_INDEX: `8192` = 8192.asInstanceOf[`8192`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
    */
    trait SHOW extends StObject
    object SHOW {
      
      inline def INDEX_AND_WORKDIR: `0` = 0.asInstanceOf[`0`]
      
      inline def INDEX_ONLY: `1` = 1.asInstanceOf[`1`]
      
      inline def WORKDIR_ONLY: `2` = 2.asInstanceOf[`2`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`8`
      - typings.nodegit.nodegitNumbers.`16`
      - typings.nodegit.nodegitNumbers.`128`
      - typings.nodegit.nodegitNumbers.`256`
      - typings.nodegit.nodegitNumbers.`512`
      - typings.nodegit.nodegitNumbers.`1024`
      - typings.nodegit.nodegitNumbers.`2048`
      - typings.nodegit.nodegitNumbers.`4096`
      - typings.nodegit.nodegitNumbers.`16384`
      - typings.nodegit.nodegitNumbers.`32768`
    */
    trait STATUS extends StObject
    object STATUS {
      
      inline def CONFLICTED: `32768` = 32768.asInstanceOf[`32768`]
      
      inline def CURRENT: `0` = 0.asInstanceOf[`0`]
      
      inline def IGNORED: `16384` = 16384.asInstanceOf[`16384`]
      
      inline def INDEX_DELETED: `4` = 4.asInstanceOf[`4`]
      
      inline def INDEX_MODIFIED: `2` = 2.asInstanceOf[`2`]
      
      inline def INDEX_NEW: `1` = 1.asInstanceOf[`1`]
      
      inline def INDEX_RENAMED: `8` = 8.asInstanceOf[`8`]
      
      inline def INDEX_TYPECHANGE: `16` = 16.asInstanceOf[`16`]
      
      inline def WT_DELETED: `512` = 512.asInstanceOf[`512`]
      
      inline def WT_MODIFIED: `256` = 256.asInstanceOf[`256`]
      
      inline def WT_NEW: `128` = 128.asInstanceOf[`128`]
      
      inline def WT_RENAMED: `2048` = 2048.asInstanceOf[`2048`]
      
      inline def WT_TYPECHANGE: `1024` = 1024.asInstanceOf[`1024`]
      
      inline def WT_UNREADABLE: `4096` = 4096.asInstanceOf[`4096`]
    }
  }
}
