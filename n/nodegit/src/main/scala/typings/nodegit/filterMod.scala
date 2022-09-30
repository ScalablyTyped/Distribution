package typings.nodegit

import typings.node.fsMod.WriteStream
import typings.nodegit.blobMod.Blob
import typings.nodegit.bufMod.Buf
import typings.nodegit.nodegitInts.`0`
import typings.nodegit.nodegitInts.`1`
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("nodegit/filter", "Filter")
  @js.native
  open class Filter () extends StObject {
    
    var attributes: String = js.native
    
    def lookup(name: String): Filter = js.native
    
    def register(name: String, priority: Double): Double = js.native
    
    var stream: js.Function = js.native
    
    var version: Double = js.native
  }
  /* static members */
  object Filter {
    
    @JSImport("nodegit/filter", "Filter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def listContains(filters: Any, name: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listContains")(filters.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def listLength(fl: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("listLength")(fl.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def listNew(repo: Repository, mode: Double, options: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("listNew")(repo.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def listStreamBlob(filters: Any, blob: Blob, target: WriteStream): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listStreamBlob")(filters.asInstanceOf[js.Any], blob.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def listStreamData(filters: Any, data: Buf, target: WriteStream): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listStreamData")(filters.asInstanceOf[js.Any], data.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def listStreamFile(filters: Any, repo: Repository, path: String, target: WriteStream): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listStreamFile")(filters.asInstanceOf[js.Any], repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def unregister(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`0`
      - typings.nodegit.nodegitInts.`1`
    */
    trait FLAG extends StObject
    object FLAG {
      
      inline def ALLOW_UNSAFE: `1` = 1.asInstanceOf[`1`]
      
      inline def DEFAULT: `0` = 0.asInstanceOf[`0`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`0`
      - typings.nodegit.nodegitInts.`1`
    */
    trait MODE extends StObject
    object MODE {
      
      inline def CLEAN: `1` = 1.asInstanceOf[`1`]
      
      inline def SMUDGE: `0` = 0.asInstanceOf[`0`]
      
      inline def TO_ODB: `1` = 1.asInstanceOf[`1`]
      
      inline def TO_WORKTREE: `0` = 0.asInstanceOf[`0`]
    }
  }
}
