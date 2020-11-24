package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Checkout")
@js.native
class Checkout ()
  extends typings.nodegit.checkoutMod.Checkout
/* static members */
@JSImport("nodegit", "Checkout")
@js.native
object Checkout extends js.Object {
  
  /**
    * Patch head checkout to automatically coerce objects.
    */
  def head(repo: typings.nodegit.repositoryMod.Repository): js.Promise[Unit] = js.native
  def head(
    repo: typings.nodegit.repositoryMod.Repository,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  
  /**
    * Patch index checkout to automatically coerce objects.
    */
  def index(repo: typings.nodegit.repositoryMod.Repository, The: Index): js.Promise[Unit] = js.native
  def index(
    repo: typings.nodegit.repositoryMod.Repository,
    The: Index,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  
  def initOptions(opts: typings.nodegit.checkoutOptionsMod.CheckoutOptions, version: Double): Double = js.native
  
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.commitMod.Commit): js.Promise[Unit] = js.native
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.commitMod.Commit,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  /**
    * Patch tree checkout to automatically coerce objects.
    */
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.oidMod.Oid): js.Promise[Unit] = js.native
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.oidMod.Oid,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.referenceMod.Reference): js.Promise[Unit] = js.native
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.referenceMod.Reference,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.treeMod.Tree): js.Promise[Unit] = js.native
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.treeMod.Tree,
    options: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
}
