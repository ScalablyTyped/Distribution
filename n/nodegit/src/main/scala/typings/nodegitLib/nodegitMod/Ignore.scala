package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Ignore")
@js.native
class Ignore ()
  extends nodegitLib.ignoreMod.Ignore

/* static members */
@JSImport("nodegit", "Ignore")
@js.native
object Ignore extends js.Object {
  def addRule(repo: nodegitLib.repositoryMod.Repository, rules: java.lang.String): scala.Double = js.native
  def clearInternalRules(repo: nodegitLib.repositoryMod.Repository): scala.Double = js.native
  def pathIsIgnored(repo: nodegitLib.repositoryMod.Repository, path: java.lang.String): js.Promise[scala.Double] = js.native
}

