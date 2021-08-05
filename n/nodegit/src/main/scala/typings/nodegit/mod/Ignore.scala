package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Ignore")
@js.native
class Ignore ()
  extends typings.nodegit.ignoreMod.Ignore
/* static members */
object Ignore {
  
  @JSImport("nodegit", "Ignore")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addRule(repo: typings.nodegit.repositoryMod.Repository, rules: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(repo.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def clearInternalRules(repo: typings.nodegit.repositoryMod.Repository): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInternalRules")(repo.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def pathIsIgnored(repo: typings.nodegit.repositoryMod.Repository, path: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathIsIgnored")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
}
