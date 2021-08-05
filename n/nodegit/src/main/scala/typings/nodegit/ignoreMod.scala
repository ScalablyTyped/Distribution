package typings.nodegit

import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ignoreMod {
  
  @JSImport("nodegit/ignore", "Ignore")
  @js.native
  class Ignore () extends StObject
  /* static members */
  object Ignore {
    
    @JSImport("nodegit/ignore", "Ignore")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addRule(repo: Repository, rules: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(repo.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def clearInternalRules(repo: Repository): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInternalRules")(repo.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def pathIsIgnored(repo: Repository, path: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathIsIgnored")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  }
}
