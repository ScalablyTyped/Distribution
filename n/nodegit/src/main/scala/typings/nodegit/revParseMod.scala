package typings.nodegit

import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.objectMod.Object
import typings.nodegit.referenceMod.Reference
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revParseMod {
  
  @JSImport("nodegit/rev-parse", "Revparse")
  @js.native
  class Revparse () extends StObject
  /* static members */
  object Revparse {
    
    @JSImport("nodegit/rev-parse", "Revparse.ext")
    @js.native
    def ext(objectOut: Object, referenceOut: Reference, repo: Repository, spec: String): Double = js.native
    
    @JSImport("nodegit/rev-parse", "Revparse.single")
    @js.native
    def single(repo: Repository, spec: String): js.Promise[Object] = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
    */
    trait MODE extends StObject
    object MODE {
      
      @scala.inline
      def MERGE_BASE: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def RANGE: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def SINGLE: `1` = 1.asInstanceOf[`1`]
    }
  }
}
