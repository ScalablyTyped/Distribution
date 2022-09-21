package typings.nodegit

import typings.nodegit.cloneOptionsMod.CloneOptions
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`3`
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloneMod {
  
  @JSImport("nodegit/clone", "Clone")
  @js.native
  open class Clone () extends StObject
  /* static members */
  object Clone {
    
    @JSImport("nodegit/clone", "Clone")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Patch repository cloning to automatically coerce objects.
      */
    inline def clone(url: String, localPath: String): js.Promise[Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(url.asInstanceOf[js.Any], localPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Repository]]
    inline def clone(url: String, localPath: String, options: CloneOptions): js.Promise[Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(url.asInstanceOf[js.Any], localPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Repository]]
    
    inline def initOptions(opts: CloneOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
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
