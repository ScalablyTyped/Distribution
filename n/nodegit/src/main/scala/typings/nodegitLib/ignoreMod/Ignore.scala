package typings
package nodegitLib.ignoreMod

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
  def addRule(repo: nodegitLib.repositoryMod.Repository, rules: java.lang.String): scala.Double = js.native
  def clearInternalRules(repo: nodegitLib.repositoryMod.Repository): scala.Double = js.native
  def pathIsIgnored(repo: nodegitLib.repositoryMod.Repository, path: java.lang.String): js.Promise[scala.Double] = js.native
}

