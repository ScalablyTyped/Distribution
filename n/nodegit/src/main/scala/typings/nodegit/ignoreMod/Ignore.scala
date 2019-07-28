package typings.nodegit.ignoreMod

import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/ignore", "Ignore")
@js.native
class Ignore () extends js.Object

/* static members */
@JSImport("nodegit/ignore", "Ignore")
@js.native
object Ignore extends js.Object {
  def addRule(repo: Repository, rules: String): Double = js.native
  def clearInternalRules(repo: Repository): Double = js.native
  def pathIsIgnored(repo: Repository, path: String): js.Promise[Double] = js.native
}

