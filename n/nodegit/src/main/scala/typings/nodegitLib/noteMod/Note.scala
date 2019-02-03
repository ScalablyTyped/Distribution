package typings
package nodegitLib.noteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/note", "Note")
@js.native
class Note () extends js.Object {
  def author(): nodegitLib.signatureMod.Signature = js.native
  def committer(): nodegitLib.signatureMod.Signature = js.native
  def free(): scala.Unit = js.native
  def id(): nodegitLib.oidMod.Oid = js.native
  def message(): java.lang.String = js.native
}

/* static members */
@JSImport("nodegit/note", "Note")
@js.native
object Note extends js.Object {
  def create(
    repo: nodegitLib.repositoryMod.Repository,
    notesRef: java.lang.String,
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    oid: nodegitLib.oidMod.Oid,
    note: java.lang.String,
    force: scala.Double
  ): js.Promise[nodegitLib.oidMod.Oid] = js.native
  def foreach(
    repo: nodegitLib.repositoryMod.Repository,
    notesRef: java.lang.String,
    noteCb: js.Function,
    payload: js.Any
  ): js.Promise[scala.Double] = js.native
  def iteratorNew(repo: nodegitLib.repositoryMod.Repository, notesRef: java.lang.String): js.Promise[_] = js.native
  def next(noteId: nodegitLib.oidMod.Oid, annotatedId: nodegitLib.oidMod.Oid, it: js.Any): scala.Double = js.native
  def read(repo: nodegitLib.repositoryMod.Repository, notesRef: java.lang.String, oid: nodegitLib.oidMod.Oid): js.Promise[nodegitLib.noteMod.Note] = js.native
  def remove(
    repo: nodegitLib.repositoryMod.Repository,
    notesRef: java.lang.String,
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    oid: nodegitLib.oidMod.Oid
  ): js.Promise[scala.Double] = js.native
}

