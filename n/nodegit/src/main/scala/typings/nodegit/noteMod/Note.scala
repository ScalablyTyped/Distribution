package typings.nodegit.noteMod

import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/note", "Note")
@js.native
class Note () extends js.Object {
  def author(): Signature = js.native
  def committer(): Signature = js.native
  def free(): Unit = js.native
  def id(): Oid = js.native
  def message(): String = js.native
}

/* static members */
@JSImport("nodegit/note", "Note")
@js.native
object Note extends js.Object {
  def create(
    repo: Repository,
    notesRef: String,
    author: Signature,
    committer: Signature,
    oid: Oid,
    note: String,
    force: Double
  ): js.Promise[Oid] = js.native
  def foreach(repo: Repository, notesRef: String, noteCb: js.Function, payload: js.Any): js.Promise[Double] = js.native
  def iteratorNew(repo: Repository, notesRef: String): js.Promise[_] = js.native
  def next(noteId: Oid, annotatedId: Oid, it: js.Any): Double = js.native
  def read(repo: Repository, notesRef: String, oid: Oid): js.Promise[Note] = js.native
  def remove(repo: Repository, notesRef: String, author: Signature, committer: Signature, oid: Oid): js.Promise[Double] = js.native
}

