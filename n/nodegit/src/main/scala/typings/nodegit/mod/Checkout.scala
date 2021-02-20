package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Checkout")
@js.native
class Checkout ()
  extends typings.nodegit.checkoutMod.Checkout
/* static members */
object Checkout {
  
  /**
    * Patch head checkout to automatically coerce objects.
    */
  @JSImport("nodegit", "Checkout.head")
  @js.native
  def head(repo: typings.nodegit.repositoryMod.Repository): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.head")
  @js.native
  def head(
    repo: typings.nodegit.repositoryMod.Repository,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  
  /**
    * Patch index checkout to automatically coerce objects.
    */
  @JSImport("nodegit", "Checkout.index")
  @js.native
  def index(repo: typings.nodegit.repositoryMod.Repository, The: Index): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.index")
  @js.native
  def index(
    repo: typings.nodegit.repositoryMod.Repository,
    The: Index,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  
  @JSImport("nodegit", "Checkout.initOptions")
  @js.native
  def initOptions(opts: typings.nodegit.checkoutOptionsMod.CheckoutOptions, version: Double): Double = js.native
  
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.commitMod.Commit): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.commitMod.Commit,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  /**
    * Patch tree checkout to automatically coerce objects.
    */
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.oidMod.Oid): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.oidMod.Oid,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.referenceMod.Reference): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.referenceMod.Reference,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.treeMod.Tree): js.Promise[Unit] = js.native
  @JSImport("nodegit", "Checkout.tree")
  @js.native
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.treeMod.Tree,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
}
