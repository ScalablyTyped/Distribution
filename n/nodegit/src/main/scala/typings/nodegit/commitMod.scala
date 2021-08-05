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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commitMod {
  
  @JSImport("nodegit/commit", "Commit")
  @js.native
  class Commit () extends StObject {
    
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
  /* static members */
  object Commit {
    
    @JSImport("nodegit/commit", "Commit")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(
      repo: Repository,
      updateRef: String,
      author: Signature,
      committer: Signature,
      messageEncoding: String,
      message: String,
      tree: Tree,
      parentCount: Double,
      parents: js.Array[js.Any]
    ): Oid = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], updateRef.asInstanceOf[js.Any], author.asInstanceOf[js.Any], committer.asInstanceOf[js.Any], messageEncoding.asInstanceOf[js.Any], message.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], parentCount.asInstanceOf[js.Any], parents.asInstanceOf[js.Any])).asInstanceOf[Oid]
    
    inline def createV(
      id: Oid,
      repo: Repository,
      updateRef: String,
      author: Signature,
      committer: Signature,
      messageEncoding: String,
      message: String,
      tree: Tree,
      parentCount: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("createV")(id.asInstanceOf[js.Any], repo.asInstanceOf[js.Any], updateRef.asInstanceOf[js.Any], author.asInstanceOf[js.Any], committer.asInstanceOf[js.Any], messageEncoding.asInstanceOf[js.Any], message.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], parentCount.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def createWithSignature(repo: Repository, commitContent: String, signature: String, signatureField: String): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithSignature")(repo.asInstanceOf[js.Any], commitContent.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], signatureField.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    /**
      * Retrieves the commit pointed to by the oid
      *
      *
      */
    inline def lookup(repo: Repository, id: String): js.Promise[Commit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Commit]]
    inline def lookup(repo: Repository, id: Commit): js.Promise[Commit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Commit]]
    inline def lookup(repo: Repository, id: Oid): js.Promise[Commit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Commit]]
    
    inline def lookupPrefix(repo: Repository, id: Oid, len: Double): js.Promise[Commit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPrefix")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Commit]]
  }
  
  @js.native
  trait HistoryEventEmitter extends EventEmitter {
    
    def start(): Unit = js.native
  }
}
