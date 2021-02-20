package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Note")
@js.native
class Note ()
  extends typings.nodegit.noteMod.Note
/* static members */
object Note {
  
  @JSImport("nodegit", "Note.create")
  @js.native
  def create(
    repo: typings.nodegit.repositoryMod.Repository,
    notesRef: String,
    author: typings.nodegit.signatureMod.Signature,
    committer: typings.nodegit.signatureMod.Signature,
    oid: typings.nodegit.oidMod.Oid,
    note: String,
    force: Double
  ): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  
  @JSImport("nodegit", "Note.foreach")
  @js.native
  def foreach(
    repo: typings.nodegit.repositoryMod.Repository,
    notesRef: String,
    noteCb: js.Function,
    payload: js.Any
  ): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Note.iteratorNew")
  @js.native
  def iteratorNew(repo: typings.nodegit.repositoryMod.Repository, notesRef: String): js.Promise[_] = js.native
  
  @JSImport("nodegit", "Note.next")
  @js.native
  def next(noteId: typings.nodegit.oidMod.Oid, annotatedId: typings.nodegit.oidMod.Oid, it: js.Any): Double = js.native
  
  @JSImport("nodegit", "Note.read")
  @js.native
  def read(repo: typings.nodegit.repositoryMod.Repository, notesRef: String, oid: typings.nodegit.oidMod.Oid): js.Promise[typings.nodegit.noteMod.Note] = js.native
  
  @JSImport("nodegit", "Note.remove")
  @js.native
  def remove(
    repo: typings.nodegit.repositoryMod.Repository,
    notesRef: String,
    author: typings.nodegit.signatureMod.Signature,
    committer: typings.nodegit.signatureMod.Signature,
    oid: typings.nodegit.oidMod.Oid
  ): js.Promise[Double] = js.native
}
