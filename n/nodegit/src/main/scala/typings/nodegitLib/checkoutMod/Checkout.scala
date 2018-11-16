package typings
package nodegitLib.checkoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/checkout", "Checkout")
@js.native
class Checkout () extends js.Object

@JSImport("nodegit/checkout", "Checkout")
@js.native
object Checkout extends js.Object {
  /**
       * Patch head checkout to automatically coerce objects.
       */
  def head(repo: nodegitLib.repositoryMod.Repository): stdLib.Promise[scala.Unit] = js.native
  /**
       * Patch head checkout to automatically coerce objects.
       */
  def head(
    repo: nodegitLib.repositoryMod.Repository,
    options: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): stdLib.Promise[scala.Unit] = js.native
  /**
       * Patch index checkout to automatically coerce objects.
       */
  def index(repo: nodegitLib.repositoryMod.Repository, The: nodegitLib.nodegitMod.Index): stdLib.Promise[scala.Unit] = js.native
  /**
       * Patch index checkout to automatically coerce objects.
       */
  def index(
    repo: nodegitLib.repositoryMod.Repository,
    The: nodegitLib.nodegitMod.Index,
    options: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): stdLib.Promise[scala.Unit] = js.native
  def initOptions(opts: nodegitLib.checkoutDashOptionsMod.CheckoutOptions, version: scala.Double): scala.Double = js.native
  /**
       * Patch tree checkout to automatically coerce objects.
       */
  def tree(repo: nodegitLib.repositoryMod.Repository, treeish: nodegitLib.commitMod.Commit): stdLib.Promise[scala.Unit] = js.native
  /**
       * Patch tree checkout to automatically coerce objects.
       */
  def tree(
    repo: nodegitLib.repositoryMod.Repository,
    treeish: nodegitLib.commitMod.Commit,
    options: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): stdLib.Promise[scala.Unit] = js.native
  /**
       * Patch tree checkout to automatically coerce objects.
       */
  def tree(repo: nodegitLib.repositoryMod.Repository, treeish: nodegitLib.oidMod.Oid): stdLib.Promise[scala.Unit] = js.native
  /**
       * Patch tree checkout to automatically coerce objects.
       */
  def tree(
    repo: nodegitLib.repositoryMod.Repository,
    treeish: nodegitLib.oidMod.Oid,
    options: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): stdLib.Promise[scala.Unit] = js.native
  /**
       * Patch tree checkout to automatically coerce objects.
       */
  def tree(repo: nodegitLib.repositoryMod.Repository, treeish: nodegitLib.referenceMod.Reference): stdLib.Promise[scala.Unit] = js.native
  /**
       * Patch tree checkout to automatically coerce objects.
       */
  def tree(
    repo: nodegitLib.repositoryMod.Repository,
    treeish: nodegitLib.referenceMod.Reference,
    options: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): stdLib.Promise[scala.Unit] = js.native
  /**
       * Patch tree checkout to automatically coerce objects.
       */
  def tree(repo: nodegitLib.repositoryMod.Repository, treeish: nodegitLib.treeMod.Tree): stdLib.Promise[scala.Unit] = js.native
  /**
       * Patch tree checkout to automatically coerce objects.
       */
  def tree(
    repo: nodegitLib.repositoryMod.Repository,
    treeish: nodegitLib.treeMod.Tree,
    options: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): stdLib.Promise[scala.Unit] = js.native
}

