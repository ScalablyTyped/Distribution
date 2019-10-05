package typings.nodegit

import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/ignore", JSImport.Namespace)
@js.native
object ignoreMod extends js.Object {
  @js.native
  class Ignore () extends js.Object
  
  /* static members */
  @js.native
  object Ignore extends js.Object {
    def addRule(repo: Repository, rules: String): Double = js.native
    def clearInternalRules(repo: Repository): Double = js.native
    def pathIsIgnored(repo: Repository, path: String): js.Promise[Double] = js.native
  }
  
}

