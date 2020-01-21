package typings.nodegit

import typings.node.eventsMod.EventEmitter
import typings.nodegit.bufMod.Buf
import typings.nodegit.diffMod.Diff
import typings.nodegit.objectMod.Object
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import typings.nodegit.treeEntryMod.TreeEntry
import typings.nodegit.treeMod.Tree
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/commit", JSImport.Namespace)
@js.native
object commitMod extends js.Object {
  @js.native
  class Commit () extends js.Object {
    def amend(
      updateRef: String,
      author: Signature,
      committer: Signature,
      messageEncoding: String,
      message: String,
      tree: Oid
    ): js.Promise[Oid] = js.native
    def amend(
      updateRef: String,
      author: Signature,
      committer: Signature,
      messageEncoding: String,
      message: String,
      tree: Tree
    ): js.Promise[Oid] = js.native
    def author(): Signature = js.native
    /**
      * consists of a summary
      *
      *
      */
    def body(): String = js.native
    def committer(): Signature = js.native
    /**
      * Retrieve the commit time as a Date object.
      *
      *
      */
    def date(): Date = js.native
    def dup(): js.Promise[Commit] = js.native
    def free(): Unit = js.native
    /**
      * Generate an array of diff trees showing changes between this commit and its parent(s).
      *
      *
      */
    def getDiff(): js.Promise[js.Array[Diff]] = js.native
    def getDiff(callback: js.Function): js.Promise[js.Array[Diff]] = js.native
    /**
      * Generate an array of diff trees showing changes between this commit and its parent(s).
      *
      *
      */
    def getDiffWithOptions(options: Object): js.Promise[js.Array[Diff]] = js.native
    def getDiffWithOptions(options: Object, callback: js.Function): js.Promise[js.Array[Diff]] = js.native
    /**
      * Retrieve the entry represented by path for this commit. Path must be relative to repository root.
      *
      *
      */
    def getEntry(path: String): js.Promise[TreeEntry] = js.native
    /**
      * Retrieve the commit's parents as commit objects.
      *
      *
      */
    def getParents(limit: Double): js.Promise[js.Array[Commit]] = js.native
    def getParents(limit: Double, callback: js.Function): js.Promise[js.Array[Commit]] = js.native
    /**
      * Get the tree associated with this commit.
      *
      *
      */
    def getTree(): js.Promise[Tree] = js.native
    def headerField(field: String): js.Promise[Buf] = js.native
    /**
      * Walk the history from this commit backwards.
      * An EventEmitter is returned that will emit a "commit" event for each commit in the history, and one "end"
      * event when the walk is completed. Don't forget to call start() on the returned EventEmitter.
      *
      *
      */
    def history(): HistoryEventEmitter = js.native
    def id(): Oid = js.native
    def message(): String = js.native
    def messageEncoding(): String = js.native
    def messageRaw(): String = js.native
    def nthGenAncestor(n: Double): js.Promise[Commit] = js.native
    def owner(): Repository = js.native
    def parent(n: Double): js.Promise[Commit] = js.native
    def parentId(n: Double): Oid = js.native
    def parentcount(): Double = js.native
    /**
      * Retrieve the commit's parent shas.
      *
      *
      */
    def parents(): js.Array[Oid] = js.native
    def rawHeader(): String = js.native
    /**
      * Retrieve the SHA.
      *
      *
      */
    def sha(): String = js.native
    def summary(): String = js.native
    def time(): Double = js.native
    /**
      * Retrieve the commit time as a unix timestamp.
      *
      *
      */
    def timeMs(): Double = js.native
    def timeOffset(): Double = js.native
    def tree(treeOut: Tree): Double = js.native
    def treeId(): Oid = js.native
  }
  
  @js.native
  trait HistoryEventEmitter extends EventEmitter {
    def start(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Commit extends js.Object {
    def create(
      repo: Repository,
      updateRef: String,
      author: Signature,
      committer: Signature,
      messageEncoding: String,
      message: String,
      tree: Tree,
      parentCount: Double,
      parents: js.Array[_]
    ): Oid = js.native
    def createV(
      id: Oid,
      repo: Repository,
      updateRef: String,
      author: Signature,
      committer: Signature,
      messageEncoding: String,
      message: String,
      tree: Tree,
      parentCount: Double
    ): Double = js.native
    def createWithSignature(repo: Repository, commitContent: String, signature: String, signatureField: String): js.Promise[Oid] = js.native
    /**
      * Retrieves the commit pointed to by the oid
      *
      *
      */
    def lookup(repo: Repository, id: String): js.Promise[Commit] = js.native
    def lookup(repo: Repository, id: Commit): js.Promise[Commit] = js.native
    def lookup(repo: Repository, id: Oid): js.Promise[Commit] = js.native
    def lookupPrefix(repo: Repository, id: Oid, len: Double): js.Promise[Commit] = js.native
  }
  
}

