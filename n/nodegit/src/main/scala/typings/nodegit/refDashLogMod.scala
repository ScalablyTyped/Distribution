package typings.nodegit

import typings.nodegit.oidMod.Oid
import typings.nodegit.refDashLogMod.Reflog
import typings.nodegit.refDashLogMod.ReflogEntry
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/ref-log", JSImport.Namespace)
@js.native
object refDashLogMod extends js.Object {
  @js.native
  class Reflog () extends js.Object {
    def append(id: Oid, committer: Signature, msg: String): Double = js.native
    def drop(idx: Double, rewritePreviousEntry: Double): Double = js.native
    def entryByIndex(idx: Double): ReflogEntry = js.native
    def entrycount(): Double = js.native
    def free(): Unit = js.native
    def write(): Double = js.native
  }
  
  @js.native
  class ReflogEntry () extends js.Object {
    def committer(): Signature = js.native
    def idNew(): Oid = js.native
    def idOld(): Oid = js.native
    def message(): String = js.native
  }
  
  /* static members */
  @js.native
  object Reflog extends js.Object {
    def delete(repo: Repository, name: String): Double = js.native
    def read(repo: Repository, name: String): js.Promise[Reflog] = js.native
    def rename(repo: Repository, oldName: String, name: String): Double = js.native
  }
  
}

