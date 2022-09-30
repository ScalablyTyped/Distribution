package typings.nodegit

import typings.nodegit.nodegitInts.`1`
import typings.nodegit.nodegitInts.`2`
import typings.nodegit.nodegitInts.`4`
import typings.nodegit.objectMod.Object
import typings.nodegit.referenceMod.Reference
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revParseMod {
  
  @JSImport("nodegit/rev-parse", "Revparse")
  @js.native
  open class Revparse () extends StObject
  /* static members */
  object Revparse {
    
    @JSImport("nodegit/rev-parse", "Revparse")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ext(objectOut: Object, referenceOut: Reference, repo: Repository, spec: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ext")(objectOut.asInstanceOf[js.Any], referenceOut.asInstanceOf[js.Any], repo.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def single(repo: Repository, spec: String): js.Promise[Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("single")(repo.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Object]]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`4`
    */
    trait MODE extends StObject
    object MODE {
      
      inline def MERGE_BASE: `4` = 4.asInstanceOf[`4`]
      
      inline def RANGE: `2` = 2.asInstanceOf[`2`]
      
      inline def SINGLE: `1` = 1.asInstanceOf[`1`]
    }
  }
}
