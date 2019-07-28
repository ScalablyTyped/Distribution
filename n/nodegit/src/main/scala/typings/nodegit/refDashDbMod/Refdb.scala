package typings.nodegit.refDashDbMod

import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/ref-db", "Refdb")
@js.native
class Refdb () extends js.Object {
  def compress(): Double = js.native
  def free(): Unit = js.native
}

/* static members */
@JSImport("nodegit/ref-db", "Refdb")
@js.native
object Refdb extends js.Object {
  def open(repo: Repository): js.Promise[Refdb] = js.native
}

