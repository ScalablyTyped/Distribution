package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Note")
@js.native
class Note ()
  extends typings.nodegit.noteMod.Note

/* static members */
@JSImport("nodegit", "Note")
@js.native
object Note extends js.Object {
  def create(
    repo: typings.nodegit.repositoryMod.Repository,
    notesRef: String,
    author: typings.nodegit.signatureMod.Signature,
    committer: typings.nodegit.signatureMod.Signature,
    oid: typings.nodegit.oidMod.Oid,
    note: String,
    force: Double
  ): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  def foreach(
    repo: typings.nodegit.repositoryMod.Repository,
    notesRef: String,
    noteCb: js.Function,
    payload: js.Any
  ): js.Promise[Double] = js.native
  def iteratorNew(repo: typings.nodegit.repositoryMod.Repository, notesRef: String): js.Promise[_] = js.native
  def next(noteId: typings.nodegit.oidMod.Oid, annotatedId: typings.nodegit.oidMod.Oid, it: js.Any): Double = js.native
  def read(repo: typings.nodegit.repositoryMod.Repository, notesRef: String, oid: typings.nodegit.oidMod.Oid): js.Promise[typings.nodegit.noteMod.Note] = js.native
  def remove(
    repo: typings.nodegit.repositoryMod.Repository,
    notesRef: String,
    author: typings.nodegit.signatureMod.Signature,
    committer: typings.nodegit.signatureMod.Signature,
    oid: typings.nodegit.oidMod.Oid
  ): js.Promise[Double] = js.native
}

