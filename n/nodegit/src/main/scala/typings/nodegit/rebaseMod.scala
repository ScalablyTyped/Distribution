package typings.nodegit

import typings.nodegit.annotatedCommitMod.AnnotatedCommit
import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.mod.Index
import typings.nodegit.mod.MergeOptions
import typings.nodegit.mod.Tree
import typings.nodegit.oidMod.Oid
import typings.nodegit.rebaseOperationMod.RebaseOperation
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rebaseMod {
  
  @JSImport("nodegit/rebase", "Rebase")
  @js.native
  open class Rebase () extends StObject {
    
    def abort(): Double = js.native
    
    def commit(author: Null, committer: Signature): js.Promise[Oid] = js.native
    def commit(author: Null, committer: Signature, messageEncoding: String): js.Promise[Oid] = js.native
    def commit(author: Null, committer: Signature, messageEncoding: String, message: String): js.Promise[Oid] = js.native
    def commit(author: Null, committer: Signature, messageEncoding: Null, message: String): js.Promise[Oid] = js.native
    def commit(author: Null, committer: Signature, messageEncoding: Unit, message: String): js.Promise[Oid] = js.native
    def commit(author: Unit, committer: Signature): js.Promise[Oid] = js.native
    def commit(author: Unit, committer: Signature, messageEncoding: String): js.Promise[Oid] = js.native
    def commit(author: Unit, committer: Signature, messageEncoding: String, message: String): js.Promise[Oid] = js.native
    def commit(author: Unit, committer: Signature, messageEncoding: Null, message: String): js.Promise[Oid] = js.native
    def commit(author: Unit, committer: Signature, messageEncoding: Unit, message: String): js.Promise[Oid] = js.native
    def commit(author: Signature, committer: Signature): js.Promise[Oid] = js.native
    def commit(author: Signature, committer: Signature, messageEncoding: String): js.Promise[Oid] = js.native
    def commit(author: Signature, committer: Signature, messageEncoding: String, message: String): js.Promise[Oid] = js.native
    def commit(author: Signature, committer: Signature, messageEncoding: Null, message: String): js.Promise[Oid] = js.native
    def commit(author: Signature, committer: Signature, messageEncoding: Unit, message: String): js.Promise[Oid] = js.native
    
    def finish(): Double = js.native
    def finish(signature: Signature): Double = js.native
    
    def inmemoryIndex(index: Index): Double = js.native
    
    def next(): js.Promise[RebaseOperation] = js.native
    
    def operationByIndex(idx: Double): RebaseOperation = js.native
    
    def operationCurrent(): Double = js.native
    
    def operationEntrycount(): Double = js.native
  }
  /* static members */
  object Rebase {
    
    @JSImport("nodegit/rebase", "Rebase")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(
      repo: Repository,
      branch: js.UndefOr[AnnotatedCommit | Null],
      upstream: js.UndefOr[AnnotatedCommit | Null],
      onto: js.UndefOr[AnnotatedCommit | Null],
      opts: js.UndefOr[RebaseOptions[Any] | Null]
    ): js.Promise[Rebase] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(repo.asInstanceOf[js.Any], branch.asInstanceOf[js.Any], upstream.asInstanceOf[js.Any], onto.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Rebase]]
    
    inline def initOptions(opts: RebaseOptions[Any], version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def open(repo: Repository): js.Promise[Rebase] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Rebase]]
    inline def open(repo: Repository, opts: RebaseOptions[Any]): js.Promise[Rebase] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Rebase]]
  }
  
  trait RebaseOptions[PayloadType] extends StObject {
    
    var checkoutOptions: js.UndefOr[CheckoutOptions | Null] = js.undefined
    
    var commitCreateCb: js.UndefOr[
        (js.Function8[
          /* author */ Signature, 
          /* committer */ Signature, 
          /* message_encoding */ String, 
          /* message */ String, 
          /* tree */ Tree, 
          /* parent_count */ Double, 
          /* parents */ js.Array[Oid], 
          /* payload */ js.UndefOr[PayloadType], 
          Oid
        ]) | Null
      ] = js.undefined
    
    var inmemory: js.UndefOr[Double | Null] = js.undefined
    
    var mergeOptions: js.UndefOr[MergeOptions | Null] = js.undefined
    
    var payload: js.UndefOr[PayloadType | Null] = js.undefined
    
    var quiet: js.UndefOr[Double | Null] = js.undefined
    
    var rewriteNotesRef: js.UndefOr[String | Null] = js.undefined
    
    var version: js.UndefOr[Double | Null] = js.undefined
  }
  object RebaseOptions {
    
    inline def apply[PayloadType](): RebaseOptions[PayloadType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RebaseOptions[PayloadType]]
    }
    
    extension [Self <: RebaseOptions[?], PayloadType](x: Self & RebaseOptions[PayloadType]) {
      
      inline def setCheckoutOptions(value: CheckoutOptions): Self = StObject.set(x, "checkoutOptions", value.asInstanceOf[js.Any])
      
      inline def setCheckoutOptionsNull: Self = StObject.set(x, "checkoutOptions", null)
      
      inline def setCheckoutOptionsUndefined: Self = StObject.set(x, "checkoutOptions", js.undefined)
      
      inline def setCommitCreateCb(
        value: (/* author */ Signature, /* committer */ Signature, /* message_encoding */ String, /* message */ String, /* tree */ Tree, /* parent_count */ Double, /* parents */ js.Array[Oid], /* payload */ js.UndefOr[PayloadType]) => Oid
      ): Self = StObject.set(x, "commitCreateCb", js.Any.fromFunction8(value))
      
      inline def setCommitCreateCbNull: Self = StObject.set(x, "commitCreateCb", null)
      
      inline def setCommitCreateCbUndefined: Self = StObject.set(x, "commitCreateCb", js.undefined)
      
      inline def setInmemory(value: Double): Self = StObject.set(x, "inmemory", value.asInstanceOf[js.Any])
      
      inline def setInmemoryNull: Self = StObject.set(x, "inmemory", null)
      
      inline def setInmemoryUndefined: Self = StObject.set(x, "inmemory", js.undefined)
      
      inline def setMergeOptions(value: MergeOptions): Self = StObject.set(x, "mergeOptions", value.asInstanceOf[js.Any])
      
      inline def setMergeOptionsNull: Self = StObject.set(x, "mergeOptions", null)
      
      inline def setMergeOptionsUndefined: Self = StObject.set(x, "mergeOptions", js.undefined)
      
      inline def setPayload(value: PayloadType): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadNull: Self = StObject.set(x, "payload", null)
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setQuiet(value: Double): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietNull: Self = StObject.set(x, "quiet", null)
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setRewriteNotesRef(value: String): Self = StObject.set(x, "rewriteNotesRef", value.asInstanceOf[js.Any])
      
      inline def setRewriteNotesRefNull: Self = StObject.set(x, "rewriteNotesRef", null)
      
      inline def setRewriteNotesRefUndefined: Self = StObject.set(x, "rewriteNotesRef", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
