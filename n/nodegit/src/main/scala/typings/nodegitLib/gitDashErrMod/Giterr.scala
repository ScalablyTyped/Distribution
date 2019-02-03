package typings
package nodegitLib.gitDashErrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/git-err", "Giterr")
@js.native
class Giterr () extends js.Object

/* static members */
@JSImport("nodegit/git-err", "Giterr")
@js.native
object Giterr extends js.Object {
  def errClear(): scala.Unit = js.native
  def errLast(): nodegitLib.errorMod.Error = js.native
  def errSetOom(): scala.Unit = js.native
  def errSetString(errorClass: scala.Double, string: java.lang.String): scala.Unit = js.native
}

