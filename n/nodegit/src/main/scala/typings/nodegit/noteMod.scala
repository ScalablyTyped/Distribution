package typings.nodegit

import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noteMod {
  
  @JSImport("nodegit/note", "Note")
  @js.native
  class Note () extends StObject {
    
    def author(): Signature = js.native
    
    def committer(): Signature = js.native
    
    def free(): Unit = js.native
    
    def id(): Oid = js.native
    
    def message(): String = js.native
  }
  /* static members */
  object Note {
    
    @JSImport("nodegit/note", "Note")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(
      repo: Repository,
      notesRef: String,
      author: Signature,
      committer: Signature,
      oid: Oid,
      note: String,
      force: Double
    ): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], author.asInstanceOf[js.Any], committer.asInstanceOf[js.Any], oid.asInstanceOf[js.Any], note.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    @scala.inline
    def foreach(repo: Repository, notesRef: String, noteCb: js.Function, payload: js.Any): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], noteCb.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    @scala.inline
    def iteratorNew(repo: Repository, notesRef: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("iteratorNew")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    @scala.inline
    def next(noteId: Oid, annotatedId: Oid, it: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(noteId.asInstanceOf[js.Any], annotatedId.asInstanceOf[js.Any], it.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def read(repo: Repository, notesRef: String, oid: Oid): js.Promise[Note] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], oid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Note]]
    
    @scala.inline
    def remove(repo: Repository, notesRef: String, author: Signature, committer: Signature, oid: Oid): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], author.asInstanceOf[js.Any], committer.asInstanceOf[js.Any], oid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  }
}
