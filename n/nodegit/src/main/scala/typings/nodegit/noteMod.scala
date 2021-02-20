package typings.nodegit

import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @JSImport("nodegit/note", "Note.create")
    @js.native
    def create(
      repo: Repository,
      notesRef: String,
      author: Signature,
      committer: Signature,
      oid: Oid,
      note: String,
      force: Double
    ): js.Promise[Oid] = js.native
    
    @JSImport("nodegit/note", "Note.foreach")
    @js.native
    def foreach(repo: Repository, notesRef: String, noteCb: js.Function, payload: js.Any): js.Promise[Double] = js.native
    
    @JSImport("nodegit/note", "Note.iteratorNew")
    @js.native
    def iteratorNew(repo: Repository, notesRef: String): js.Promise[_] = js.native
    
    @JSImport("nodegit/note", "Note.next")
    @js.native
    def next(noteId: Oid, annotatedId: Oid, it: js.Any): Double = js.native
    
    @JSImport("nodegit/note", "Note.read")
    @js.native
    def read(repo: Repository, notesRef: String, oid: Oid): js.Promise[Note] = js.native
    
    @JSImport("nodegit/note", "Note.remove")
    @js.native
    def remove(repo: Repository, notesRef: String, author: Signature, committer: Signature, oid: Oid): js.Promise[Double] = js.native
  }
}
