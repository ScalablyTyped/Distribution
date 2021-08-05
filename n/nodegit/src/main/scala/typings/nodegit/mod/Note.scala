package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Note")
@js.native
class Note ()
  extends typings.nodegit.noteMod.Note
/* static members */
object Note {
  
  @JSImport("nodegit", "Note")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    repo: typings.nodegit.repositoryMod.Repository,
    notesRef: String,
    author: typings.nodegit.signatureMod.Signature,
    committer: typings.nodegit.signatureMod.Signature,
    oid: typings.nodegit.oidMod.Oid,
    note: String,
    force: Double
  ): js.Promise[typings.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], author.asInstanceOf[js.Any], committer.asInstanceOf[js.Any], oid.asInstanceOf[js.Any], note.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.oidMod.Oid]]
  
  inline def foreach(
    repo: typings.nodegit.repositoryMod.Repository,
    notesRef: String,
    noteCb: js.Function,
    payload: js.Any
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], noteCb.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def iteratorNew(repo: typings.nodegit.repositoryMod.Repository, notesRef: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("iteratorNew")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  inline def next(noteId: typings.nodegit.oidMod.Oid, annotatedId: typings.nodegit.oidMod.Oid, it: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(noteId.asInstanceOf[js.Any], annotatedId.asInstanceOf[js.Any], it.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def read(repo: typings.nodegit.repositoryMod.Repository, notesRef: String, oid: typings.nodegit.oidMod.Oid): js.Promise[typings.nodegit.noteMod.Note] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], oid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.noteMod.Note]]
  
  inline def remove(
    repo: typings.nodegit.repositoryMod.Repository,
    notesRef: String,
    author: typings.nodegit.signatureMod.Signature,
    committer: typings.nodegit.signatureMod.Signature,
    oid: typings.nodegit.oidMod.Oid
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], author.asInstanceOf[js.Any], committer.asInstanceOf[js.Any], oid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
}
