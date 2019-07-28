package typings.nodegit.checkoutMod

import typings.nodegit.checkoutDashOptionsMod.CheckoutOptions
import typings.nodegit.commitMod.Commit
import typings.nodegit.nodegitMod.Index
import typings.nodegit.oidMod.Oid
import typings.nodegit.referenceMod.Reference
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.treeMod.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/checkout", "Checkout")
@js.native
class Checkout () extends js.Object

/* static members */
@JSImport("nodegit/checkout", "Checkout")
@js.native
object Checkout extends js.Object {
  /**
    * Patch head checkout to automatically coerce objects.
    */
  def head(repo: Repository): js.Promise[Unit] = js.native
  def head(repo: Repository, options: CheckoutOptions): js.Promise[Unit] = js.native
  /**
    * Patch index checkout to automatically coerce objects.
    */
  def index(repo: Repository, The: Index): js.Promise[Unit] = js.native
  def index(repo: Repository, The: Index, options: CheckoutOptions): js.Promise[Unit] = js.native
  def initOptions(opts: CheckoutOptions, version: Double): Double = js.native
  def tree(repo: Repository, treeish: Commit): js.Promise[Unit] = js.native
  def tree(repo: Repository, treeish: Commit, options: CheckoutOptions): js.Promise[Unit] = js.native
  /**
    * Patch tree checkout to automatically coerce objects.
    */
  def tree(repo: Repository, treeish: Oid): js.Promise[Unit] = js.native
  def tree(repo: Repository, treeish: Oid, options: CheckoutOptions): js.Promise[Unit] = js.native
  def tree(repo: Repository, treeish: Reference): js.Promise[Unit] = js.native
  def tree(repo: Repository, treeish: Reference, options: CheckoutOptions): js.Promise[Unit] = js.native
  def tree(repo: Repository, treeish: Tree): js.Promise[Unit] = js.native
  def tree(repo: Repository, treeish: Tree, options: CheckoutOptions): js.Promise[Unit] = js.native
}

