package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Checkout")
@js.native
class Checkout ()
  extends nodegitLib.checkoutMod.Checkout

/* static members */
@JSImport("nodegit", "Checkout")
@js.native
object Checkout extends js.Object {
  /**
    * Patch head checkout to automatically coerce objects.
    */
  def head(repo: nodegitLib.repositoryMod.Repository): js.Promise[scala.Unit] = js.native
  def head(
    repo: nodegitLib.repositoryMod.Repository,
    options: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[scala.Unit] = js.native
  /**
    * Patch index checkout to automatically coerce objects.
    */
  def index(repo: nodegitLib.repositoryMod.Repository, The: nodegitLib.nodegitMod.Index): js.Promise[scala.Unit] = js.native
  def index(
    repo: nodegitLib.repositoryMod.Repository,
    The: nodegitLib.nodegitMod.Index,
    options: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[scala.Unit] = js.native
  def initOptions(opts: nodegitLib.checkoutDashOptionsMod.CheckoutOptions, version: scala.Double): scala.Double = js.native
  def tree(repo: nodegitLib.repositoryMod.Repository, treeish: nodegitLib.commitMod.Commit): js.Promise[scala.Unit] = js.native
  def tree(
    repo: nodegitLib.repositoryMod.Repository,
    treeish: nodegitLib.commitMod.Commit,
    options: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[scala.Unit] = js.native
  /**
    * Patch tree checkout to automatically coerce objects.
    */
  def tree(repo: nodegitLib.repositoryMod.Repository, treeish: nodegitLib.oidMod.Oid): js.Promise[scala.Unit] = js.native
  def tree(
    repo: nodegitLib.repositoryMod.Repository,
    treeish: nodegitLib.oidMod.Oid,
    options: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[scala.Unit] = js.native
  def tree(repo: nodegitLib.repositoryMod.Repository, treeish: nodegitLib.referenceMod.Reference): js.Promise[scala.Unit] = js.native
  def tree(
    repo: nodegitLib.repositoryMod.Repository,
    treeish: nodegitLib.referenceMod.Reference,
    options: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[scala.Unit] = js.native
  def tree(repo: nodegitLib.repositoryMod.Repository, treeish: nodegitLib.treeMod.Tree): js.Promise[scala.Unit] = js.native
  def tree(
    repo: nodegitLib.repositoryMod.Repository,
    treeish: nodegitLib.treeMod.Tree,
    options: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[scala.Unit] = js.native
}

