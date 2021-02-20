package typings.nodegit

import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ignoreMod {
  
  @JSImport("nodegit/ignore", "Ignore")
  @js.native
  class Ignore () extends StObject
  /* static members */
  object Ignore {
    
    @JSImport("nodegit/ignore", "Ignore.addRule")
    @js.native
    def addRule(repo: Repository, rules: String): Double = js.native
    
    @JSImport("nodegit/ignore", "Ignore.clearInternalRules")
    @js.native
    def clearInternalRules(repo: Repository): Double = js.native
    
    @JSImport("nodegit/ignore", "Ignore.pathIsIgnored")
    @js.native
    def pathIsIgnored(repo: Repository, path: String): js.Promise[Double] = js.native
  }
}
