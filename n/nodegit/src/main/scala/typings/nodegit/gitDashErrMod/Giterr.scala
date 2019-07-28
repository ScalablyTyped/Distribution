package typings.nodegit.gitDashErrMod

import typings.nodegit.errorMod.Error
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
  def errClear(): Unit = js.native
  def errLast(): Error = js.native
  def errSetOom(): Unit = js.native
  def errSetString(errorClass: Double, string: String): Unit = js.native
}

