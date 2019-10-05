package typings.nodegit

import typings.nodegit.refDashDbMod.Refdb
import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/ref-db", JSImport.Namespace)
@js.native
object refDashDbMod extends js.Object {
  @js.native
  class Refdb () extends js.Object {
    def compress(): Double = js.native
    def free(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Refdb extends js.Object {
    def open(repo: Repository): js.Promise[Refdb] = js.native
  }
  
}

