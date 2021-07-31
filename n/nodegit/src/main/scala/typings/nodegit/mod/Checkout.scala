package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Checkout")
@js.native
class Checkout ()
  extends typings.nodegit.checkoutMod.Checkout
/* static members */
object Checkout {
  
  @JSImport("nodegit", "Checkout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Patch head checkout to automatically coerce objects.
    */
  @scala.inline
  def head(repo: typings.nodegit.repositoryMod.Repository): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def head(
    repo: typings.nodegit.repositoryMod.Repository,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(repo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Patch index checkout to automatically coerce objects.
    */
  @scala.inline
  def index(repo: typings.nodegit.repositoryMod.Repository, The: Index): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(repo.asInstanceOf[js.Any], The.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def index(
    repo: typings.nodegit.repositoryMod.Repository,
    The: Index,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(repo.asInstanceOf[js.Any], The.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def initOptions(opts: typings.nodegit.checkoutOptionsMod.CheckoutOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.commitMod.Commit): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.commitMod.Commit,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  /**
    * Patch tree checkout to automatically coerce objects.
    */
  @scala.inline
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.oidMod.Oid): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.oidMod.Oid,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.referenceMod.Reference): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.referenceMod.Reference,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.treeMod.Tree): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.treeMod.Tree,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
