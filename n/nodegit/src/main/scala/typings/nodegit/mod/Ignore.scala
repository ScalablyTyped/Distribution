package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Ignore")
@js.native
class Ignore ()
  extends typings.nodegit.ignoreMod.Ignore
/* static members */
@JSImport("nodegit", "Ignore")
@js.native
object Ignore extends js.Object {
  
  def addRule(repo: typings.nodegit.repositoryMod.Repository, rules: String): Double = js.native
  
  def clearInternalRules(repo: typings.nodegit.repositoryMod.Repository): Double = js.native
  
  def pathIsIgnored(repo: typings.nodegit.repositoryMod.Repository, path: String): js.Promise[Double] = js.native
}
