package typings
package nodegitLib.commitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/commit", "Commit")
@js.native
class Commit () extends js.Object {
  def amend(
    updateRef: java.lang.String,
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    messageEncoding: java.lang.String,
    message: java.lang.String,
    tree: nodegitLib.treeMod.Tree
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def author(): nodegitLib.signatureMod.Signature = js.native
  /**
       * consists of a summary
       *
       *
       */
  def body(): java.lang.String = js.native
  def committer(): nodegitLib.signatureMod.Signature = js.native
  /**
       * Retrieve the commit time as a Date object.
       *
       *
       */
  def date(): stdLib.Date = js.native
  def dup(): stdLib.Promise[Commit] = js.native
  def free(): scala.Unit = js.native
  /**
       * Generate an array of diff trees showing changes between this commit and its parent(s).
       *
       *
       */
  def getDiff(): stdLib.Promise[js.Array[nodegitLib.diffMod.Diff]] = js.native
  /**
       * Generate an array of diff trees showing changes between this commit and its parent(s).
       *
       *
       */
  def getDiff(callback: js.Function): stdLib.Promise[js.Array[nodegitLib.diffMod.Diff]] = js.native
  /**
       * Generate an array of diff trees showing changes between this commit and its parent(s).
       *
       *
       */
  def getDiffWithOptions(options: js.Object): stdLib.Promise[js.Array[nodegitLib.diffMod.Diff]] = js.native
  /**
       * Generate an array of diff trees showing changes between this commit and its parent(s).
       *
       *
       */
  def getDiffWithOptions(options: js.Object, callback: js.Function): stdLib.Promise[js.Array[nodegitLib.diffMod.Diff]] = js.native
  /**
       * Retrieve the entry represented by path for this commit. Path must be relative to repository root.
       *
       *
       */
  def getEntry(path: java.lang.String): stdLib.Promise[nodegitLib.treeDashEntryMod.TreeEntry] = js.native
  /**
       * Retrieve the commit's parents as commit objects.
       *
       *
       */
  def getParents(limit: scala.Double): stdLib.Promise[js.Array[Commit]] = js.native
  /**
       * Retrieve the commit's parents as commit objects.
       *
       *
       */
  def getParents(limit: scala.Double, callback: js.Function): stdLib.Promise[js.Array[Commit]] = js.native
  /**
       * Get the tree associated with this commit.
       *
       *
       */
  def getTree(): stdLib.Promise[nodegitLib.treeMod.Tree] = js.native
  def headerField(field: java.lang.String): stdLib.Promise[nodegitLib.bufMod.Buf] = js.native
  /**
       * Walk the history from this commit backwards.
       * An EventEmitter is returned that will emit a "commit" event for each commit in the history, and one "end"
       * event when the walk is completed. Don't forget to call start() on the returned event.
       *
       *
       */
  def history(): nodeLib.eventsMod.EventEmitter = js.native
  def id(): nodegitLib.oidMod.Oid = js.native
  def message(): java.lang.String = js.native
  def messageEncoding(): java.lang.String = js.native
  def messageRaw(): java.lang.String = js.native
  def nthGenAncestor(n: scala.Double): stdLib.Promise[Commit] = js.native
  def owner(): nodegitLib.repositoryMod.Repository = js.native
  def parent(n: scala.Double): stdLib.Promise[Commit] = js.native
  def parentId(n: scala.Double): nodegitLib.oidMod.Oid = js.native
  def parentcount(): scala.Double = js.native
  /**
       * Retrieve the commit's parent shas.
       *
       *
       */
  def parents(): js.Array[nodegitLib.oidMod.Oid] = js.native
  def rawHeader(): java.lang.String = js.native
  /**
       * Retrieve the SHA.
       *
       *
       */
  def sha(): java.lang.String = js.native
  def summary(): java.lang.String = js.native
  def time(): scala.Double = js.native
  /**
       * Retrieve the commit time as a unix timestamp.
       *
       *
       */
  def timeMs(): scala.Double = js.native
  def timeOffset(): scala.Double = js.native
  def tree(treeOut: nodegitLib.treeMod.Tree): scala.Double = js.native
  def treeId(): nodegitLib.oidMod.Oid = js.native
}

@JSImport("nodegit/commit", "Commit")
@js.native
object Commit extends js.Object {
  def create(
    repo: nodegitLib.repositoryMod.Repository,
    updateRef: java.lang.String,
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    messageEncoding: java.lang.String,
    message: java.lang.String,
    tree: nodegitLib.treeMod.Tree,
    parentCount: scala.Double,
    parents: js.Array[_]
  ): nodegitLib.oidMod.Oid = js.native
  def createV(
    id: nodegitLib.oidMod.Oid,
    repo: nodegitLib.repositoryMod.Repository,
    updateRef: java.lang.String,
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    messageEncoding: java.lang.String,
    message: java.lang.String,
    tree: nodegitLib.treeMod.Tree,
    parentCount: scala.Double
  ): scala.Double = js.native
  def createWithSignature(
    repo: nodegitLib.repositoryMod.Repository,
    commitContent: java.lang.String,
    signature: java.lang.String,
    signatureField: java.lang.String
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  /**
       * Retrieves the commit pointed to by the oid
       *
       *
       */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String): stdLib.Promise[nodegitLib.commitMod.Commit] = js.native
  /**
       * Retrieves the commit pointed to by the oid
       *
       *
       */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.commitMod.Commit): stdLib.Promise[nodegitLib.commitMod.Commit] = js.native
  /**
       * Retrieves the commit pointed to by the oid
       *
       *
       */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid): stdLib.Promise[nodegitLib.commitMod.Commit] = js.native
  def lookupPrefix(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid, len: scala.Double): stdLib.Promise[nodegitLib.commitMod.Commit] = js.native
}

