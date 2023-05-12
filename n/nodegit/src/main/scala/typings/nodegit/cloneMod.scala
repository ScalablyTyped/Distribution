package typings.nodegit

import typings.nodegit.cloneOptionsMod.CloneOptions
import typings.nodegit.nodegitInts.`0`
import typings.nodegit.nodegitInts.`1`
import typings.nodegit.nodegitInts.`2`
import typings.nodegit.nodegitInts.`3`
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloneMod {
  
  object Clone {
    
    inline def apply(url: String, localPath: String): js.Promise[Repository] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], localPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Repository]]
    inline def apply(url: String, localPath: String, options: CloneOptions): js.Promise[Repository] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], localPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Repository]]
    
    @JSImport("nodegit/clone", "Clone")
    @js.native
    val ^ : js.Any = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`0`
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`3`
    */
    trait LOCAL extends StObject
    object LOCAL {
      
      inline def AUTO: `0` = 0.asInstanceOf[`0`]
      
      inline def LOCAL: `1` = 1.asInstanceOf[`1`]
      
      inline def NO_LINKS: `3` = 3.asInstanceOf[`3`]
      
      inline def NO_LOCAL: `2` = 2.asInstanceOf[`2`]
    }
  }
}
