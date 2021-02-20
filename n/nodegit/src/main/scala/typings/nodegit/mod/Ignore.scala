package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Ignore")
@js.native
class Ignore ()
  extends typings.nodegit.ignoreMod.Ignore
/* static members */
object Ignore {
  
  @JSImport("nodegit", "Ignore.addRule")
  @js.native
  def addRule(repo: typings.nodegit.repositoryMod.Repository, rules: String): Double = js.native
  
  @JSImport("nodegit", "Ignore.clearInternalRules")
  @js.native
  def clearInternalRules(repo: typings.nodegit.repositoryMod.Repository): Double = js.native
  
  @JSImport("nodegit", "Ignore.pathIsIgnored")
  @js.native
  def pathIsIgnored(repo: typings.nodegit.repositoryMod.Repository, path: String): js.Promise[Double] = js.native
}
