package typings.nodegit

import typings.nodegit.annotatedCommitMod.AnnotatedCommit
import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.mod.Index
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
    
    def commit(author: Signature, committer: Signature, messageEncoding: String, message: String): Oid = js.native
    
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
    
    inline def init(repo: Repository, branch: AnnotatedCommit, upstream: AnnotatedCommit, onto: AnnotatedCommit): js.Promise[Rebase] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(repo.asInstanceOf[js.Any], branch.asInstanceOf[js.Any], upstream.asInstanceOf[js.Any], onto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Rebase]]
    inline def init(
      repo: Repository,
      branch: AnnotatedCommit,
      upstream: AnnotatedCommit,
      onto: AnnotatedCommit,
      opts: RebaseOptions
    ): js.Promise[Rebase] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(repo.asInstanceOf[js.Any], branch.asInstanceOf[js.Any], upstream.asInstanceOf[js.Any], onto.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Rebase]]
    
    inline def initOptions(opts: RebaseOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def open(repo: Repository): js.Promise[Rebase] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Rebase]]
    inline def open(repo: Repository, opts: RebaseOptions): js.Promise[Rebase] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Rebase]]
  }
  
  trait RebaseOptions extends StObject {
    
    var checkoutOptions: CheckoutOptions
    
    var quiet: Double
    
    var rewriteNotesRef: String
    
    var version: Double
  }
  object RebaseOptions {
    
    inline def apply(checkoutOptions: CheckoutOptions, quiet: Double, rewriteNotesRef: String, version: Double): RebaseOptions = {
      val __obj = js.Dynamic.literal(checkoutOptions = checkoutOptions.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], rewriteNotesRef = rewriteNotesRef.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RebaseOptions]
    }
    
    extension [Self <: RebaseOptions](x: Self) {
      
      inline def setCheckoutOptions(value: CheckoutOptions): Self = StObject.set(x, "checkoutOptions", value.asInstanceOf[js.Any])
      
      inline def setQuiet(value: Double): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setRewriteNotesRef(value: String): Self = StObject.set(x, "rewriteNotesRef", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
