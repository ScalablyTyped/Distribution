package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Refdb")
@js.native
class Refdb ()
  extends typings.nodegit.refDbMod.Refdb

/* static members */
@JSImport("nodegit", "Refdb")
@js.native
object Refdb extends js.Object {
  def open(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.refDbMod.Refdb] = js.native
}

