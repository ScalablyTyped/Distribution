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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rebaseMod {
  
  @JSImport("nodegit/rebase", "Rebase")
  @js.native
  class Rebase () extends StObject {
    
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
    
    @JSImport("nodegit/rebase", "Rebase.init")
    @js.native
    def init(repo: Repository, branch: AnnotatedCommit, upstream: AnnotatedCommit, onto: AnnotatedCommit): js.Promise[Rebase] = js.native
    @JSImport("nodegit/rebase", "Rebase.init")
    @js.native
    def init(
      repo: Repository,
      branch: AnnotatedCommit,
      upstream: AnnotatedCommit,
      onto: AnnotatedCommit,
      opts: RebaseOptions
    ): js.Promise[Rebase] = js.native
    
    @JSImport("nodegit/rebase", "Rebase.initOptions")
    @js.native
    def initOptions(opts: RebaseOptions, version: Double): Double = js.native
    
    @JSImport("nodegit/rebase", "Rebase.open")
    @js.native
    def open(repo: Repository): js.Promise[Rebase] = js.native
    @JSImport("nodegit/rebase", "Rebase.open")
    @js.native
    def open(repo: Repository, opts: RebaseOptions): js.Promise[Rebase] = js.native
  }
  
  @js.native
  trait RebaseOptions extends StObject {
    
    var checkoutOptions: CheckoutOptions = js.native
    
    var quiet: Double = js.native
    
    var rewriteNotesRef: String = js.native
    
    var version: Double = js.native
  }
  object RebaseOptions {
    
    @scala.inline
    def apply(checkoutOptions: CheckoutOptions, quiet: Double, rewriteNotesRef: String, version: Double): RebaseOptions = {
      val __obj = js.Dynamic.literal(checkoutOptions = checkoutOptions.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], rewriteNotesRef = rewriteNotesRef.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RebaseOptions]
    }
    
    @scala.inline
    implicit class RebaseOptionsMutableBuilder[Self <: RebaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckoutOptions(value: CheckoutOptions): Self = StObject.set(x, "checkoutOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuiet(value: Double): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewriteNotesRef(value: String): Self = StObject.set(x, "rewriteNotesRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
